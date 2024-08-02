# Tkinter is the most commonly used library for developing GUI (Graphical User Interface) in Python.
# It is a standard Python interface to the Tk GUI toolkit shipped with Python. As Tk and Tkinter are available on most of the Unix platforms as well as on the Windows system, developing GUI applications with Tkinter becomes the fastest and easiest.


import tkinter as tk

# Create the main window
root = tk.Tk()

# Set the window title
root.title("My First GUI")

# Create a label widget
label = tk.Label(root, text="Hello, Tkinter!")
label.pack()

# Start the event loop
root.mainloop()
