# file = open("a.txt", "r")

# for line in file.readlines():
#     print(line)

# file.close()

with open('a.txt', 'r') as f:
    # print(f.read()) # reads whole file

    # print(f.read(10)) # reads 10 chars/bytes

    # print(f.readline()) # reads next line

    # print(f.readlines()) # returns array of all lines

    print(f.readline())
    f.seek(2)
    print(f.readline())
    print(f.readline())
    print(f.readline())











