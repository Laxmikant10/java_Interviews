package src.pratititech;

public class HighestNumberWithAnyDefaultMethod {
    public static void main(String[] args) {
        int[] arr = {5,1,2,8,3,4,6};
        int max = arr[0];

        for(int i =1;i<arr.length;i++){
            if(max<arr[i]){
                max = arr[i];
            }
        }
        System.out.println("The highest number is = " + max);
    }
}
