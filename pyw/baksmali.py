"""
Wrapper to `baksmali` binary
"""
import subprocess


class BaksmaliCmd:
    def __init__(self):
        self.__dex = None
        self.__output = None

    def dex(self, dex):
        self.__dex = dex
        return self

    def output(self, output):
        self.__output = output
        return self

    def run(self):
        cmd = ["baksmali"]

        if self.__dex is None:
            raise Exception("self.dex must not be None!")
        cmd.append("disassemble")
        cmd.append(self.__dex)

        if self.__output is not None:
            cmd.extend(["-o", self.__output])

        subprocess.call(cmd)
