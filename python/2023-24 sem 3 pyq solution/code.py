# 1.e


# 1.c
def count(s):
    for str in s.split():
        s = "&".join(str)
    
    return s

print(count('python is fun to learn.'))


# 1.d
from mylibrary import hello
hello()

# 2.c
import math
def perfect_square(n):
    a = math.sqrt(n)
    if a**2 == n:
        return True
    else:
        return False

print(perfect_square(5))
print(perfect_square(4))


# slicing list
a = [1, 2, 3, 4, 5]
print(a[1:3]) # prints [2, 3]
print(a[1:]) # prints [2, 3, 4, 5]
print(a[:3]) # prints [1, 2, 3]

b = [1, 2, 3, 4, 5]
print(b[1::2]) # prints [2, 4]
print(b[::2]) # prints [1, 3, 5]
print(b[1::]) # prints [2, 4, 5]
print(b[::]) # prints [1, 2, 3, 4, 5]
print(b[1:3:2]) # prints [2, 4]
