
# Memory Allocation Techniques
* This is used to store the data and manage the processes in the main memory.
* Main memory is divided into non-overlapping memory regions called partitions.

## The main memory can be broadly allocated in two ways
1. Contiguous memory allocation
2. Non-Contiguous memory allocation 

### 1. Contiguous memory allocation
In this technique we assign contiguous memory blocks to each task.

***Advantage***
* Easy to Implement (becasue not using pointers or any indexes)
* Excellent read performance (because all the data is stored together in contiguous manner)

***Diadvantage***
* Disk will become fragmented (internal and external)
* major problem - external fragmentation
* Difficult to grow file

***Types of contiguous memory allocatino***
1. Fixed (or static) partition scheme
2. Variable (os dynamic) partition scheme.

#### 1.1 Fixed (or static) partition scheme
In this technique main memory is divided into fixed number of partitions.
<br>
Each partition is typically allocated at system boot time
<br>
Number of partitions is fixed but size of each partitions is not fixed
<br>

***for example:-***
* memory block -> [OS] [4kb] [8kb] [8kb] [16kb]
* memroy block -> [OS] [8kb] [8kb] [8kb] [8kb]
<br>
Here both memory blocks come under fixed partitions as number of partitions are same i.e. 4 but size of each partitions may not be same.

One partitions is allocated to one process only.
No process can occupy more than one partitions.
(size of each process should be smaller or equal to size of partition)

***Flaws***
* Internal fragementation
* Limit in process size (32kb process can't be allocated to partitions of 16kb size if there is not 32kb partition)
* Limitation on degree of multiprogramming (this things says that main memory should contain maximum number of processes for efficient use of memory, but no. of partitions is fixed so no. of processes in main memory will be fixed)

#### 1.2 Variable (os dynamic) partition scheme.
* In this partitioning, partitions are made during run-time according to the process’s need instead of partitioning during system configuration.
* Size of the partitions will be equal to incoming process. (to avoid internal fregmentation and to ensure efficient utlization of RAM)
* No. of partitions is not fixed, it depends on no. of incomming processes and the main memory's size.

***for example:-***
* memory block -> [OS] [2mb] [4mb] [2mb] [8mb] [empty space of RAM]
* memory block -> [OS] [8mb] [16mb] [2mb] [empty space of RAM]

***Advantages***
* No internal fregmentation.
* No limitation on no. of processes.
* No limitation of process size.

***Disadvantages***
* A hole is created when a process is executed and frees his space from RAM.
* External fregmentation (due to holes).
* Complex allocation and deallocation (because there will be many process and holes in the main memory).


