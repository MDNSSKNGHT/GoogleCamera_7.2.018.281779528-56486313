"""
Wrapper to `apktool` binary
"""
import subprocess


class ApktoolCmd:
    def __init__(self):
        self.__cmd = None

    def __command(self, command):
        self.__cmd = command

    def __run(self):
        cmd = ["apktool"]

        if self.__cmd is None:
            raise Exception("self.__cmd must not be None!")
        cmd.extend(self.__cmd)

        subprocess.call(cmd)

    def build(self, app_path):
        cmd = ["build"]

        if app_path == "":
            raise Exception("app_path must not be empty")
        cmd.append(app_path)

        self.__command(cmd)
        self.__run()
