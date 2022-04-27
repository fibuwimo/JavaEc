package day2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class TimeLesson {

	public static void main(String[] args) throws ParseException {
		long start =System.currentTimeMillis();
		String str="java";
		for(int i=0;i<10000;i++) {
			str+="java";
		}
		long end =System.currentTimeMillis();
		System.out.println("time:"+(end-start));

		start =System.currentTimeMillis();
		StringBuilder sb =new StringBuilder("Java");
		for(int i=0;i<200000;i++) {
			sb.append("java");
		}
		String s =sb.toString();
		end =System.currentTimeMillis();
		System.out.println("time:"+(end-start));

		Date now = new Date();
		System.out.println(now);
		System.out.println(now.getTime());

		Calendar c = Calendar.getInstance();
		c.set(2019,8,22,1,23,45);
		c.set(Calendar.MONTH,9);
		Date d = c.getTime();
		System.out.println(d);
		now = new Date();
		c.setTime(now);
		int y=c.get(Calendar.YEAR);
		System.out.println("今年は"+y+"年です");
		System.out.println("Hello");

		SimpleDateFormat sdf=
				new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");

		Date d1 = sdf.parse("2022/04/27 01:23:45");
		System.out.println(d1);

		sdf=new SimpleDateFormat("yy/MM/dd");

		String msg = sdf.format(d1);
		System.out.println(msg);
	}
}

