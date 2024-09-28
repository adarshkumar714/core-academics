# Bare Machine and Resident Monitor
ref: https://www.geeksforgeeks.org/bare-machine-and-resident-monitor/

### Bare Machine
* Bare Machine is a hardware system that executes programs in the processor without using any Operating System.
* User directly interacts with hardware.

### Resident Monitor
* Resident Monitor is a code that runs on Bare Machine.
* The resident monitor works as an operating system that controls the instructions and performs all necessary functions.
* It also works like job sequencer because it also sequences the job and sends them to the processor.
* There will be no gap between program execution and the processing, it is going to be fast.

**Resident monitors are divided into 4 parts**
* Control Language Interpreter: Read and carry out the instruction from one level to the next level.
* Loader: Loads all the necessary system and application programs in the main memory.
* Device Driver: Manages the connected input-output devices to the system. (Interface between user and the system)
* Interrupt Processing: It processes all the occured interrupts to the system.




