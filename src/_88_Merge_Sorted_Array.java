public class _88_Merge_Sorted_Array {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        for (int x : nums2) {
            chenphantuvaomang(x, nums1, m);
            m++;
        }
    }
//    public static void merge(int[] nums1, int m, int[] nums2, int n) {
//        int i = m - 1;
//        int j = n - 1;
//        int k = m + n - 1;
//        while (j >= 0) {
//            if (i >= 0 && nums1[i] > nums2[j]) {
//                nums1[k] = nums1[i];
//                k--;
//                i--;
//            }
//            else {
//                nums1[k] = nums2[j];
//                k--;
//                j--;
//            }
//        }
//    }

    private static void chenphantuvaomang(int x, int[] nums1, int m) {
        boolean timduoc = false;
        for (int i = 0; i < m; i++) {
            if (nums1[i] > x) {
                timduoc = true;
                for (int j = m - 1; j >= i; j--) {
                    nums1[j + 1] = nums1[j];
                }
                nums1[i] = x;
                break;
            }
        }
        if (timduoc == false) {
            nums1[m] = x;
        }
    }

    public static void main(String[] args) {
        int num1[] = {1, 3, 56, 0, 0, 0, 0, 0, 0};
        int num2[] = {2, 6, 8};


        merge(num1, 6, num2, 3);
        System.out.println("done");
    }
}
