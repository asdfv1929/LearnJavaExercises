package hotel;

public class Test {

	public static void main(String[] args) {
		Manager manager = new Manager("小明", "89757", 1234);
		manager.work();
		
		Waiter waiter1 = new Waiter("小花", "111");
		Waiter waiter2 = new Waiter("小草", "222");
		
		waiter1.work();
		waiter1.services();
		
		waiter2.work();
		waiter2.services();
		
		Cook cook = new Cook("厨师", "xxx");
		cook.work();
		cook.services();
	}

}
