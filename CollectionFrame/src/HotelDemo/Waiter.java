package HotelDemo;
/*
 * 服务员类
 *    属于员工一种,具有额外服务功能
 *    继承Employee,实现VIP接口
 * */
public class Waiter extends Employee implements VIP{
	public Waiter() {
		super();
	}

	public Waiter(String name, String id) {
		super(name, id);
	}

	public void work() {
		System.out.println("服务员上菜");
	}
	
	public void services() {
		System.out.println("VIP服务，服务员添水");
	}
}
