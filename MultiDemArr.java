package module6;
import java.util.Scanner;
public class MultiDemArr {

	public static void main(String[] args) {
	     Scanner sc=new Scanner(System.in); 
        System.out.println("entre 12 elements");
		int [][]arr=new int[3][4];
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<4;j++)
			{
				arr[i][j]=sc.nextInt();
			}
		}
		System.out.println("===============");
		System.out.println("display the arr");
		System.out.println("rollno        C++       Java        Mysql");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<4;j++)
			{
				System.out.println(arr[i][j] + "\t\t");
			}
		}
		System.out.println();	
		
	}

}
