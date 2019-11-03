/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.*;
/**
 *
 * @author sdas301
 */
class Digits {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number:");
		int n = sc.nextInt();
                System.out.println(n);
		int count=0;
		while(n!=0){
			count++;
			n=n/10;
		}
		System.out.println("The given number contains "+count+" digits");
	}
}
