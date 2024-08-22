# Process Address Space

* Each process has its own virtual address space.
* The kernel maps the process address space to the kernel address space.
* The kernel maps the kernel address space to the physical memory.

## Process Address Space

* The process address space is divided into two parts:
  * The user part
  * The kernel part

### User Part

* The user part is the part of the process address space that is visible to the user.
* The user part is mapped to the user part of the kernel address space.

### Kernel Part

* The kernel part is the part of the process address space that is visible to the kernel.
* The kernel part is mapped to the kernel part of the kernel address space.

