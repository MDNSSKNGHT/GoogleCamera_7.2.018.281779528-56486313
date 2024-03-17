#!/usr/bin/env bash
# This script build the AS project, then extracts the indicated smali
# files to replace them accordingly in the decompiled target APK.

set -e

main() {
  local intermediates_dir="app/build/intermediates"
  local disassemble_dir="/tmp/7.2.018-AS-dex-dump"
  local target_apk_dir="$HOME/workspace/GoogleCamera_7.2.018.281779528-56486313"

  rm -r "$disassemble_dir" || true
  mkdir "$disassemble_dir" || true

  pushd "$target_apk_dir" || exit
  git reset --hard HEAD
  git clean -df
  popd || exit

  ./gradlew mergeDexDebug
  baksmali disassemble "$intermediates_dir/dex/debug/mergeDexDebug/classes.dex" -o "$disassemble_dir"

  export TARGET_APK_DIR="$target_apk_dir"
  export DISASSEMBLY_DIR="$disassemble_dir"

  find "$disassemble_dir"/defpackage -name "*.smali" -exec sed -i 's/defpackage\///g' {} \;
  find "$disassemble_dir"/defpackage -name "*.smali" -exec sh -c '
    CURRENT_SMALI_FILE=$1
    TARGET_SMALI_FILES=()

    for target in ${TARGET_SMALI_FILES[@]}; do
      if [[ "${CURRENT_SMALI_FILE##*/}" == "$target" ]]; then
        if [[ "$CURRENT_SMALI_FILE" =~ defpackage ]]; then
          cp "$CURRENT_SMALI_FILE" "$TARGET_APK_DIR"/smali
        else
          cp $CURRENT_SMALI_FILE "$TARGET_APK_DIR"/smali/"${CURRENT_SMALI_FILE#"$DISASSEMBLY_DIR/"}"
        fi
      fi
    done
  ' sh {} \;

  apktool build --use-aapt1 "$target_apk_dir" ; uber-apk-signer -a "$target_apk_dir"/dist --overwrite
}

main "$@"