// print your name 4times using recursion

public class printNameRec {
    static void printName(int i, int n){
        if(i>n) return;
        System.out.println("Mili");
        printName(i+1, n);
    }
   public static void main(String args[]) {
    int i=1, n=4;
    //printName(i,n);
    printName(i,n);
   } 
}
