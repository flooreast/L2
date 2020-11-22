package L2;

public class ForEx {

    public static final int LIMIT = 20;
    public static final int STOP_DIGIT = 1;
    public static final int DIVIDER = 2;

    public static void main(String[] args) {

        int i = 0;
        for (; i < LIMIT; i++) {
            System.out.println(i);
        }
        System.out.println("Final result - " + i);

        for (int j = LIMIT; j > 0; j--) {
            if (j % DIVIDER == 0) {
                continue;
            }
            if (j  == STOP_DIGIT) {
                break;
            }
            System.out.println(j);
        }
    }

}
