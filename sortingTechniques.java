import java.util.*;

public class sortingTechniques {
    
    public static void bubbleSort(int arr[]){
        int n = arr.length;
        for(int turns=0; turns<n-1; turns++){
            for(int j=0; j<n-1-turns; j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    public static void sellectionSort(int arr[]){
        int n = arr.length;
        for(int i=0; i<n-1; i++){
            int min = i;
            for(int j=i+1; j<n; j++){
                if(arr[min]>arr[j]){
                    min = j;
                }
            }
            // swap 
            int  temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
    }

    public static void insertionSort(int arr[]){
        int n = arr.length;
        for(int i=1; i<n; i++){
            int curr = arr[i];
            int prev = i-1;
            
            // finding position
            while (prev>=0 && arr[prev] > curr) {
                arr[prev+1] = arr[prev];
                prev--;
            }

            // insertion
            arr[prev+1] = curr;
        }
    }

    public static void countingSort(int arr[]) {
        int n = arr.length;
        int largest = Integer.MIN_VALUE;
        for(int i=0; i<n; i++){
            largest = Math.max(largest, arr[i]);
        }

        // frequency
        int count[] = new int[largest+1];
        for(int i=0; i<n; i++){
            count[arr[i]]++;
        }

        // sorting
        int j = 0;
        for(int i=0; i<count.length; i++){
            while(count[i]>0){
                arr[j] = i;
                j++;
                count[i]--;
            }
        }
    }

    public static void printarr(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = {5,4,1,3,2};
        // bubbleSort(arr);
        // sellectionSort(arr);
        // insertionSort(arr);
        // Arrays.sort(arr); //direct method
        countingSort(arr);
        printarr(arr);
    }
}
