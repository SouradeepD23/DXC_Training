/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;
import java.util.*;

/**
 *
 * @author sdas301
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter string:");
		String s=sc.nextLine();
		String rev="";
		int i, vowels=0, consonants=0;
		char ch;
		for(i=s.length()-1; i>=0; i--)
		{	
			ch=s.charAt(i);
			rev+=ch;
			if(ch>=65 && ch<=90)
				ch=(char) (ch+32);
			
			if(ch>=97 && ch<=122){
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
				vowels++;
			else
				consonants++;
			}
		}
		System.out.println(rev+", the given string contains "+ vowels + " vowels and " + consonants + " consonants");
	}
    
}
