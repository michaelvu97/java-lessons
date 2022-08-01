import java.util.*;

public class Main {
  public static void main(String[] args) {
    Main main = new Main();
    main.RunLesson2();
  }
  
  /////////////////////////////////////////////////////////////////////////////
  //                               Lesson1
  /////////////////////////////////////////////////////////////////////////////
  private void RunLesson1() {
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
    // There are many different programming languages available. What does Java
    // have to offer?
    //
    // Learning Curve:
    //   Java is simple, consistent, and approachable.
    //
    //   Using it effectively can take some practice and conceptual learning.
    //
    //   It provides a useful abstraction of the "under the hood" workings 
    //   of a compute program, and enables the programmer to work effectively
    //   within the constraints of the language's capabilities and strengths.
    //
    // Garbage Collection:
    //   If you allocate a part of your program memory (for example, to save
    //   a variable), it must eventually be freed up again. If it is not,
    //   the program is "leaking memory" and will eventually run out.
    //
    //   Java's runtime (ALL the code that executes when you run your Java 
    //   program) includes a "garbage collector" process, which will free up
    //   memory when it is no longer being used.
    //
    //   Note that it is still possible to run out of program memory even when
    //   the GC is used (for example, creating an infinite number of objects
    //   would eventually deplete the program memory).
    //
    // Object-Oriented Programming:
    //   OOP is a way of designing programs.
    //
    //   The programmer writes `class` code that define how an `object` should 
    //   behave.
    //
    //   The program generates an `instance` of the `class`, and writes its 
    //   instance data to memory.
    //
    //   An object instance's `state` can change over time.
    //
    //   The main advantage is that one programmer can use another programmer's
    //   class without having to fully understand _how_ it actually works.
    //  
    //   This is only usefuly if the _behaviour_ of a class is well-documented
    //   and understandable.
    //  
    // 
    //
    //                       STORING DATA IN MEMORY
    // ------------------------------------------------------------------------
    // All data in a Java program must be saved as a sequence of binary data.
    // What are the methods of encoding different information?
    //
    // Primitives vs References:
    //   If a variable contains a "Primitive Value", it means the variable's 
    //   bits store the raw value of the underlying data. This could be a 
    //   number, boolean, or anything else that can fit in ~8-32 bits.
    //
    //   If a variable contains a "Reference Value", it means that the 
    //   variable's bits store the **address** of a region of memory. The
    //   underlying data we want can be retrieved by reading from memory
    //   at that address.
    //   
    //
    // Boolean (Primitive):
    //   A `boolean` is a true or false (1 or 0) value. It can be stored as a 
    //   single bit of information.

    boolean isLearningFun = true;

    // Numbers (Primitive):
    //   Numbers are sequence of bits that encode a number. 
    //  
    //   Integers can be stored as a base 2 representation of an integer.
    //     E.x 01010 would be a 5-bit representation of the number 9.
    //
    //   Floating point numbers (non-integer approximations of real numbers)
    //   can be stored similar to scientific notation: N bits for the
    //   significant digits and M bits for the base 10 exponent. 
    //   The number 2.017 x 10 ^ 25 could be encoded as [2017, 25], and then
    //   those binary numbers written to memory.

    int numberOfOranges = 4424;
    float orangesPerPerson = 1.02E4f;

    // Characters (Primitive):
    //   A character is a single letter, e.g. 'k'.
    //  
    //   One simple way that characters are encoded into memory is using the
    //   ASCII dictionary, which contains letters, numbers, and special 
    //   characters. 
    //
    //  Each ASCII character can be encoded in 7 bits. This means that a
    //  character could be saved as a 7 bit integer.

    char thirdLetterOfTheAlphabet = 'c';

    //  Arrays (Reference):
    //    An array is a list of some data type. It is a sequence of bits in 
    //    memory, and contains N objects. If each object is M bits, then the
    //    whole array is representable as sequence of NxM bits.
    //
    //    Each item in the array can be located at the starting address plus
    //    an offset of (i x M bits), where i is the index of the item we want.

    int[] agesOfMyFriends = { 16, 18, 19 };
    System.out.println(agesOfMyFriends[0]); // Arrays start at the 0th element.
    System.out.println(agesOfMyFriends[1]);
    System.out.println(agesOfMyFriends[2]);
    // What would happen if we tried to access agesOfMyFriends[3] ?

    char[] myNewArray = new char[10];

    //   In the above statement:
    //     "new" means: reserve a section of memory for this array.
    //     [10] means: allocate 10 elements
    //     char means: each element of the array is a character data type
    //   
    //   After that line runs, what will be stored in the myNewArray variable?
    //
    //   The myNewArray variable is a reference. It is implemented by storing
    //   an address as an integer. In this case, it will be set to the address
    //   of the:
    //     *region of memory that was dynamically allocated for the array*.
    //
    //   The variable myNewArray does not contain the array data, it simply
    //   points to the location in memory where the array data is stored.

    int[] arrayA = { 1, 2, 3 };
    int[] arrayB = { 4, 5, 6 };

    int[] arrayC = arrayA;

    // How many bits is required to store the arrayC variable?
    // What values is stored in the arrayC variable?

    arrayC = arrayB; // What happens here?
    
    // Strings (Reference):
    //   A string is conceptually an array of characters.
    //   Strings are typically used for managing text.
    //
    //   Java's `String` class essentially just manages a `char` array, and
    //   provides some useful functionality as well.
    //
    //   Since `Strings` are a reference type, the string data is stored in
    //   memory, and a `String` variable is an address which points to the 
    //   memory region.

    String s = "This is a string";

    char[] someCharArray = {' ', 't', 'o', 'o', '!'};
    String too = new String(someCharArray);

    System.out.println(s + too);

    String strA = "abc";
    String strB = "def";

    // What happens in these two lines?
    String c = strA;
    strA = "ghi";

    // What will be printed?
    System.out.println("C = " + c);

    // Objects (Reference):
    //   An object is a collection of data "fields" which are grouped together
    //   and stored in memory.
    //
    //   For example, if you had a `Human` object, it might have an integer
    //   `height` field, and a integer `age` field.
    // 
    //   Under the hood, an object is actually treated pretty similarly to an
    //   array.
    //   A naive approach to saving our `Human` object to memory could look
    //   like:

    int[] someHuman = { 155, 24 };

    //   The above line writes the values 155, 24 to an array in memory.
    //   If we _knew_ that the first item of a `human` is the height, and the
    //   second item the `age`, we could retrieve the values from memory:

    int heightOfThatHuman = someHuman[0];
    int ageOfThatHuman = someHuman[1];

    //   We could also overwrite the values.

    someHuman[0] = 170; // update height
    someHuman[1] = 25; // update age

    //   As you can guess, this approach has some major problems, to name a
    //   few:
    //     It does not extend well to fields with different data types.
    //     It is hard to keep track of (from the programmer's perspective).
    //     It is hard to read.
    //
    //   Thankfully, Java allows us to abstract this away using `Objects`.
    //   Let's define our human as a class (we will explain this in more depth
    //   later). See: `class Human` below.

    Human michael = new Human();
    michael.height = 170;
    michael.age = 24;

    System.out.println(
      "Michael is " 
        + michael.age + " years old and " 
        + michael.height + " cm tall"
    );

  }

