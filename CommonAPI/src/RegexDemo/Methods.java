package RegexDemo;
/*
 *  实现正则规则和字符串进行匹配,使用到字符串类的方法
 *  String类三个和正则表达式相关的方法
 *    boolean matches(String 正则的规则)
 *    "abc".matches("[a]")  匹配成功返回true
 *    
 *    String[] split(String 正则的规则)
 *    "abc".split("a") 使用规则将字符串进行切割
 *     
 *    String replaceAll( String 正则规则,String 字符串)
 *    "abc0123".repalceAll("[\\d]","#")
 *    安装正则的规则,替换字符串
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
	 *  检查QQ号码是否合法
	 *  0不能开头,全数字, 位数5~10位
	 *  123456 
	 *  \\d匹配数字  \\D匹配不是数字
	 */
	public static void checkQQ(){
		String QQ = "12346";
		//检查QQ号码和规则是否匹配,String类的方法matches
		boolean b = QQ.matches("[1-9][\\d]{4,9}");
		System.out.println(b);
	}

	/*
	 *  检查手机号码是否合法
	 *  开头为1， 第二位 可以是34578，之后的为  0-9 ，位数固定11位
	 */
	public static void checkTel(){
		String telNumber = "13351280065";
		//String类的方法matches
		boolean b = telNumber.matches("1[34857][\\d]{9}");
		System.out.println(b);
	}

	/*
	 *  String类方法split对字符串进行切割
	 *  12-25-36-98  按照 - 对字符串进行切割
	 */
	public static void split_1(){
		String str = "12-25-36-98";
		//按照-对字符串进行切割,String类方法split
		String[] strArr = str.split("-");
		System.out.println("数组的长度" + strArr.length);
		for(int i = 0 ; i < strArr.length ; i++){
			System.out.println(strArr[i]);
		}
	}

	/*
	 * String类方法split对字符串进行切割
	 * 18 22 40 65 按照 空格 切割字符串
	 * 空格可多个
	 */
	public static void split_2(){
		String str = "18    22     40          65";
		// + 表示多个
		String[] strArr = str.split(" +");
		System.out.println("数组的长度" + strArr.length);
		for(int i = 0 ; i < strArr.length ; i++){
			System.out.println(strArr[i]);
		}
	}

	/*
	 * String类方法split对字符串进行切割
	 * 192.168.105.27 按照  点 切割字符串
	 */
	public static void split_3(){
		String ip = "192.168.105.27";
		String[] strArr = ip.split("\\.");
		System.out.println("数组的长度" + strArr.length);
		for(int i = 0 ; i < strArr.length ; i++){
			System.out.println(strArr[i]);
		}
	}

	/*
	 * "Hello12345World6789012"将所有数字替换掉
	 * String类方法replaceAll(正则规则,替换后的新字符串)
	 */
	public static void replaceAll_1(){
		String str = "Hello12345World6789012";
		str = str.replaceAll("[\\d]+", "#");
		System.out.println(str);
	}
	
	/*
	 *  检查邮件地址是否合法
	 *  规则:
	 *   1234567@qq.com
	 *   mym_ail@sina.com
	 *   nimail@163.com
	 *   wodemail@yahoo.com.cn    
	 *   
	 *   @: 前  数字字母_ 个数不能少于1个
	 *   @: 后  数字字母     个数不能少于1个
	 *   .: 后面 字母 
	 *     
	 */
	public static void checkMail(){
		String email ="abc123@sina.com";
		boolean b = email.matches("[a-zA-Z0-9_]+@[0-9a-z]+(\\.[a-z]+)+");
		System.out.println(b);
	}

}
