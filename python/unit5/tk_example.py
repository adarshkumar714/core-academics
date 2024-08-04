# Tkinter is the most commonly used library for developing GUI (Graphical User Interface) in Python.
# It is a standard Python interface to the Tk GUI toolkit shipped with Python. As Tk and Tkinter are available on most of the Unix platforms as well as on the Windows system, developing GUI applications with Tkinter becomes the fastest and easiest.

import tkinter as tk

root = tk.Tk()

root.geometry("500x500")
root.title("My first GUI using tkinter!")

label = tk.Label(root, text='Hello!', font=('Arial', 20))
# label.pack(padx=40, pady=100)
label.pack(pady=20)

textbox = tk.Text(root, height=3, font=('Arial', 20))
textbox.pack(padx=10)

entry = tk.Entry(root)
entry.pack(pady=10)

button = tk.Button(root, text='click me!', font=('Arial', 20))
button.pack()


root.mainloop()





