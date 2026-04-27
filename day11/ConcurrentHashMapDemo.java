package day11;

import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapDemo {
    public static void main(String[] args) {
        ConcurrentHashMap<Integer, String> map = new ConcurrentHashMap<>();

       // java 7 --> segment based locking --> 16 seg --> smaller element;
       // Only the segment being written to or read from is locked
       // read: do not require locking unless there is a write operation heppening on the same segment 
       // write : lock


       // java 8 ---> no segmentation
       // --> compare and swap approach -->no locking except resizing or collision
       // --> THread A last saw -->x= 45;
       // Thread A work ---> x to 50
       // if x is still 45 then chnage it to 50 else don't change and retry
       // put --> index
        
    }

}
