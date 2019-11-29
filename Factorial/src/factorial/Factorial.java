package factorial;


public class Factorial {

    public static void main(String[] args) {
        int num1;
        int num2;

        num1 = 8;

        int i;
        if (num1 == 0) num2 = 1;
        else {
            num2 = 1;
            for (i = num1; i >= 1; i--) {
                num2 = num2 * i;
            }
        }

        System.out.println(num2);
    }

}
