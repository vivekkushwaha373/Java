### Memory Management in Depth

-- 1. JVM MEMORY MANAGEMENT

- IT ALLOCATES MEMEORY

- iT USES MEMORY

- IT deallocates Memory

- IT DOESN'T ALLOW YOU TO DEALLOCATE MEMORY

WHY to study memory management then if JVM manages Memory: 

Garbage collection is also a program in Java which slows down the performance if run frequently

so you should write Optimized code so prevent OutOFmemoryError/ stackoverflowerror

JVM MEMORY IS DIVIDED INTO CHUNKS EACH PART BELONGS TO DIFFERENT RESPONSIBILITY

1 HEAP MEMORY

2 METHODS AREA

3 STACK MEMORY

4 PROGRAM COUNTER

5 IGNORE NATIVE METHOD STACK FOR NOW


HEAP AND METHOD AREA is THRAD SHARE

stack memory and program counter is thread specific

// HEAP MEMORY
A huge chuck of memory which holds object with when u create it using new 
Garbage collection only works on heap memory



//METHOD AREA
IT STORES THE META OR CLASS LEVEL BLUEPRINT
example class student {

}

it will hold class name, what it inherits like OBJECT, which inteface it implement, which methods it has: what 
parameter those methods hold, return type, bytecode given by JIT

both  static/instance variavbles loads in method area

JVM LOADS CLASS in methods area itself 


// stack memory or EXCUTION MEMORY

we store current method executed

// PROGRAM COUNTER

it stores current instruction which is executed
{

    ------------------------
    ------------------------
    ------------------------ current instruction which is being executed

}
=========================================================================


public class demo{
    P S V M (-------){
            int x =5;
            Student s1 = new Student();
            s1.name = "Aditya";
    }
}

1. JVM starts
2. class Loading
class Loader--> file demo.class, read the bytecode, create entry in method area

3.  Main thread create (stack , PC)


methods area (stores metadata)
=======================
class:demo             |
parent: Object         |
                       |
Method : main(String[])|
========================

stack
=======================



-----------------------
main():frame
x = undefined intially |then store 5 
s1 = undefined initially|points student in heap 
========================


heap
=======================
|aditya|\
          \
            \   
student --> | name |

========================


// HEAP IS SLOWER THAN STACK

1. heap is dynamic in nature

2. shared across threads

3. managed by garbage collection

4. Usually slower than stack




