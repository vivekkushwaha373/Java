package observerdesignpattern;

import java.util.concurrent.Flow.Subscriber;

class Main{
    public static void main(String[] args){
       YoutubeChannel channel = new YoutubeChannel("CODERWITHVIVEK",206778,2);
       
       Subscribers subscriber1 = new Subscribers("vivek", "viv@gmaiil.com");
       Subscribers subscriber2 = new Subscribers("Zayy", "zay@gmaiil.com");
       Subscribers subscriber3 = new Subscribers("Aditya", "Adi@gmaiil.com");
       Subscribers subscriber4 = new Subscribers("Naveen", "Naveen@gmaiil.com");

       channel.subscribers.add(subscriber1);
       channel.subscribers.add(subscriber2);
       channel.subscribers.add(subscriber3);
       channel.subscribers.add(subscriber4);

       channel.publishVideo("React Dynamic Rendering ");


    }
}
