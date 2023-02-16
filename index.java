package day07;


public class index {
    public static void main(String[] args) {
        
        ModifiedTv tv = new ModifiedTv();
        tv.channelMax = 3;
        tv.channelMin = 0;
        tv.currentChannel = 1;
        System.out.println("현재 채널: " + tv.getCurrentChannel());

        System.out.println("executed addChannelCount()");
        tv.addChannelCount();

        System.out.println("현재 채널: "+tv.getCurrentChannel());
    }
}   
;