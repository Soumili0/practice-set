import java.util.*;

class Solution {

    static boolean isOperator(char x) {

        switch (x) {
            case '+':
            case '-':
            case '*':
            case '/':
                return true;
        }

        return false;
    }

    public String prefixToInfix(String st) {

        Stack<String> s = new Stack<>();

        int n = st.length();

        for (int i = n - 1; i >= 0; i--) {

            char ch = st.charAt(i);

            if (isOperator(ch)) {

                String op1 = s.pop();
                String op2 = s.pop();

                String temp = "("+op1 + ch + op2+")";

                s.push(temp);
            }
            else {

                s.push(ch + "");
            }
        }

        return s.peek();
    }
}
