package hotel;

public class Test {

	public static void main(String[] args) {
		Manager manager = new Manager("С��", "89757", 1234);
		manager.work();
		
		Waiter waiter1 = new Waiter("С��", "111");
		Waiter waiter2 = new Waiter("С��", "222");
		
		waiter1.work();
		waiter1.services();
		
		waiter2.work();
		waiter2.services();
		
		Cook cook = new Cook("��ʦ", "xxx");
		cook.work();
		cook.services();
	}

}
