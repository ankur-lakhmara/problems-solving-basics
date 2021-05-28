public class Bubble_sort {
    public static void main(String[]args){
        int[] arr= {5,4,3,8,7,9,11,6};
        int i,j;
        for( i=0; i<arr.length;i++){
            for(j = 0; j<arr.length-1-i; j++){
                if(arr[j]<arr[j+1]){
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }
            System.out.println(arr[j]);
        }

    }
}
