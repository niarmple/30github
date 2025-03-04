class MajorityElement {
    public static int findMajorityElement(int[] nums) {
        int candidate = nums[0], count = 1;

        // Step hk1: Find a candidate
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == candidate) {
                count++;
            } else {
                count--;
                if (count == 0) {
                    candidate = nums[i];
                    count = 1;
                }
            }
        }

        // Step 2: Verify the candidate (optional)
        count = 0;
        for (int num : nums) {
            if (num == candidate) {
                count++;
            }
        }

        return count > nums.length / 2 ? candidate : -1; // Return -1 if no majority element
    }

    public static void main(String[] args) {
        int[] nums = {3, 3, 4, 2, 3, 3, 3, 1};
        System.out.println("Majority Element: " + findMajorityElement(nums));
    }
}
