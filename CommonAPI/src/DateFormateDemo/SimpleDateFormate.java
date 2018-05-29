package DateFormateDemo;

import java.text.SimpleDateFormat;
import java.util.Date;

/*
 *  �����ڽ��и�ʽ�� (�Զ���)
 *    �����ڸ�ʽ������ java.text.DateFormat ������, ��ͨ����,Ҳ�г���ķ���
 *    ʵ��ʹ�������� java.text.SimpleDateFormat ����ʹ�ø�����ͨ����,��д�˳��󷽷�
 */
public class SimpleDateFormate {

	public static void main(String[] args) throws Exception {
		function2();
	}
	
	/*
	 * ��ζ����ڸ�ʽ��
	 *  ����:
	 *    1. ����SimpleDateFormat����
	 *       ���๹�췽����,д���ַ��������ڸ�ʽ
	 *    2. SimpleDateFormat���÷���format�����ڽ��и�ʽ��
	 *         String format(Date date) �������ڶ���,�����ַ���
	 *    ����ģʽ:
	 *       yyyy    ���
	 *       MM      �·�
	 *       dd      ���е�����
	 *       HH       0-23Сʱ
	 *       mm      Сʱ�еķ���
	 *       ss      ��
	 *       yyyy��MM��dd�� HH��mm����ss��  �����޸�,: -  ��ĸ��ʾ��ÿ���ֶβ��������д
	 */
	public static void function(){
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy��MM��dd�� HH��mm����ss��");
		String date = sdf.format(new Date());
		System.out.println(date);
	}
	
	/*
	 *  ���ַ���ת��Date����
	 *  DateFormat�෽�� parse
	 *  ����:
	 *    1. ����SimpleDateFormat�Ķ���
	 *       ���췽����,ָ������ģʽ
	 *    2. �������,���÷��� parse ����String,����Date
	 *    
	 *    ע��: ʱ������ڵ�ģʽyyyy-MM-dd, ������ַ����е�ʱ������ƥ��
	 *                     1995-5-6
	 *    
	 *    ����,�������û���������, ���ڸ�����������
	 *    �û�ѡ�����ʽ
	 */
	public static void function2() throws Exception{
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date date = sdf.parse("1995-5-6");
		System.out.println(date);
	}
}
