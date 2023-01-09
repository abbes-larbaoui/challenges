import java.util.Arrays;

public class Methods {
    public static int closeToZero(int[] nums) {
        int close = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if (Math.abs(close) == nums[i] || Math.abs(close) > Math.abs(nums[i]))
                close = nums[i];
        }
        System.out.println("My Array ===> " + Arrays.toString(nums));
        System.out.println("Closest Number to Zero: " + close);
        return close;
    }
}
