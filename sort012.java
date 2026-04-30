//dutch national flag algo
class Solution {
    public void sort012(int[] arr) {
        int low=0,mid=0,high=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
            low++;
            }
            else if(arr[i]==1){
            mid++;
            }
            else{
            high++;
            }
        }
        for(int j=0;j<arr.length;j++){
            if(j<low){
                arr[j]=0;
            }else if(j<low+mid){
                arr[j]=1;
            }else{
                arr[j]=2;
            }
        }

    }
}

