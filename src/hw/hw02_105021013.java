package hw;
import java.util.Scanner;
public class hw02_105021013 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner src=new Scanner(System.in);
		System.out.println("男生輸入1,女生輸入2");
		int a=src.nextInt();
		System.out.println("輸入身高");
		int b=src.nextInt();
		double sum=0;
		if(a==1){
	        sum=(b-80)*0.7;   
		}else{
			sum=(b-70)*0.6;
		}
		
		System.out.print(sum);
		System.out.print("kg");
	}
	

}
