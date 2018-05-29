package StringBufferDemo;

public class demo1 {

	public static void main(String[] args) {
		function_6();
	}

	/*
	 *  StringBuffer�෽��
	 *   StringBuffer append, ���������͵�����,��ӽ�������
	 *   append ����ֵ,дreturn this
	 *   ��������˭,����ֵ����˭
	 */
	public static void function_1() {
		StringBuffer buffer = new StringBuffer();
		buffer.append("6");
		System.out.println(buffer);
	}

	/*
	 * StringBuffer�෽��
	 *   delete(int start,int end) ɾ�����������ַ�
	 *   ��ʼ��������,��β����������
	 */
	public static void function_2(){
		StringBuffer buffer = new StringBuffer();
		buffer.append("abcdef");

		buffer.delete(1, 5);
		System.out.println(buffer);
	}

	/*
	 *  StringBuffer�෽�� insert
	 *    insert(int index, ��������)
	 *  ��������������, ���뵽��������ָ��������
	 */
	public static void function_3(){
		StringBuffer buffer = new StringBuffer();
		buffer.append("abcdef");	 

		buffer.insert(3, 9.5);
		System.out.println(buffer);
	}

	/*
	 *  StringBuffer�෽��
	 *    replace(int start, int end, String str)
	 *    ��ָ����������Χ�ڵ������ַ�,�滻���µ��ַ���
	 */
	public static void function_4(){
		StringBuffer buffer = new StringBuffer();
		buffer.append("abcdef");

		buffer.replace(1, 4, "Q");

		System.out.println(buffer);
	}
	
	/*
	 *  StringBuffer��ķ���
	 *    reverse() ���������е��ַ���ת
	 */
	public static void function_5(){
		StringBuffer buffer = new StringBuffer();
		buffer.append("abcdef");
		
		buffer.reverse();
		
		System.out.println(buffer);
	}
	
	/*
	 *  StringBuffer��ķ���
	 *   String toString() �̳�Object, ��дtoString()
	 *   ���������е������ַ�,����ַ���
	 */
	public static void function_6(){
		StringBuffer buffer = new StringBuffer();
		buffer.append("abcdef");
		buffer.append(12345);
		
		//���ɱ���ַ�������������, ����˲��ɱ�String����
		String s = buffer.toString();
		System.out.println(s);
	}
	
}
