package StringDemo;
/*
 *   String类特点:
 *     一切都是对象,字符串事物 "" 也是对象
 *     类是描述事物,String类,描述字符串对象的类
 *     所有的 "" 都是String类的对象
 *     
 *     字符串是一个常量,一旦创建,不能改变
 */
public class demo1 {

	public static void main(String[] args) {
		//引用变量str执行内存变化
		//定义好的字符串对象,不变
		//String类重写过toString
		String str = "apple";
		System.out.println(str);
		str = "banana";
		System.out.println(str);
	}

}
