// User function Template for Java

class Solution {
    static boolean isOperator(char x){
        switch(x){
            case'+':
            case'-':
            case'/':
            case'*':
                return true;
        }
        return false;
    }
    static String postToPre(String st) {
        // code here
        Stack<String>s = new Stack<>();
        int n = st.length();
        
        for(int i=0;i<n;i++){
            if(isOperator(st.charAt(i))){
                String op1 =s.peek();
                s.pop();
                String op2 =s.peek();
                s.pop();
                
                
    String temp = st.charAt(i)+op2+op1;
    s.push(temp);
            }
            else{
                s.push(st.charAt(i)+"");
            }
        }
        String ans = " ";
        for( String i:s)
        ans +=i;
        return ans;
        
    }
}
