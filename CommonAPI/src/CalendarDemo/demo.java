package CalendarDemo;

import java.util.Calendar;
import java.util.Date;

/*
 *   ������ java.util.Calendar
 *   ������,ʹ�������������
 *   
 *   Calendar��д�˾�̬���� getInstance() ֱ�ӷ���������Ķ���
 *   ����Ҫֱ��new ����Ķ���,ͨ����̬����ֱ�ӻ�ȡ
 */
public class demo {

	public static void main(String[] args) {
//		Calendar cal = Calendar.getInstance();
//		System.out.println(cal);
		
		function_3();
	}

	/*
	 * Calendar���get���� ��ȡ�����ֶε�ֵ int get(int) ����int,��ȡ���ĸ������ֶ� ����ֵ,�ͱ�ʾ�����ֶεľ�����ֵ
	 */
	public static void function() {
		Calendar c = Calendar.getInstance();
		// ��ȡ���
		int year = c.get(Calendar.YEAR);
		// ��ȡ�·�
		int month = c.get(Calendar.MONTH) + 1;
		// ��ȡ����
		int day = c.get(Calendar.DAY_OF_MONTH);
		System.out.println(year + "��" + month + "��" + day + "��");
	}
	
	/*
	 * Calendar���set���� �������� set(int field,int value) field ���õ����ĸ������ֶ� value
	 * ���ú�ľ�����ֵ
	 * 
	 * set(int year,int month,int day) ����3����������,��,��
	 */
	public static void function_1() {
		Calendar c = Calendar.getInstance();
		// ����,�·�(0-11),���õ� 10�·�
		// c.set(Calendar.MONTH, 9);

		// ������,��,��
		c.set(2099, 4, 1);

		// ��ȡ���
		int year = c.get(Calendar.YEAR);
		// ��ȡ�·�
		int month = c.get(Calendar.MONTH) + 1;
		// ��ȡ����
		int day = c.get(Calendar.DAY_OF_MONTH);
		System.out.println(year + "��" + month + "��" + day + "��");
	}
	
	/*
	 * Calendar�෽��add ������ƫ����,
	 * ����ָ��һ�������е��ֶ�,
	 * ����������ƫ�� add(int field, int value)
	 */
	public static void function_2() {
		Calendar c = Calendar.getInstance();
		// �������е�����,���ƫ��280��
		c.add(Calendar.DAY_OF_MONTH, -280);
		// ��ȡ���
		int year = c.get(Calendar.YEAR);
		// ��ȡ�·�
		int month = c.get(Calendar.MONTH) + 1;
		// ��ȡ����
		int day = c.get(Calendar.DAY_OF_MONTH);
		System.out.println(year + "��" + month + "��" + day + "��");
	}
	
	/*
	 * Calendar��ķ���getTime()
	 * ����������,ת��Date���ڶ���
	 */
	public static void function_3(){
		Calendar c = Calendar.getInstance();
		Date date = c.getTime();
		System.out.println(date);
	}
}
