public class Task2 {
    public static void main(String[] args) {
        int a = 4;
        for (int i = 1; i <= 31; i++) {
            if ((i == a) | (i == (a + 7)) | (i == (a + 14)) | (i == (a + 21))) {
                System.out.println("Сегодня пятница, " + i + "-е число. Необходимо подготовить отчет.");
            }
        }
    }
}
