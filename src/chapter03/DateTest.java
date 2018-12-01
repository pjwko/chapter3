package chapter03;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTest {

	public static void main(String[] args) {
		Date now = new Date();
		System.out.println(now);
		printDate1(now);
		printDate2(now);
	}
	
	private static void printDate1(Date d) {
		SimpleDateFormat sdf = 
				new SimpleDateFormat("yyyy년 MM월 dd일 hh시mm분ss초");
		System.out.println(sdf.format(d));
		
	}

	private static void printDate2(Date d) {
		//년도(+1900)
		int year = d.getYear();
		
		//월(0~11, +1)
		int month = d.getMonth();
		
		//일
		int date = d.getDate();
		
		//시
		int hours = d.getHours();
		
		//분
		int minutes = d.getMinutes();
		
		//초
		int seconds = d.getSeconds();
		
		System.out.println(
			(year+1900) + "년 " +
			(month+1) + "월 " +
			date + "일 " +
			hours + "시 " +
			minutes + "분 " +
			seconds + "초");
	}
}
