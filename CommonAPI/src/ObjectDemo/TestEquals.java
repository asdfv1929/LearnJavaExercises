package ObjectDemo;

public class TestEquals {

	public static void main(String[] args) {
		//Person类继承Object类， 继承了父类的方法equals
		Person p1 = new Person("小樱", 21);
		Person p2 = new Person("小明", 22);
		
		//调用父类方法equals，进行对象的比较，比较的是对象的内存地址
		boolean bool = p1.equals(p2);
		System.out.println(bool);
	}

}
