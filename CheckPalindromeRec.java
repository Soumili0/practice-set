import java.util.*;
public class CheckPalindromeRec{
static boolean checkPalindrome(String s,int i){
    if(i>=s.length()/2){
        return true;
    }
    if(s.charAt(i)!= s.charAt(s.length()-i-1)){
        return false;
    }
    return checkPalindrome(s, i+1);

}
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a string:");
        String s = sc.nextLine();
        boolean result =  checkPalindrome(s,0);
        if(result){
            System.out.println("palindrome");
        }
        else{
            System.out.println("not palindrome");
        }
    }
}