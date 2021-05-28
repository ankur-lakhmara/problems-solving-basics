public class selection_sort {
    public static void main(String[]args){
        int[] arr = {3,5,7,11,9,2,1,6};
        int i,j;
        for(i = 0; i < arr.length-1; i++) {
            for(j = i+1; j < arr.length; j++) {
                if(arr[i] > arr[j]) {
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
            System.out.println(arr[i]);
        }
        System.out.println(arr[i]);
    }
}
