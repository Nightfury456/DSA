public class maxSubarray {
    public static void maxSub(int numbers[]) {
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for(int i=0; i<numbers.length; i++) {
            for(int j=i; j<numbers.length; j++) {
                currSum = 0;
                for(int k=i; k<=j; k++) {
                    currSum += numbers[k];
                }
                System.out.println(currSum);
                if(maxSum < currSum) {
                    maxSum = currSum;
                }
            }
        }

        System.out.println("max sum ="+ maxSum);
    }

    public static void main(String[] args) {
        int numbers[] = {1,2,3,4};
        maxSub(numbers);
    }
}