  class Human {
    // "public" means the field can be accessed
    // "int" specifies that the field is an integer
    // "height" is the name of the field.
    public int height;
    public int age;
  }

  /////////////////////////////////////////////////////////////////////////////
  //                               Lesson1
  /////////////////////////////////////////////////////////////////////////////
  private void RunLesson2() {
    // 1. Declare an integer variable named "someInteger" and assign it the 
    //    value -200


    // 2. Create a String variable named "myName" and assign your name as its
    //    value.
    

    // 3. Create an array of booleans named "myBoolArray". All values should
    //    start as "false".
    

    // 4. Use a "for" loop to set all values of "myBoolArray" to true.


    // 5. Use a "for" loop to set "myBoolArray" to the following pattern:
    //    [false, true, false, true, ...]


    // 6. Below is the function "AllTrue", complete the function and write
    //    test code to ensure it works correctly.
    TestAllTrue();

    // 7. Below is the function "MaxAge", complete the function and write test
    //    code to ensure it works correctly.
    TestMaxAge();

    // 8. Below is the function "HeightOfAdults", complete the function and
    //    write test code to ensure it works correctly.
    TestHeightOfAdults();

    // 9. Below is the function "ParseName", complete the function and write
    //    test code to ensure it works correctly.
    TestParseName();
  }

  private boolean AllTrue(boolean[] arr) {
    // Returns true if all elements of "arr" are "true".
    return false; // TODO: fill out this method.
  }

  private void TestAllTrue() {
    // Tests the AllTrue method for correctness.
    // TODO: fill out this method.
  }

  private int MaxAge(Human[] humans) {
    // Returns the maximum "age" of all elements of "humans".
    return -1; // TODO: fill out this method.
  }

  private void TestMaxAge() {
    // Tests the MaxAge method for correctness.
    // TODO: fill out this method.
  }

  private int[] HeightOfAdults(Human[] humans) {
    // Returns the heights of all elements of "humans" that are adults.
    return null; // TODO: fill out this method.
  }

  private void TestHeightOfAdults() {
    // Tests the HeightOfAdults method for correctness.
    // TODO: fill out this method.
  }

  private String[] ParseName(String strEncoded) {
    // Parses out the first and last names and returns as an array.
    // Takes a string in the form "<lastName>,<firstName>"
    // Returns [<firstName>, <lastName>]
    return null; // TODO: fill out this method.
  }

  private void TestParseName() {
    // Tests the ParseName method for correctness.
    // TODO: fill out this method
  }
}
