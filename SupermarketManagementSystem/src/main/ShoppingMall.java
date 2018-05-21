package main;

import java.util.ArrayList;
import java.util.Scanner;

/*
 *   ���й���ϵͳ
 *   ʵ��:
 *     1. ��Ʒ���ݵĳ�ʼ��
 *     2. �û��Ĳ˵�ѡ��
 *     3. ����ѡ��ִ�в�ͬ�Ĺ���
 *       3.1 Read    �鿴��Ʒ
 *       3.2 Add  �����Ʒ
 *       3.3 Delete  ɾ����Ʒ
 *       3.4 Update  �޸���Ʒ
 *       
 *   ���й��� ,���붨�巽��ʵ��
 *   ������main  ��������
 */

public class ShoppingMall {

	public static void main(String[] args) {
		ArrayList<FruitItem> array = new ArrayList<FruitItem>();
		// ������Ʒ��ʼ������,���ݼ���
		init(array);
		while(true) {
			// ���ò˵�
			mainMenu();
			// �����û�ѡ���ŷ���
			int chooseNum = getChoiceNumber();
			switch (chooseNum) {
			case 1:
				// ���� �����嵥
				showFruitsList(array);
				break;
			case 2:
				// ���� ��ӻ���
				addFruit(array);
				break;
			case 3:
				// ���� ɾ������
				deleteFruit(array);
				break;
			case 4:
				// ���� �޸Ļ���
				updateFruit(array);
				break;
			case 5:
				// ���� �˳�
				System.out.println("�˳�ϵͳ�ɹ���");
				return;
			default:
				System.out.println("�������Ų����ڣ�");
				break;
			}
		}
	}

	/*
	 * ���巽��, ʵ�����˵�
	 */
	public static void mainMenu(){
		System.out.println();
        System.out.println("=========== ��ӭ���� asdfv ���� ===========");
        System.out.println("1: ���� �嵥   2: ��ӻ���   3: ɾ������   4: �޸Ļ���  5: �˳�");
        System.out.println("������Ҫ�����Ĺ������:");
	}
	
	public static void init(ArrayList<FruitItem> array) {
		// ���������FruitItem����, �������Ը�ֵ
		FruitItem f1 = new FruitItem();
		f1.ID = 9527;
		f1.name = "ƻ��";
		f1.price = 12.7;

		FruitItem f2 = new FruitItem();
		f2.ID = 9008;
		f2.name = "�㽶";
		f2.price = 5.6;

		FruitItem f3 = new FruitItem();
		f3.ID = 9879;
		f3.name = "���ܹ�";
		f3.price = 599.6;

		// ��������3��FruitItem���ͱ���, �洢��������
		array.add(f1);
		array.add(f2);
		array.add(f3);
	}
	
	/*
	 *  ���巽��, ʵ�ֽ����û��ļ�������
	 *  ���ر��
	 */
	public static int getChoiceNumber(){
		Scanner sc = new Scanner(System.in);
		return sc.nextInt();
	}
	
	/*
	 *  ���巽��, ʵ����ʾ�����嵥����
	 *  ����ֵ: ��
	 *  ����: ����
	 *  ��������, ��ȡ�����е�ÿ��FruitItem����,����,��������
	 */
	public static void showFruitsList(ArrayList<FruitItem> array){
		System.out.println();
		System.out.println("===============��Ʒ����嵥===============");
		System.out.println("��Ʒ���                ��Ʒ����                ��Ʒ����");
		//��������
		for(int i = 0 ; i < array.size(); i++){
			// ����get����,��ȡ��ÿ��FruitItem����,����ʹ��FruitItem����get���
			FruitItem item = array.get(i);
			// ����item������������
			System.out.println(item.ID + "    " + item.name + "        " + item.price);
		}
	}
	
	/*
	 * ���巽��,ʵ����Ʒ����ӹ���
	 * ����ֵ:��
	 * ����: ����
	 * ��ʾ�û�ѡ����������Ʒ�Ĺ���
	 * 
	 * ��ʾ�û��������ʲô
	 * 
	 * ����FruitItem����,�������õ�����
	 * �������ÿ����Ʒ���Խ��и�ֵ
	 */
	public static void addFruit(ArrayList<FruitItem> array){
		System.out.println("ѡ����������Ʒ����");
		//����Scanner����
		Scanner sc = new Scanner(System.in);
		System.out.println("��������Ʒ�ı��");
		//������Ʒ�ı��
		int ID = sc.nextInt();
		//������Ʒ������
		System.out.println("��������Ʒ������");
		String name = sc.next();
		//������Ʒ�ĵ���
		System.out.println("������Ʒ�ĵ���");
		double price = sc.nextDouble();
		//����FruitItem����
		FruitItem item = new FruitItem();
		//item.���Ը�ֵ
		item.ID = ID;
		item.name = name;
		item.price = price;
		array.add(item);
		System.out.println("��Ʒ��ӳɹ���");
	}
	
	/*
	 *  ���巽��,ʵ����Ʒ��ɾ������
	 *  ����ֵ:����
	 *  ������������
	 *  
	 *  ɾ������������Ʒ�ı��
	 *  ��ʾ�û�ѡ�����ɾ������
	 *  ����������Ʒ�ı��
	 *  �������ϣ���ȡ�����е�ÿ��FruitItem����
	 *  ������������ ID�� ���û�������ı��,�Ա�,��ͬ��ɾ��
	 */
	public static void deleteFruit(ArrayList<FruitItem> array){
		System.out.println("ѡ�����ɾ������");
		System.out.println("��������Ʒ�ı��");
		Scanner sc = new Scanner(System.in);
		
		int ID = sc.nextInt();
		//��������
		for(int i = 0 ; i < array.size(); i++){
			//��ȡ��ÿ��FruitItem����
			FruitItem item = array.get(i);
			//����,��������ID,���û�����ı�űȽ�
			if( item.ID == ID){
				//�Ƴ������е�Ԫ��
				//���ϵķ���removeʵ��
				array.remove(i);
				System.out.println("ɾ���ɹ�");
				return;
			}
		}
		System.out.println("������ı�Ų�����");
	}
	
	/*
	 *  ���巽��,ʵ����Ʒ���޸Ĺ���
	 *  ����ֵ:����
	 *  ������������
	 *  
	 *  ��ʾ�û�ѡ������޸Ĺ���
	 *  ��ʾ�û�������Ҫ�޸ĵ���Ʒ���
	 *  ��������,��ȡÿ��FruitItem����
	 *  ��������ID����,���Ժ��û�����ı�űȽ�
	 *  �����ͬ:
	 *    �޸ĵ�FruitItem�е�����ֵ
	 *    ��������
	 */
	public static void updateFruit(ArrayList<FruitItem> array){
		System.out.println("ѡ������޸Ĺ���");
		System.out.println("��������Ʒ�ı��");
		
		Scanner sc = new Scanner(System.in);
		int ID = sc.nextInt();
		//��������,��ȡÿ��FruitItem����
		for(int i = 0 ; i < array.size(); i++){
			FruitItem item = array.get(i);
			//��ȡFruitItem������ID,���û������ID�Ƚ�
			if(item.ID == ID){
				System.out.println("�����µ���Ʒ���");
				item.ID = sc.nextInt();
				
				System.out.println("�����µ���Ʒ����");
				item.name = sc.next();
				
				System.out.println("�����µ���Ʒ�۸�");
				item.price = sc.nextDouble();
				System.out.println("��Ʒ�޸ĳɹ�");
				return ;
			}
		}
		System.out.println("����ı�Ų�����");
	}
}
