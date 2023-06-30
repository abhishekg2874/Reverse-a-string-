import java.util.Scanner;
public class reverceString {
    public static void reString(String str, int indx, String newString){
      if(indx==str.length()){
        System.out.println(newString);
        return;
      }
      char currChar=str.charAt(indx);
      newString=currChar+newString;
      reString(str, indx+1, newString);
    }
    public static void main(String args[]){
     String str="Hello World!";
     reString(str,0,"");
    }
}