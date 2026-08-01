what is Java

Java is an Object Oriented High level programming language

String pool is also known as string constant pool and it is allocated in a memory present inside heap 
 

JDK = JRE+ javac comiler, debugger, etc

JRE = class Libraries + JVM

JVM = - it provider secure environment to run the program
      - executes bytecode using (JIT+Interpreter) to covert it into machine code
      - Garbage collection

// Java Editions 

- JAVA standard Edition (JSE) // this is core java
- Java Enterprice Edition (JEE) 
- JAVA Micro Edition (JME) 
 

| Data Type | Size                               | Range                                      | Default Value |
| --------- | ---------------------------------- | ------------------------------------------ | ------------- |
| `byte`    | 1 byte (8 bits)                    | -128 to 127                                | `0`           |
| `short`   | 2 bytes (16 bits)                  | -32,768 to 32,767                          | `0`           |
| `int`     | 4 bytes (32 bits)                  | -2³¹ to 2³¹-1                              | `0`           |
| `long`    | 8 bytes (64 bits)                  | -2⁶³ to 2⁶³-1                              | `0L`          |
| `float`   | 4 bytes (32 bits)                  | ~±3.4 × 10³⁸ (about 6–7 decimal digits)    | `0.0f`        |
| `double`  | 8 bytes (64 bits)                  | ~±1.7 × 10³⁰⁸ (about 15–16 decimal digits) | `0.0d`        |
| `char`    | 2 bytes (16 bits)                  | `'\u0000'` (0) to `'\uFFFF'` (65,535)      | `'\u0000'`    |
| `boolean` | JVM-dependent (conceptually 1 bit) | `true` or `false`                          | `false`       |



Note: The Integer.valueOf() method caches Integer objects for values in the range -128 to 127.