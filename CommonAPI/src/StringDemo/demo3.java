package StringDemo;
/*
 * String�๹�췽��
 * ������ʽ
 * */
public class demo3 {
	public static void main(String[] args) {
		function_1();
	}
	
	/*
	 * ���巽���� String��Ĺ��췽��
	 * String(byte[] bytes)  ���ݽ��ֽ�����
	 * ʹ��ƽ̨��Ĭ���ַ�������ָ����byte���飬����һ���µ�String
	 * 
	 * String(byte[] bytes, int offset, int length) �����ֽ�����
	 * �ֽ������һ����ת���ַ���
	 * offset �������ʼ������
	 * length ����
	 * ��offset��ʼ��Ҫlength��
	 * */
	public static void function(){
		byte[] bytes = {97, 98, 99, 100};
		//����String��Ĺ��췽��,�����ֽ�����
		String s = new String(bytes);
		System.out.println(s);
		
		byte[] bytes1 ={65, 66, 67, 68, 69};
		//����String���췽��,��������,����2��intֵ
		String s1 = new String(bytes1, 1, 3);
		System.out.println(s1);
	}
	
	/*
	 * String(char[] value) �����ַ�����
	 * ���ַ�����,ת���ַ���, �ַ�����Ĳ���,����ѯ�����
	 * 
	 * String(char[] value, int offset, int count) �����ַ�����
	 * ���ַ������һ����ת���ַ���
	 * offset  ���鿪ʼ����
	 * count   ����
	 */
	public static void function_1(){
		char[] ch = {'a', 'b', 'c', 'd', 'e', 'f'};
		//����String���췽��,�����ַ�����
		String s = new String(ch);
		System.out.println(s);
		
		String s1 = new String(ch, 1, 4);
		System.out.println(s1);
	}
}
