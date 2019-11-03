/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignments;

/**
 *
 * @author sdas301
 */
public class StringFunctions {
    public static void main(String[] args) {
        
        String str = "The quick brown fox jumps over the lazy dog1231313";
        //String str = new String ("THE QUICK BROWN FOX");
        //char[] carr = str.toCharArray();
        System.out.println(hasUpper(str));
        System.out.println(hasNumber(str));
        if(isCapsOnly(str)){
            System.out.println("CAPS ONLY");
        }
        else{
            System.out.println("NOT CAPS ONLY");
        }
        System.out.println("No. of CAPS="+countCaps(str));
        System.out.println(myReplace(str, 'f', 'h'));
        System.out.println(myReplaceFirst(str, 't', 'Y'));
        System.out.println(myReplaceLast(str, 'o', 'a'));
        if(isEqual("hello","Hello")){
            System.out.println("EQUAL");
        }
        else{
            System.out.println("NOT EQUAL");
        }    
        System.out.println(revStringWOCaps("HeLloWorld"));
    }
    
    
    //HAS UPPER
    static String hasUpper(String data) {
        char[] carr = data.toCharArray();
        for(char ch : carr){
            if(ch>=65 && ch<=90){
                return "YES";
            }
        }
        return "NO";
    }
    
    
    
    //HAS NUMBER
    static String hasNumber(String data){
        char[] carr = data.toCharArray();
        for(char ch : carr){
            if(ch>=48 && ch<=57){
                return "YES";
            }
        }
        return "NO";
    }
    
    
    
    //CAPS ONLY
    static boolean isCapsOnly(String data){
        char[] carr = data.toCharArray();
        for(char ch : carr){
            if(!(ch>=65 && ch<=90) && ch!=' '){
                return false;
            }
        }
        return true;
    }
    
    
    //COUNT CAPS
    static int countCaps(String data){
        char[] carr = data.toCharArray();
        int count=0;
        for(char ch : carr){
            if(ch>=65 && ch<=90){
                count++;
            }
        }
        return count;
    }
    
    
    //REPLACE CHARS
    static String myReplace(String data, char oldChar , char newChar){
        char[] carr = data.toCharArray();
        for(int i=0; i<carr.length; i++){
            if(carr[i]==oldChar){
                carr[i]=newChar;
            }
        }
        return new String(carr);
    }
    
    
    //REPLACE FIRST CHAR
    static String myReplaceFirst(String data, char oldChar , char newChar){
        char[] carr = data.toCharArray();
        for(int i=0; i<carr.length; i++){
            if(carr[i]==oldChar){
                carr[i]=newChar;
                break;
            }
        }
        return new String(carr);
    }
    
    
    
    //REPLACE LAST CHAR
    static String myReplaceLast(String data, char oldChar , char newChar){
        char[] carr = data.toCharArray();
        for(int i=carr.length-1; i>=0; i--){
            if(carr[i]==oldChar){
                carr[i]=newChar;
                break;
            }
        }
        return new String(carr);
    }
    
    
    
    //CHECK CHAR IGNORE CASE
    static boolean isEqual(char c1 , char c2){
        if((c1>c2 && c1==c2+32)||(c1<c2 && c1==c2-32)||(c1==c2)){
            return true;
        }
        else{
            return false;
        }
    }
    
    
    
    //CHECK STRING IGNORE CASE
    static boolean isEqual(String str1 , String str2){
        char[] carr1=str1.toCharArray();
        char[] carr2=str2.toCharArray();
        if(carr1.length!=carr2.length){
            return false;
        }
        for(int i=0; i<carr1.length; i++){
            if(!isEqual(carr1[i], carr2[i])){
                return false;
            }
        }
        return true;
    }
   
    
    //REVERSE STRING WITHOUT CAPS POSITION
    static String revStringWOCaps(String data){
        char[] carr = data.toCharArray();
        char[] caxx = new char[carr.length];
        int k=0;
        for(int i=carr.length-1; i>=0; i--){
                caxx[k]=carr[i];
                if((carr[k]>=65 && carr[k]<=90)&&(caxx[k]>=97 && caxx[k]<=122)){
                        caxx[k]-=32;
                    }
                else
                    if((carr[k]>=97 && carr[k]<=122)&&(caxx[k]>=65 && caxx[k]<=90)){
                        caxx[k]+=32;
                    }
                k++;
        
        }
        return new String(caxx);
    }
    
    
}