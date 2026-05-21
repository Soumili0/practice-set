public class GfG {
    // unsets the rightmost set bit 
    // of n and returns the result 
    public static int unsetLSB(int n)  { 
        return (n & (n - 1)); 
    } 

    public static void main(String[] args) { 
        int n = 12; 
        System.out.println(" Rightmost unsetBit: " + unsetLSB(n)); 
    }
}
