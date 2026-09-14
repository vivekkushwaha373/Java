package observerdesignpattern;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Flow.Subscriber;

// this is subject
public class YoutubeChannel {
    public String name;
    public Integer followersCount;
    public Integer followingCount;
    
    public YoutubeChannel(String name,Integer count1, Integer count2){
        this.name=name;
        this.followersCount = count1;
        this.followingCount = count2;
    }

    public Set<Subscribers> subscribers = new HashSet<>();

    void publishVideo(String title){
         System.out.println("Video published with title: "+title);
         
         Iterator<Subscribers> itr = subscribers.iterator();

         System.out.println("Notifying subscribers: ");
         
         while(itr.hasNext()){
            try{

                Thread.sleep(1000);
            }catch(Exception e){}
            Subscribers sb =  itr.next();
            System.out.println("Notify subscriber name "+sb.getName()+" and email: "+sb.getEmail());
         }



    }
}
