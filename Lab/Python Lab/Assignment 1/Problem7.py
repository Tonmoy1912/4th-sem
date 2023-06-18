'''
7. Write a function findfiles that recursively descends the directory tree for the specified 
directory and generates paths of all the files in the tree.
'''

import os

def find_files(directory):
    file_paths = []
    for root, dirs, files in os.walk(directory):
        for file in files:
            file_path = os.path.join(root, file)
            file_paths.append(file_path)
    return file_paths

# Test the function
directory_path = '/Python'
files = find_files(directory_path)
for file in files:
    print(file)
