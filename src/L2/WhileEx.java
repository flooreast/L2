package L2;

public class WhileEx {

    public static void main(String[] args) {

        int i = 0;
        while (i < ForEx.LIMIT) {
            System.out.println(i);
            i++;
        }

        do {
            System.out.println(i);
            i++;
        } while (i < ForEx.LIMIT);

    }
}
