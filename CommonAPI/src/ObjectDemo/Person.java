package ObjectDemo;


//默认继承Object类
public class Person {
	private String name;
	private int age;
	
	public Person() {}
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	/*
	 * 将父类的equals方法重写
	 * 但，内容没改变
	 * 比较的是对象的内存地址
	 * */
//	public boolean equals(Object obj) {
//		return this == obj;
//	}
	
	public boolean equals(Object obj) {
		if (obj == null)
			return false;
		if (obj == this)
			return true;
		
		if (obj instanceof Person) {
			//对obj进行向下转型，转成Person类
			Person p = (Person)obj;
			return this.age == p.age;
		}
		return false;
	}
	
	/*
	 * 重写父类的方法toString()
	 * 没有必要让调用者看到内存地址
	 * 要求: 方法中, 返回类中所有成员变量的值
	 */
	public String toString() {
		return this.name + this.age;
	}
}
