# Matplotlib is easy to use and an amazing visualizing library in Python.
# It is built on NumPy arrays and designed to work with the broader SciPy stack and consists of several plots like line, bar, scatter, histogram, etc. 


# # importing libraries 
# import matplotlib.pyplot as plt 
# import numpy as np 

# x = np.linspace(0.1, 2 * np.pi, 41) 
# y = np.exp(np.sin(x)) 

# plt.stem(x, y)
# # plt.stem(x, y, use_line_collection = True) 
# plt.show() 


import matplotlib.pyplot as plt 
x = [1, 2, 3, 4, 5]
y = [1, 4, 9, 16, 25]
z = [1, 8, 27, 64, 125]
# Creating the figure object
fig = plt.figure()
# keeping the projection = 3d
# creates the 3d plot
ax = plt.axes(projection = '3d')
ax.plot3D(z, y, x)

plt.show()


