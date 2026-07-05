- Heap memory is divided into two parts

1. young generation
2. old generation

Young GENERATION is further divided two three parts 

1 part is called eden
2,3 are called survivor space , i.e s0, s1

new Student() goes to eden in young generation 

in eden: allocation is very fast

after one cycle of garbage collection it is transported to s0 by JVM

after one more cycle of garbase collection it is transported to s1 by JVM

after one more cycle of garbage collectio it is again transported to s0 by JVM

it continues to switch from s1 to s0 till a perticular frequency let say 15 i.e Age counter

after 15 cycle it will be transported to old generation

it means object is old now and long lived

in old gerenation Garbage collection runs less time than young generation

garbage collection runs in young generation called Minor GC which is more frequent and less expensive

garbage collection runs in old generation called major GC which is less frequesnt and more expensive, consumes more memory

Eden --> s0 --> s1 ---> s0 --> s1 --> s0 --> s1 --> s0 --> s1 --> old generation 

JVM chnages age counter dynamically

example:
 if you create a big array new int[1000000] it will be moved to old generation directly
 coz s0 s1 can't hold

 if  you frequently create object to objects are more in numbers to accomodate in s0 s1 JVM reduce age counter to 5 

// Types of Reference in Java

1. Strong Reference           Student s1 = new Student(); GC can't delete this
2. Soft Reference             SoftReference<Student> sr = new SoftReference<>(); tells GC to keep this in memory until no memory needed
3. weak Reference             WeakReference<Student> wr =  new WeakReference<>(); keep this until next GC cycle

4. Phantom Reference: //gone  GC uses internally and assisns phantom reference to the src pointing 


Garbage Collection Algortihm: 

1. Mark & Sweep: marks object which is unreachable in first step and sweep in the next step and it is part of major GC

[A][B][C][D][E]
[A][][C][][E]   memory fragmentation issue


2. Mark Compact: 

[A][B][C][D][E]
[A][C][E]        No memory fragmentation issue; Moving Object is costly and it is also part of Major GC

3. Copying

EDEB:

[A][B][C][D][E]  remove unreachable from eden

s0
[B][D] copying rechanble       --> delete unreachable

s1

[D] copying reahable 


// When Garbage Collection runs it stops the program coz it requires a sanpshot of referenceing relation before deletion if we keep running the program it might make a new reference which  is problematic

OLD JAVA WAS USING SEQUENCIAL GC

NEW JAVA USES PARALLEL GC: NOTE: but it doesn't mean that it will not stop the program, program will still stop 
but GC will run fast using multithrading

YOU can request JVM to initiate Garbage collection you can do System.GC()



