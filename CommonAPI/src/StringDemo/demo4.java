package StringDemo;
/*
 * String��Ĳ��ҹ���
 */
public class demo4 {

	public static void main(String[] args) {
		//		function();
		//		function_2();
		//		function_3();
		//		function_4();
		function_5();
	}

	/*
	 *  int length() �����ַ����ĳ���
	 *  �������ٸ��ַ�
	 */
	public static void function(){
		String str = "cfxt54GT";
		//����String�෽��length,��ȡ�ַ�������
		int length = str.length();
		System.out.println(length);
	}

	/*
	 *  String substring(int beginIndex,int endIndex) ��ȡ�ַ�����һ����
	 *  �����µ��ַ���
	 *  ����ͷ, ������β��
	 *  
	 *  String substring(int beginIndex)��ȡ�ַ�����һ����
	 *  ����ͷ, ������ַ�ȫҪ
	 */
	public static void function_2(){
		String str = "howareyou";
		//����String�෽��substring��ȡ�ַ���һ����
		str= str.substring(1, 5);
		System.out.println(str);

		String str2 = "HelloWorld";
		str2 = str2.substring(1);
		System.out.println(str2);
	}

	/*
	 * boolean startsWith(String prefix)  
	 * �ж�һ���ַ����ǲ�����һ���ַ�����ǰ׺,��ͷ
	 * howareyou
	 * how
	 */
	public static void function_3(){
		String str = "howareyou";
		//����String��ķ���startsWith
		boolean b = str.startsWith("how");
		System.out.println(b);
	}

	/*
	 * boolean endsWith(String prefix)
	 * �ж�һ���ַ����ǲ�����һ���ַ����ĺ�׺, ��β
	 * Demo.java
	 *     .java
	 */
	public static void function_4(){
		String str = "Demo.java";
		//����String�෽��endsWith
		boolean b = str.endsWith(".java");
		System.out.println(b);
	}

	/*
	 *  boolean contains (String s)
	 *  �ж�һ���ַ�����,�Ƿ������һ���ַ���
	 */
	public static void function_5(){
		String str = "hello world";
		//����String��ķ���contains
		boolean b =str.contains("ell");
		System.out.println(b);
	}
	
	/*
	 *  int indexOf(char ch)
	 *  ����һ���ַ�,���ַ����е�һ�γ��ֵ�����
	 *  �����ҵ��ַ�������,����-1
	 */
	public static void function_6(){
		String str = "helloworld";
		//����String��ķ���indexOf
		int index = str.indexOf('e');
		System.out.println(index);
	}



	/*
	 *  byte[] getBytes() ���ַ���ת���ֽ�����
	 *  �˹��ܺ�String���췽���෴
	 *  byte������صĹ���,��ѯ�����
	 */
	public static void function_7(){
		String str = "abc";
		//����String�෽��getBytes�ַ���ת���ֽ�����
		byte[] bytes = str.getBytes();
		for(int i = 0 ; i < bytes.length ; i++){
			System.out.println(bytes[i]);
		}
	}
	
	/*
	 * char[] toCharArray() ���ַ���ת���ַ�����
	 * ���ܺ͹��췽���෴
	 */
	public static void function_8(){
		String str = "helloworld";
		//����String��ķ���toCharArray()
		char[] ch = str.toCharArray();
		for(int i = 0 ; i < ch.length ; i++){
			System.out.println(ch[i]);
		}
	}

	/*
	 *  boolean equals(Object obj)
	 *  ���������ַ���,�ж��ַ����е��ַ��Ƿ���ȫ��ͬ,�����ȫ��ͬ����true
	 *  
	 *  boolean equalsIgnoreCase(String s)
	 *  �����ַ���,�ж��ַ����е��ַ��Ƿ���ͬ,���Դ�Сд
	 */
	public static void function_9(){
		String str1 = "Abc";
		String str2 = "abc";
		//�ֱ����equals��equalsIgnoreCase
		boolean b1 = str1.equals(str2);
		boolean b2 = str1.equalsIgnoreCase(str2);
		System.out.println(b1);
		System.out.println(b2);
	}
	
}
