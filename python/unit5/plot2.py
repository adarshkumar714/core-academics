import matplotlib.pyplot as plt
from mpl_toolkits.mplot3d import Axes3D

fig = plt.figure()
ax = plt.axes(projection='3d')

food = ['Meat','Banana','Apple','Orange','Tomato']
calories = [130,250,140,120,20]
potassium =[40,55,20,30,40]
fat =[8,5,3,6,1]

ax.set_xlabel('calories')
ax.set_ylabel('potassium')
ax.set_zlabel('fat')

ax.scatter(calories,potassium,fat)

for i in range(len(food)):
    ax.text(calories[i],potassium[i],fat[i],food[i])
    
plt.show()


