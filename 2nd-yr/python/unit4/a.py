# a = ['5','6','6','7']
# file = open('a.txt', 'w')

# file.write('Hello')

# file.writelines(a)

# file.close()

# file = open('a.txt','r')

# # print(file.readlines()[0].strip())
# a = []
# while True:
#     line = file.readline()
#     if not line:
#         break
#     a.append(line)

# print(a)

# file.close()

# content = ''
# with open('a.txt', 'r+') as f:
#     content = f.read()

# with open('a.txt',  'w') as f:
#     content = ','.join(content)

#     f.write(content)

# def count(s):
#     print(s.split())
#     for str in s.split():
#         s = '&'.join(str)
#         return s

# print(count("python is fun to learn."))

# content = []
# with open('a.txt', 'r') as f:
#     content = f.read().split()

# print(max(content, key=len))

# max = 0
# i = 0
# idx = 0
# for word in content:
#     if len(word) > max:
#         idx = i
#         max = len(word)
#     i += 1
# print(max)
# print(content[idx])


# import os

# a = os.stat('a.txt')
# print(a.st_size)

# a = [1,5,7,7,23,23,4,6,7,22,3,3,21]

with open('a.txt', 'r+') as f:
    f.write('hi\n')
    # f.seek(0)
    print(f.tell())
    f.write('hello\n')
    f.seek(0)
    print(f.read())




