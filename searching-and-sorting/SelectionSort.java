import java.util.Arrays;

public class SelectionSort {

  public static void main(String[] args) {

    int[] nums = { 31, 3, 2, 23, 4, 7, 13, 99, 6 };

    for (int i = 0; i < nums.length - 1; i++) {
      int min = i;
      for (int j = i + 1; j < nums.length; j++) {
        if (nums[min] > nums[j]) {
          min = j;
        }
      }
      int temp = nums[i];
      nums[i] = nums[min];
      nums[min] = temp;
    }

    System.out.println(Arrays.toString(nums));
  }

}
