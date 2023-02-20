import java.util.Arrays;

public class _88_Merge_Sorted_Array {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1;
        int j = n - 1;
        int k = m + n - 1;
        while (j >= 0) {
            if (i >= 0 && nums1[i] > nums2[j]) {
                nums1[k] = nums1[i];
                k--;
                i--;
            }
            else {
                nums1[k] = nums2[j];
                k--;
                j--;
            }
        }
    }
    public static void main(String[] args) {
        int num1[] = {1, 3, 56, 0, 0, 0};
        int num2[] = {2, 6, 8};
        merge(num1, 3, num2, 3);
        System.out.println(Arrays.toString(num1));
        System.out.println("done");
    }
}
