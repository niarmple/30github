public class MissingNumber {
    public static int findMissingNumber(int[] nums) {
        int n = nums.length + 1;
        int totalSum = n * (n + 1) / 2;
        int arraySum = 0;
        
        for (int num : nums) {
            arraySum += num;
        }
        
        return totalSum - arraySum;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 4, 5, 6}; // Example array
        System.out.println("The missing number is: " + findMissingNumber(nums));
    }
}
