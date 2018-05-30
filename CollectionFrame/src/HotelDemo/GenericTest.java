package HotelDemo;

import java.util.ArrayList;
import java.util.Iterator;

/*
 *  将的酒店员工,厨师,服务员,经理,分别存储到3个集合中
 *  定义方法,可以同时遍历3集合,遍历三个集合的同时,可以调用工作方法
 */
public class GenericTest {

	public static void main(String[] args) {
		ArrayList<Cook> cook = new ArrayList<Cook>();
		ArrayList<Waiter> waiter = new ArrayList<Waiter>();
		ArrayList<Manager> manager = new ArrayList<Manager>();
		
		cook.add(new Cook("张三", "001"));
		cook.add(new Cook("李四", "002"));
		
		waiter.add(new Waiter("王五", "003"));
		waiter.add(new Waiter("赵六", "004"));
		
		manager.add(new Manager("小强", "005", 123.45));
		manager.add(new Manager("小明", "006", 456.78));
		
		iterator(cook);
		iterator(waiter);
		iterator(manager);
	}
	
	/*
	 * 定义方法,可以同时遍历3集合,遍历三个集合的同时,可以调用工作方法 work
	 * ? 通配符,迭代器it.next()方法取出来的是Object类型,怎么调用work方法
	 * 强制转换:  it.next()=Object o ==> Employee
	 * 方法参数: 控制,可以传递Employee对象,也可以传递Employee的子类的对象
	 * 泛型的限定  本案例,父类固定Employee,但是子类可以无限?
	 *   ? extends Employee 限制的是父类, 上限限定, 可以传递Employee,传递他的子类对象
	 *   ? super   Employee 限制的是子类, 下限限定, 可以传递Employee,传递他的父类对象
	 */
	public static void iterator(ArrayList<? extends Employee> array) {
		Iterator<? extends Employee> it = array.iterator();
		while (it.hasNext()) {
			Employee e = it.next();
			e.work();
		}
	}

}
