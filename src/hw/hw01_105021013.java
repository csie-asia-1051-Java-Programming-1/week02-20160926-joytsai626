package hw;
import java.util.*;
public class hw01_105021013 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner src=new Scanner(System.in);
		
		System.out.print("����������=");
		int n = src.nextInt();
		System.out.print("�R�F�X��ī�G=");
		int a = src.nextInt();
		System.out.print("�R�F�X���h�B=");
		int b = src.nextInt();
		System.out.print("�R�F�X����l=");
		int c = src.nextInt();
		
		if (n>=a*15+b*20+c*30)
		{
			int x=a*15+b*20+c*30;
			int p=0;
			int p1=0;
			int q=0;
			int q1=0;
			
			if(n>=x)
			{
				 p=x/50;
				p1=x%50;
				q=p1/5;
				 q1=q%5;
			}
			System.out.println("�Ѿl:\n50���w��="+p+"\n5���w��="+q+"\n1���w��="+q1);
		}
		else
		{
			System.out.println("0");
		}
	}

}
