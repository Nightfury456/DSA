import java.util.*;

public class largestNumber {
    public static int getLargest(int numbers[]) {
        int largest = Integer.MIN_VALUE; //-infinity
        for(int i=0; i<numbers.length; i++){
            if(largest < numbers[i]){
                largest = numbers[i];
            }
        }
        return largest;
    }

    public static void main(String[] args) {
        int numbers[] = {1,5,8,4,3,6};
        System.out.println("largest number is: " + getLargest(numbers));
    }
    
}
