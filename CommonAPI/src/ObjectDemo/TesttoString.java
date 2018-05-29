package ObjectDemo;

public class TesttoString {

	public static void main(String[] args) {
		//调用Person类的方法toString()
		Person p = new Person("张三", 23);
		String s = p.toString();
		//在输出语句中，若写的是一个对象，默认调用对象的toString方法，打印内存地址
		System.out.println(p); //object.Person@6d06d69c
		System.out.println(s); //object.Person@6d06d69c
		
		//张三23
		//张三23
	}

}
