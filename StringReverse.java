// User function Template for Java

class Solution {
    public static String reverseString(String s) {
        // code here
     /*   char[] arr = s.toCharArray();
        int i=0;
        int n =arr.length-1;
        
        while(i<n){
            char temp = arr[i];
            arr[i]=arr[n];
            arr[n]=temp;
            
            i++;
            n--;
        }
        return new String(arr);*/
        return new StringBuilder(s).reverse().toString();
    }
}
