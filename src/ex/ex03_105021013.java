package ex;
/*
 * Topic: 假設某個停車場的費率是停車2小時以內，每半小時30元，超過2小時，但未滿4小時的部份，
 * 	每半小時40元，超過4小時以上的部份，每半小時60元，未滿半小時部分不計費。
 * 	如果您從早上10點23分停到下午3點20分，請撰寫程式計算共需繳交的停車費。
 * Date: 2016/09/26
 * Author: 105021013 蔡孟璇
 */
import java.util.Scanner;
public class ex03_105021013 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner src=new Scanner(System.in);
		int a1=src.nextInt();
		int a2=src.nextInt();
		int b1=src.nextInt();
		int b2=src.nextInt();
		int c=(b1*60+b2)-(a1*60+a2);
		int d=(c/30);
		int sum=0;
		if(d>8)
		{
		    sum=120+160+(d-8)*60;
		}
		else if(d>4&&d<=8)
		{
			sum=120+(d-4)*40;
		}
		else
		{
			sum=d*30;
		}
		
		System.out.print(sum);
		}
}
