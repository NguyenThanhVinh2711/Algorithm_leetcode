public class demo {
    public static void main(String[] args) {
        for (int i = 10; i <= 200; i++) {
            if (i % 7 ==0){
                if (i % 5 != 0){
                    System.out.print( i + " " );
                }
            }
        }
    }
}
