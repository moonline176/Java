package co.yedam.app.date;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;

public class DateTest {

	public static void main(String[] args) {

		Date date = new Date();
		
		Calendar calendar = Calendar.getInstance();
		int year = calendar.get(Calendar.YEAR);
		int month = calendar.get(Calendar.MONTH);
		int day = calendar.get(Calendar.DAY_OF_MONTH);
		int day_year = calendar.get(Calendar.DAY_OF_YEAR);
		int hour = calendar.get(Calendar.HOUR);
		int minute = calendar.get(Calendar.MINUTE);
		int second = calendar.get(Calendar.SECOND);
		System.out.println(year);
		System.out.println(month);
		System.out.println(day);
		System.out.println(day_year);
		System.out.println(hour);
		System.out.println(minute);
		System.out.println(second);

		// 살아온 일수 계산
		

		// 기념일 계산
		
		
//		Calendar Dday = calendar.getInstance();
//		Dday.set(2021, 10, 27);
//		long k = Dday.getTimeInMillis() - calendar.getTimeInMillis();
//		k = k / 1000 / 60 / 60 / 24;
//		System.out.println("일수:" + k);
		
		LocalDate currentDate = LocalDate.now();
		System.out.println(currentDate.getYear()+"/"+
						   currentDate.getMonthValue()+"/"+
						   currentDate.getDayOfMonth());
		System.out.println(currentDate.plusDays(100));
		
		//Date => String
		SimpleDateFormat df = new SimpleDateFormat("yyyy.MM.dd.E.u");
		System.out.println(df.format(calendar.getTime())); 
		

	}

}
