import java.util.*;
public class Palindrome{
   static boolean isPalindromeNumber(String s,int l,int r){
    if(l>=r)
        return true;
    if(s.charAt(l)!= s.charAt(r))
        return false;
    return isPalindromeNumber(s, l+1, r-1);
   }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the strings:");
        String s= sc.next();
        if(isPalindromeNumber(s,0,s.length()-1))
            System.out.println("palindrome");
        else
            System.out.println("not");
    }
}