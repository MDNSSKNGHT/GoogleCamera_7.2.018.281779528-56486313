"""
Wrapper to `gradlew` script
"""
import subprocess


class GradlewCmd:
    def __init__(self):
        self.__task = None

    def task(self, task):
        self.__task = task

    def run(self):
        cmd = ["./gradlew"]

        if self.__task is not None:
            cmd.append(self.__task)

        subprocess.call(cmd)
