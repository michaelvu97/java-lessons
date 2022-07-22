import java.util.*;

public class Main {
  public static void main(String[] args) {
    if (args.length != 1)
      throw new IllegalArgumentException("Must specify a lesson to run.");
    
    String lessonName = args[0];

    Main main = new Main();
    main.RunLesson(lessonName);
  }
  
  private void RunLesson(String name) {
    if (name.equals("lesson1")) {
      RunLesson1();
      return;
    }



    throw new IllegalArgumentException("Lesson " + name + " not found");
  }

  /////////////////////////////////////////////////////////////////////////////
  //                               Lesson1
  /////////////////////////////////////////////////////////////////////////////
  private static void RunLesson1(){
    //
    //                             MEMORY
    // ------------------------------------------------------------------------
    // In order for a computer program to be useful, it must have the ability
    // to **store data in memory**. 
    //
    // *Random Access Memory (RAM)*:
    //   Has discrete slots, from which you can read/write data.
    //
    //   Slots are located using a "memory address": an integer indicating 
    //   the unique slot position.
    // 
    // Example:
    //   Let's say we have only 6 slots in our memory, initialized as 0s:
    //     [0, 0, 0, 0, 0, 0] <- memory with zero'd out data in each slot
    //      0  1  2  3  4  5  <- address of each slot
    //
    //   If we *write* the value 30 at address 1, our memory would then be:
    //     [0, 30, 0, 0, 0, 0] 
    //      0   1  2  3  4  5
    //
    //   If we *read* the value at address 4, we would receive 0.
    //   If we *read* the value at address 1, we would receive 30.  
    //
    // Java Program Memory:
    //   When you run a java program, it gets its own, private region of memory.
    //
    //   `memory region` could also be called `memory range`, because it is
    //    defined by its start address and end address.
    //
    //   Integers are unique addresses.
    //
    //   Each address points to 1 byte of information in memory 
    //   
    //   1 byte = (8 bits, eg. b00010110)
    //   1 bit = smallest logical unit of memory: {0, 1}
    //
    //   The program can write whatever it wants to its private region of 
    //   memory, but the amount of memory is not always large. 
    //
    //   Java's Main Features:
    //     *Run it on any device!*
    //     *Don't worry about _managing_ the program's memory!*
    //
    //   Managing Memory:
    //     Memory is a scarce resource. It's also easy to mess up. 
    //
    //     If a bug in a program accidentally overwrites, loses, or mismanages 
    //     its data, the program is likely to misbehave or fail.
    //
    //     Memory management systems (like the one offered by Java) gives a
    //     layer of protection between the memory and the program 
    //     developer (you).
    //
    //
    //
    // EXERCISES:
    // 
    //   1. Let R = memory range defined by addresses [10, 15]
    //     1.1 How many bytes of information could be stored in R?
    //     1.2 How many bits of information could be stored in R?
    //     1.3 How many unique numbers could be represented by the bits in R?
    //
    //   2. "Don't worry about managing the program's memory!"
    //     2.1 Why would you want that?
    //     2.2 When would you not?
    //
    //   
    //
    //                             WHY JAVA?
    // ------------------------------------------------------------------------
    // 
  }
}
