"""
Wrapper to `uber-apk-signer` binary
"""
import subprocess


class UberApkSignerCmd:
    def __init__(self):
        self.__apks = None
        self.__overwrite = None

    def apks(self, apks):
        self.__apks = apks

    def overwrite(self, overwrite):
        self.__overwrite = overwrite

    def run(self):
        cmd = ["uber-apk-signer"]

        if self.__apks is None:
            raise Exception("self.__apks must not be None!")
        cmd.extend(["--apks", self.__apks])

        if self.__overwrite:
            cmd.append("--overwrite")

        subprocess.call(cmd)
