import java.util.Scanner;

public class TestOut {
    public static Object checkProgn() {
        System.out.println("e");
        System.out.println("9");
        return (((Number) 5).doubleValue() + ((Number) 5).doubleValue());
    }

    public static Object factorial(Object a) {
        if ((((Number) a).doubleValue() > ((Number) 1).doubleValue())) {
            return (((Number) a).doubleValue() * ((Number) factorial((((Number) a).doubleValue() - ((Number) 1).doubleValue()))).doubleValue());

        } else {
            return 1;
        }
    }

    public static Object x = 10;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Object x = 10;
        Object y = "Hello";
        Object z = (((Number) x).doubleValue() + ((Number) 5).doubleValue());
        System.out.println(z);
        System.out.println(x);
        Object input = scanner.nextInt();
        System.out.println(input);
        Object i = 0;
        Object j = 10;
        while (!(((Number) i).doubleValue() >= ((Number) 5).doubleValue())) {
            System.out.println(java.util.Arrays.asList(i, j));
            System.out.println(java.util.Arrays.asList(j, i));
            i = (((Number) i).doubleValue() + ((Number) 1).doubleValue());
            j = (((Number) j).doubleValue() - ((Number) 2).doubleValue());

        }
        ;
        scanner.close();
    }
}