import tkinter as tk

def add():
    result.set(float(entry1.get()) + float(entry2.get()))

root = tk.Tk()
root.title("Simple Calculator")

entry1 = tk.Entry(root)
entry1.pack()

entry2 = tk.Entry(root)
entry2.pack()

result = tk.StringVar()
result_label = tk.Label(root, textvariable=result)
result_label.pack()

add_button = tk.Button(root, text="Add", command=add)
add_button.setvar()
add_button.pack()

root.mainloop()