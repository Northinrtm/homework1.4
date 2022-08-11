public class Task3 {
    public static void main(String[] args) {
        int year = 2022;
        for(int i = 0;i <= year + 100;i++){
            if((i >= (year - 200)) & ((i % 79) == 0)) {
                System.out.println(i);
            }
        }
    }
}
