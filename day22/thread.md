STACK AND PC is thread specific 

and A process can have multiple threads 

but HEAP and memory area is process specific

A process can have multiple threads which is excuted by CPU 

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

