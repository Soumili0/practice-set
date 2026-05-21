class Solution{
  static string getBinaryRepresentation(int n){
    String binary = Integer.toBinaryString(n);
    while(binary.length<32){
      binary="0"+binary;
    }
    return binary;
  }
}
