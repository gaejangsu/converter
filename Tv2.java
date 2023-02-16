package tv03;

public class Tv2 {
	
	String brand;
	String model;
	int channel;
	int volume;
	boolean power;
	int channelMax;
	int channelMin;
	int volumeMax;
	int volumeMin;
	
	void power(String a) {
		power = !power;
		
		if(a=="출력") {
			if(power==true) {
				System.out.println("tv가 켜졌다");
			} else {
				System.out.println("tv가 꺼졌다");
			}
		}
		
		if(a=="미출력") {};
		
	}
	
	int channelUp(String a) {
		
		if(channel==channelMax) {
			channel = channelMin;
			
			if(a=="출력") {
				System.out.println("현재 채널은 " + channel + "입니다.");
			}
			return channel;
		} else {
			if(a=="출력") {
				System.out.println("현재 채널은 " + channel + "입니다.");
			}
			return ++channel;
		}
		
		
	}
	
	int channelDown() {
		if(channel==channelMin) {
			channel = channelMax;
			return channel;
		} else {
			return --channel;
		}
	}
	
	int volumeUp() {
		if(volume==volumeMax) {
			return volumeMax;
		} else {
			return ++volume;
		}
		
	}
	
	int volumeDown() {
		if(volume==volumeMin) {
			return volumeMin;
		} else {
			return --volume;
		}
	}
}