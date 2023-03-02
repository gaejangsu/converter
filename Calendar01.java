package langPackage03.stringMethod;

import java.util.Calendar;

public class Calendar01 {

	public static void main(String[] args) {
		Calendar today = Calendar.getInstance();
		System.out.println("현재년도 : " + today.get(Calendar.YEAR) + "년도");
		System.out.println("현재 몇월 : " + (today.get(Calendar.MONTH)+1)+"월");
		System.out.println("오늘은 올해의 몇째주 : " + today.get(Calendar.WEEK_OF_YEAR) + "번째 주");
		System.out.println("오늘은 이달의 몇째주 : " + today.get(Calendar.WEEK_OF_MONTH) + "번째 주");
		System.out.println("오늘은 몇 일 " + today.get(Calendar.DATE) + "일");
		System.out.println("오늘은 몇 일 " + today.get(Calendar.DAY_OF_MONTH)+"월");
		System.out.println("365일중 몇 일 " + today.get(Calendar.DAY_OF_YEAR) + "일");
		
		int week = today.get(Calendar.DAY_OF_WEEK);
		System.out.println("요일(1~7, 1:일 " + today.get(Calendar.DAY_OF_WEEK) + "주");
		
		switch(week) {
		case 1 :
			System.out.println("일요일");
		case 2 :
			System.out.println("월요일");
		case 3 :
			System.out.println("화요일");
		case 4 :
			System.out.println("수요일");
		case 5 :
			System.out.println("목요일");
		case 6 :
			System.out.println("금요일");
		case 7 :
			System.out.println("토요일");
			
		}
		System.out.println((today.get(Calendar.MONTH)+1)+"월 " + today.get(Calendar.DATE) + "일");
		
		if(today.get(Calendar.AM_PM)==0) {
			System.out.println("오전" + today.get(Calendar.HOUR) + "시 " + today.get(Calendar.MINUTE) + "분");
		} else if(today.get(Calendar.AM_PM)==1) {
			System.out.println("오후" + today.get(Calendar.HOUR) + "시 " + today.get(Calendar.MINUTE) + "분");
		}
		String[] str = {"","일","월","화","수","목","금","토"};		
		System.out.println(str[today.get(Calendar.DAY_OF_WEEK)] + "요일");
	}

}
