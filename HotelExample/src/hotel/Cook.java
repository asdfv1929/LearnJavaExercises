package hotel;
/*
 * 定义厨师类
 * 属于员工一种， 具有额外服务功能
 * 继承Employee类， 实现VIP接口
 * */
public class Cook extends Employee implements VIP{
	//空参构造
	public Cook() {}
	
	//有参构造
	public Cook(String name, String id) {
		super(name, id);
	}
	
	//抽象方法的重写
	public void work() {
		System.out.println("厨师正在炒菜");
	}

	@Override
	public void services() {
		System.out.println("VIP服务，厨师炒菜加量");
	}
}
