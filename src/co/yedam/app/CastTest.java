package co.yedam.app;

import java.util.Scanner;

/*
 * ����ȯ
 * byte < short < int < long
 * 
 * ��Ʈ�� <---> byte        Byte.parseByte(����)
 * 			  short	      Short.parseShort
 * 			  int         Integer.parseInt
 *            long        ....
 *            float       ....
 *            double      .... 
 *            char        ....
 *            boolean     ....
 *       <---- 
 * String.valueOf      
 */


public class CastTest {
	
	public static void main(String[] args) {
		// �ڵ�����ȯ
//		int a = 10;
//		long b = a;
//		
//		// ��������ȯ
//		a = (int)b;
//		
//		//char(����) <-> int(�ڵ�)
//		char c = 'Z';
//		System.out.println((int)c);
//		int d = 97;
//		System.out.println((char)d);
//		
//		//�Ǽ� -> ����
//		double e = 10.5;
//		int f = (int)e;
//		System.out.println(f);
//		
//		//()���� ���� ������� ���� ��� ����
//		double g = 5 + 10.5;
//		String h = "hi" + 5;
//		System.out.println("hi" + 5 + 10 );
//		System.out.println( 5 + 10 + "hi");
//		
//		//���� ������ ������ = ����
//		//���� �ϳ��� Ÿ���� �Ǽ������� �ٲ۰�� ��� ���� �Ǽ���
//		double i = 5/ (double)2;
//		System.out.println(i);
//		
//		//��Ʈ�� -> int 
//		String s1 = "123";
//		int j = Integer.parseInt(s1);
//		
//		//int -> ��Ʈ��
//		String s2 = String.valueOf(10.5);
//		System.out.println(s2);
//		
		Scanner scanner = new Scanner(System.in);
		System.out.print("�Է�:");
		String greet = scanner.next();
		System.out.println(greet);
		
		
	}

}
