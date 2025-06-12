import java.util.Arrays;

public class BubbleSort {

  public static void main(String[] args) {

    int[] nums = { 31, 3, 2, 23, 4, 7, 13, 99, 6 };

    for (int i = 0; i < nums.length; i++) {
      boolean flag = false;
      for (int j = 0; j < nums.length - i - 1; j++) {
        if (nums[j] > nums[j + 1]) {
          flag = true;
          int temp = nums[j + 1];
          nums[j + 1] = nums[j];
          nums[j] = temp;
        }
      }
      if (!flag) {
        break;
      }
    }

    System.out.println(Arrays.toString(nums));
  }

}
