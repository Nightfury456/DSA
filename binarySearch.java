public class binarySearch {
    public static int search(int numbers[],int key){
        int n = numbers.length;
        int start = 0;
        int end = n-1;

        while(start <= end) {
            int mid = (start + end)/2;
            // comparisons
            if(numbers[mid] == key){
                return mid;
            } if(numbers[mid] < key) {
                start = mid+1;
            } else{
                end = mid-1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int numbers[] = {2,4,6,8,10,12,14};
        int key = 10;
        System.out.println("key found at index:" + search(numbers, key));
    }
}