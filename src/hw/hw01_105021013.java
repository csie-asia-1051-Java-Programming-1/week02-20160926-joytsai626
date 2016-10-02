package hw;
import java.util.*;
public class hw01_105021013 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner src=new Scanner(System.in);
		
		System.out.print("媽媽給的錢=");
		int n = src.nextInt();
		System.out.print("買了幾顆蘋果=");
		int a = src.nextInt();
		System.out.print("買了幾顆柳丁=");
		int b = src.nextInt();
		System.out.print("買了幾顆桃子=");
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
			System.out.println("剩餘:\n50元硬幣="+p+"\n5元硬幣="+q+"\n1元硬幣="+q1);
		}
		else
		{
			System.out.println("0");
		}
	}

}
