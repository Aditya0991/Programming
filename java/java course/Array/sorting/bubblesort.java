public class bubblesort{
    public static void main(String[] args) {
         int []arr = {7,8,2,3,1};
        //  bubble sort
        for (int i = 0 ; i < arr.length ; i++){
            int current = arr[i];
            int j = i-1;
            while(j >= 0 && current < arr[j]){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = current;
        }
        printarray(arr);
    }

public static void printarray(int arr[]){
    for(int i = 0; i<arr.length ; i++){
        System.out.print(arr[i] + " ");
        System.out.println();
    }
}
}