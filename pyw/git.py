"""
Wrapper to `git` binary
"""
import subprocess


class GitCmd:
    def __init__(self):
        self.__cmd = None

    def __command(self, command):
        self.__cmd = command

    def __run(self, cwd):
        cmd = ["git"]

        if self.__cmd is None:
            raise Exception("self.__cmd must not be None!")
        cmd.extend(self.__cmd)

        if cwd == "":
            subprocess.call(cmd)
        else:
            subprocess.call(cmd, cwd=cwd)

    def reset(self, hard=False, commit="HEAD", cwd=""):
        cmd = ["reset"]

        if hard:
            cmd.append("--hard")
        cmd.append(commit)

        self.__command(cmd)
        self.__run(cwd)

    def clean(self, recurse=False, force=False, cwd=""):
        cmd = ["clean"]

        if recurse:
            cmd.append("-d")
        if force:
            cmd.append("-f")

        self.__command(cmd)
        self.__run(cwd)
