/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jurnal;

/**
 *
 * @author Praktikum
 */
import java.util.Scanner;
public class Fibonaci
{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		System.out.print("Input: ");
		int n = s.nextInt();
                int hasil=0;
		for(int i=1;i<=n;i++){
                    //baru
                    System.out.print(fibo(i) + " ");
                }
		System.out.println();
	}

	private static int fibo(int n)
	{
		int f;
		if(n==1 || n==2){
                    f=1;
                }
                else{
                    f = fibo(n-1) + fibo(n-2);
                }
		return f;
	}
}