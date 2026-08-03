STACK AND PC is thread specific 

and A process can have multiple threads 

but HEAP and memory area is process specific

A process can have multiple threads which is excuted by CPU 

==================================================================
 sleep() — doesn't touch locks at all. It just pauses. If the thread is inside a synchronized block, it keeps the lock while sleeping (which is why sleeping under a lock is bad practice — others get stuck).
- wait(timeout) — the opposite: it releases the lock while waiting, and re-acquires it when woken up. That's the whole point of wait/notify (allows others to enter the critical section).
- join(timeout) / parkNanos() — no lock involved

=================================================

OS scheculed threads to CPU


process 1

t1
t2
t3
t4
t5
                  CONTEXT SWIICHING
CPU 1 -----> T1 FOR 2 SEC | T3 FOR 4 SEC | T1 FOR 1 SEC

CPU 2------> T4 FOR 3 SEC | T5 FOR 4 DEC  | T3 FOR 2 SEC



========================= problems with multi thraeding ================================

1 RACE CONDITION: 
    |----------------- program --> final state depends on order of execution of thread which is non deterministic
    
    int count =0 
    count++;

    1. read from memory
    2. uddate
    3. write to memory

    |-----------------

2 atomicity 


3 crritical section


4 visibility

--> One thread updates a variable
   but another thread does not see the updated value.

   CPU updates and read from cache not RAM

5 ordering

int x=0;
boolean flag = false;


Thread 1                 |                Thread 2

x = 10                                        if(flag == true){
                                                     system.out.println(x);  // can give zero if t1 execute flag= true  first and leaves and thread 2 executes
                                                 }
flag = true


// THIS IS CALLED THREAD INTERFERENCE (AFFECTING EACH OTHER WORKS)
=====================================

NON ATOMIC OPERATION

SHARED RESOURE

RACE CONDITION

ORDERING / VISIBILITY

DUE TO THRAED INTERFERNCE DATA BECOMES INCONSISTENT
==========================================================================================


WHY DO WE NEED SYNCHRONIZED?

1. To Protect shared data
2. To make any operation atomic
3. To ensure visibilty
4. to preserve ordering   note : volatile also preserves visiviltu and ordering

Synchronized keyword uses a lock called Monitor locks or Object locks

===========================

Every Onbject in java has a lock (internal-lock)

when we write synchrinzed on a method we are not applying lock on method rather we are applying lock on object 
via thread and whatever comes within synchrinizd block will be executed by the thread then and only then thread release the lock from the object, and next thread will be executed



class counter{
int count;
synchronized void increment(){
    count++
}

}

// synchronized block
class counter{

                                    int count;
                                    
                                    void increment(){
                                    
                                    synchronized(this){
                                        count++
                                    }
                                    
                                    }
                                    
                                    void decrement(){
                                         
                                    synchronized(this){
                                        count--
                                    }
                                    }

}


suppose there are two threads using single object to execute increment and decrement respectively

it will not be excuted parallely 

because each object has one lock 


thread t1 appies lock on object and execute increment thread t2 will be blocked if uses the same object 
because lock is aquired on onject

===================================================

we have lock interface which privdes
lock()
unlock()
trylock()
trylock(Timeout,timeunit)

rarely used methods

isLocked() --> true or false this operation is not atomic
isHeldByCurrentThread()
getHoldCount() // how many times a thread aquired the locks
isFair()





along with other methods

Limitation of synchronized block

1. No control over Lock.
     here thread goes to waiting state if can't aquire a lock
     synchrinized(){

     }

2. No time out  // 2sec wait for lock else do other thing 

3. No Faireness. if t1,t2 ,t3, t4 which one would aquire the lock is not decided and random
even t1 arrrives first but might get lock at the end


================================================ Types of Lock ==================================================|

1. Lock lock = new ReentrantLock()


f1()
lock.lock();
try{
-----------
-----------
f2()
-----------
-----------
} finally{

lock.unlock()
}



f2()
lock.lock();
try{
-----------
-----------
-----------
-----------
} finally{

lock.unlock()
}


Note: Synchronized lock is also reentrant

2. ReadWriteLock  (interface)

Reading--> Non destructive

Writing --> destructive

why not to make a lock which allows multiple thread for reading called shared lock and one thrad for writing called 
exclusive lock

readlock()  // shared
writelock() //exclusive


ReadWriteLock lock = new ReentrantReadWriteLock()

Lock r1  = lock.readlock()
Lock r2  = lock.writelock()

Reader-Writer Problem

    w1                      |===========|
    w2                      |           |
    w3                      |           |
   r1                       |===========|
   r2
   r2


stampede lock --> modern version of readwrite lock

writeLock() // this aquires lock
readLock() // this aquires lock
tryOptimisticRead()  // this doesn't aquire lock

note: stampede lock is not reentrant

==========================================================================================

Inter Thread communication

1. wait()
2. notify()
3. notifyAll()

Wait(): this method i called on an object within a synchronized context/area to make the current wait until another thread invokes notify or notifyAll
when thread calls wait() it release the lock on the object and enter into the waiting state 

Notify(): this is called on an Object within synchronized context to wake up a waiting thread. When notify() is invoked it notifies on of the thread that are in waiting on the object to wake up. the choice of which thread to notify is not specifies and depends on the JVM.

NotifyAll(): this method is similar to notify(), but it wakes up all thread that are waiting on the same object 



Interview question that what is the difference of wait and join

Waiting thread never runs unless notified      Bit join thread runs when other thread completes it tasks

Waiting thread works in sycnchroniation        Join Thread doesn't work in synchronization context
context

Waiting thread releases a lock                 Join thread doesn't release any Lock

===========================================================================================

Lock Free Concurrency

Atomic Variable

Volatile vs Atomic variable

1. visibilty  | visible and atomic both

Atomic variable internally use Atomicreference to make a varible atomic

CompareAndSet(expectedvalue,newvalue) it returns trye or false





