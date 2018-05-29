package RegexDemo;
/*
 *  ʵ�����������ַ�������ƥ��,ʹ�õ��ַ�����ķ���
 *  String��������������ʽ��صķ���
 *    boolean matches(String ����Ĺ���)
 *    "abc".matches("[a]")  ƥ��ɹ�����true
 *    
 *    String[] split(String ����Ĺ���)
 *    "abc".split("a") ʹ�ù����ַ��������и�
 *     
 *    String replaceAll( String �������,String �ַ���)
 *    "abc0123".repalceAll("[\\d]","#")
 *    ��װ����Ĺ���,�滻�ַ���
 */ 
public class Methods {

	public static void main(String[] args) {
//		checkQQ();
//		checkTel();
//		split_3();
//		replaceAll_1();
		checkMail();
	}

	/*
	 *  ���QQ�����Ƿ�Ϸ�
	 *  0���ܿ�ͷ,ȫ����, λ��5~10λ
	 *  123456 
	 *  \\dƥ������  \\Dƥ�䲻������
	 */
	public static void checkQQ(){
		String QQ = "12346";
		//���QQ����͹����Ƿ�ƥ��,String��ķ���matches
		boolean b = QQ.matches("[1-9][\\d]{4,9}");
		System.out.println(b);
	}

	/*
	 *  ����ֻ������Ƿ�Ϸ�
	 *  ��ͷΪ1�� �ڶ�λ ������34578��֮���Ϊ  0-9 ��λ���̶�11λ
	 */
	public static void checkTel(){
		String telNumber = "13351280065";
		//String��ķ���matches
		boolean b = telNumber.matches("1[34857][\\d]{9}");
		System.out.println(b);
	}

	/*
	 *  String�෽��split���ַ��������и�
	 *  12-25-36-98  ���� - ���ַ��������и�
	 */
	public static void split_1(){
		String str = "12-25-36-98";
		//����-���ַ��������и�,String�෽��split
		String[] strArr = str.split("-");
		System.out.println("����ĳ���" + strArr.length);
		for(int i = 0 ; i < strArr.length ; i++){
			System.out.println(strArr[i]);
		}
	}

	/*
	 * String�෽��split���ַ��������и�
	 * 18 22 40 65 ���� �ո� �и��ַ���
	 * �ո�ɶ��
	 */
	public static void split_2(){
		String str = "18    22     40          65";
		// + ��ʾ���
		String[] strArr = str.split(" +");
		System.out.println("����ĳ���" + strArr.length);
		for(int i = 0 ; i < strArr.length ; i++){
			System.out.println(strArr[i]);
		}
	}

	/*
	 * String�෽��split���ַ��������и�
	 * 192.168.105.27 ����  �� �и��ַ���
	 */
	public static void split_3(){
		String ip = "192.168.105.27";
		String[] strArr = ip.split("\\.");
		System.out.println("����ĳ���" + strArr.length);
		for(int i = 0 ; i < strArr.length ; i++){
			System.out.println(strArr[i]);
		}
	}

	/*
	 * "Hello12345World6789012"�����������滻��
	 * String�෽��replaceAll(�������,�滻������ַ���)
	 */
	public static void replaceAll_1(){
		String str = "Hello12345World6789012";
		str = str.replaceAll("[\\d]+", "#");
		System.out.println(str);
	}
	
	/*
	 *  ����ʼ���ַ�Ƿ�Ϸ�
	 *  ����:
	 *   1234567@qq.com
	 *   mym_ail@sina.com
	 *   nimail@163.com
	 *   wodemail@yahoo.com.cn    
	 *   
	 *   @: ǰ  ������ĸ_ ������������1��
	 *   @: ��  ������ĸ     ������������1��
	 *   .: ���� ��ĸ 
	 *     
	 */
	public static void checkMail(){
		String email ="abc123@sina.com";
		boolean b = email.matches("[a-zA-Z0-9_]+@[0-9a-z]+(\\.[a-z]+)+");
		System.out.println(b);
	}

}
