package Arrays;

public class SumOfElements {
    static  int sum(int arr[] , int n){
        int s = 0;
        for (int i = 0; i < arr.length; i++) {
            s = s + arr[i];
        }
        return s;
    }
    public static void main(String[] args) {
        int [] arr = {1,3,6,5};
        System.out.println(sum(arr,4));
    }
}
