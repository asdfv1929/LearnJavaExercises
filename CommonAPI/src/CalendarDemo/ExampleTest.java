package CalendarDemo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class ExampleTest {

	public static void main(String[] args) throws ParseException {
		function_1();
	}

	/*
	 *  计算活了多少天
	 *   生日  今天的日期
	 *   两个日期变成毫秒值,减法
	 */
	public static void function() throws ParseException {
		System.out.println("请输入出生日期 格式YYYY-MM-dd");
		String birthdayString = new Scanner(System.in).next();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date birthdayDate = sdf.parse(birthdayString);
		
		Date todayDate = new Date();
		
		long birthSecond = birthdayDate.getTime();
		long todaySecond = todayDate.getTime();
		long seconds = todaySecond - birthSecond;
		
		if (seconds < 0)
			System.out.println("还没出生");
		else
			System.out.println(seconds/1000/60/60/24);
	}
	
	/*
	 *  闰年计算
	 *  2000 3000
	 *  高级的算法: 日历设置到指定年份的3月1日,add向后偏移1天,获取天数,29闰年
	 */
	public static void function_1(){
		Calendar c = Calendar.getInstance();
		//将日历,设置到指定年的3月1日
		c.set(2018, 2, 1);
		//日历add方法,向后偏移1天
		c.add(Calendar.DAY_OF_MONTH, -1);
		//get方法获取天数
		int day = c.get(Calendar.DAY_OF_MONTH);
		System.out.println(day);
	}
}
