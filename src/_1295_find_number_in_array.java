public class _1295_find_number_in_array {
    public static int findNumbers(int[] nums) {
        int count =0;
        for (int a : nums) {
            // kiểm tra số chữ số của a
            // nếu số chữ số là chẵn thì tăng biến đếm lên 1
             int numberOfDigits = calculateTheNumberOfDigits(a);
            if (numberOfDigits % 2 ==0){
                count++;
            }
        }
        return count;
    }
    public static int calculateTheNumberOfDigits(int number){
        int count = 0;
        int result = number;
        while (result != 0){
            result = number / 10;
            number = result;
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        int nums[] = {12,1,233,2312,123123};
        findNumbers(nums);
        System.out.println(findNumbers(nums));
    }
}
