def count(s):
    for str in s.split():
        s = "&".join(str)
    
    return s

print(count('python is fun to learn.'))