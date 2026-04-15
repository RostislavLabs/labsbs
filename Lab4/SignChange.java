public class SignChange {

    public static void task4() {
        int[] nums = {1,2,3,4,5,6,7,8,9};

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 != 0) {
                nums[i] = -nums[i];
            }
        }

        System.out.println("\nМасив після зміни:");
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}