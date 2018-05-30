package HotelDemo;

import java.util.ArrayList;
import java.util.Iterator;

/*
 *  ���ľƵ�Ա��,��ʦ,����Ա,����,�ֱ�洢��3��������
 *  ���巽��,����ͬʱ����3����,�����������ϵ�ͬʱ,���Ե��ù�������
 */
public class GenericTest {

	public static void main(String[] args) {
		ArrayList<Cook> cook = new ArrayList<Cook>();
		ArrayList<Waiter> waiter = new ArrayList<Waiter>();
		ArrayList<Manager> manager = new ArrayList<Manager>();
		
		cook.add(new Cook("����", "001"));
		cook.add(new Cook("����", "002"));
		
		waiter.add(new Waiter("����", "003"));
		waiter.add(new Waiter("����", "004"));
		
		manager.add(new Manager("Сǿ", "005", 123.45));
		manager.add(new Manager("С��", "006", 456.78));
		
		iterator(cook);
		iterator(waiter);
		iterator(manager);
	}
	
	/*
	 * ���巽��,����ͬʱ����3����,�����������ϵ�ͬʱ,���Ե��ù������� work
	 * ? ͨ���,������it.next()����ȡ��������Object����,��ô����work����
	 * ǿ��ת��:  it.next()=Object o ==> Employee
	 * ��������: ����,���Դ���Employee����,Ҳ���Դ���Employee������Ķ���
	 * ���͵��޶�  ������,����̶�Employee,���������������?
	 *   ? extends Employee ���Ƶ��Ǹ���, �����޶�, ���Դ���Employee,���������������
	 *   ? super   Employee ���Ƶ�������, �����޶�, ���Դ���Employee,�������ĸ������
	 */
	public static void iterator(ArrayList<? extends Employee> array) {
		Iterator<? extends Employee> it = array.iterator();
		while (it.hasNext()) {
			Employee e = it.next();
			e.work();
		}
	}

}
