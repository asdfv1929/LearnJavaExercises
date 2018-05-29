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
	 *  ������˶�����
	 *   ����  ���������
	 *   �������ڱ�ɺ���ֵ,����
	 */
	public static void function() throws ParseException {
		System.out.println("������������� ��ʽYYYY-MM-dd");
		String birthdayString = new Scanner(System.in).next();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date birthdayDate = sdf.parse(birthdayString);
		
		Date todayDate = new Date();
		
		long birthSecond = birthdayDate.getTime();
		long todaySecond = todayDate.getTime();
		long seconds = todaySecond - birthSecond;
		
		if (seconds < 0)
			System.out.println("��û����");
		else
			System.out.println(seconds/1000/60/60/24);
	}
	
	/*
	 *  �������
	 *  2000 3000
	 *  �߼����㷨: �������õ�ָ����ݵ�3��1��,add���ƫ��1��,��ȡ����,29����
	 */
	public static void function_1(){
		Calendar c = Calendar.getInstance();
		//������,���õ�ָ�����3��1��
		c.set(2018, 2, 1);
		//����add����,���ƫ��1��
		c.add(Calendar.DAY_OF_MONTH, -1);
		//get������ȡ����
		int day = c.get(Calendar.DAY_OF_MONTH);
		System.out.println(day);
	}
}
