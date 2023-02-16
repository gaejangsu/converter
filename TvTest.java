package tv03;

class TvTest {

	public static void main(String[] args) {

		Tv tv1 = new Tv();
		tv1.brand = "삼성";
		tv1.model = "UHD 50인치";
		tv1.channelMax = 100;
		tv1.channelMin = 0;
		tv1.volumeMax = 80;
		tv1.volumeMin = 0;
	
		
		Tv2 tv2 = new Tv2();
		tv2.brand = "엘지";
		tv2.model = "HD 70인치";
		tv2.channelMax = 6;
		tv2.channelMin = 0;
		tv2.volumeMax = 6;
		tv2.volumeMin = 0;
		
		tv2.power("출력");
		tv2.volumeUp();
		tv2.volumeUp();
		tv2.volumeUp();
		tv2.volumeUp();
		tv2.volumeUp();
		tv2.volumeUp();
		tv2.volumeUp();
		System.out.println(tv2.volume);
		tv2.volumeDown();
		tv2.volumeDown();
		tv2.volumeDown();
		tv2.volumeDown();
		tv2.volumeDown();
		tv2.volumeDown();
		tv2.volumeDown();
		tv2.volumeDown();
		System.out.println(tv2.volume);
		tv2.channelUp();
		tv2.channelUp();
		tv2.channelUp();
		tv2.channelUp();
		tv2.channelUp();
		tv2.channelUp();
		tv2.channelUp();
		tv2.channelUp();
		tv2.channelUp();
		System.out.println(tv2.channel);
		
		
	}

}