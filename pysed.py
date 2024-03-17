__author__ = 'Mahmoud Adel <mahmoud.adel2@gmail.com>'
__version__ = 0.4
__license__ = "The MIT License (MIT)"

import re


def replace(old_str, new_str, infile):
    """
    Sed-like Replace function.
    Usage: pysed.replace(<Old string>, <Replacement String>, <Text File>)
    Example: pysed.replace('xyz', 'XYZ', '/path/to/file.txt')
    """
    line_list = []
    with open(infile) as f:
        for item in f:
            new_item = re.sub(old_str, new_str, item)
            line_list.append(new_item)
    with open(infile, "w") as f:
        f.truncate()
        for line in line_list:
            f.writelines(line)


def rm_line_match(old_str, infile):
    """
    Sed-like line deletion function based on given string.
    Usage: pysed.rm_line_match(<Unwanted string>, <Text File>)
    Example: pysed.rm_line_match('xyz', '/path/to/file.txt')

    This will dump the output to STDOUT instead of changing the input file.
    Example 'DRYRUN': pysed.rm_line_match('xyz', '/path/to/file.txt', dryrun=True)
    """
    line_list = []
    with open(infile) as f:
        for item in f:
            rm_item = re.match(r'.*{}'.format(old_str), item)
            if type(rm_item) is type(None):
                line_list.append(item)
    with open(infile, "w") as f:
        f.truncate()
        for line in line_list:
            f.writelines(line)


def rm_line_number(line_number, infile):
    """
    Sed-like line deletion function based on given line number.
    Usage: pysed.rm_line_number(<Unwanted Line Number>, <Text File>)
    Example: pysed.rm_line_number(10, '/path/to/file.txt')

    This will dump the output to STDOUT instead of changing the input file.
    Example 'DRYRUN': pysed.rm_line_number(10, '/path/to/file.txt', dryrun=True)
    """
    line_list = []
    line_counter = 0
    if type(line_number) is not type(line_counter):
        exit("'line_number' argument must be an integer.")
    with open(infile) as f:
        for item in f:
            line_counter = line_counter + 1
            if line_counter is not line_number:
                line_list.append(item)
    with open(infile, "w") as f:
        f.truncate()
        for line in line_list:
            f.writelines(line)
