import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _27_Remove_Element {
//    public static int removeElement(Integer[] nums, int val) {
//        int n = nums.length;
//        for (int i = 0; i < n; ) {
//            if (nums[i] == val) {
//                // xoa phan tu nums[i]
//                for (int j = i; j <= n - 2; j++) {
//                    nums[j] = nums[j + 1];
//                }
//                n--;
//            } else {
//                i++;
//            }
//        }
//        return n;
//    }

    public static void remove(Integer[] nums , int val){
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                list.add(nums[i]);
            }
        }
        nums = list.toArray(new Integer[0]);
        Arrays.toString(nums);
    }

    public static void main(String[] args) {
        Integer[] arr = {3, 2, 1, 4, 2, 2, 3, 2};
        int remove = 3;
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != remove) {
                list.add(arr[i]);
            }
        }
        arr = list.toArray(new Integer[0]);
        System.out.println(Arrays.toString(arr));
    }
//public static void main(String[] args){
//    Integer[] arr = {3,1,5,6,5};
//    System.out.println("Mang ban dau:\n"+Arrays.toString(arr));
//
//    //Chỉ định phần tử cần xóa
//    int elementToBeDeleted= 5;
//
//    //Tạo một ArrayList mới để chứa kết quả
//    List<Integer> list = new ArrayList<Integer>();
//
//
//    //Lặp lại vòng lặp, so sánh và thêm các giá trị (trừ giá trị cần xóa) vào ArrayList
//    for (int i = 0; i < arr.length-1; i++) {
//        if(arr[i] != elementToBeDeleted){
//            list.add(arr[i]);
//        }
//    }
//
//    // Chuyển ArrayList kết quả trở về Array và lưu trong mảng kết quả
//    arr = list.toArray(new Integer[0]);
//
//    // In mảng kết quả
//    System.out.println("Mang ket qua :\n"+Arrays.toString(arr));
//}
}
