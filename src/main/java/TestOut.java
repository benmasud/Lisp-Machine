import java.util.Scanner;

public class TestOut {public static Object a = 1;
    public static Object b = 2;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Object x = 4;
        if ((((Number) x).doubleValue()== ((Number) 1).doubleValue())) {System.out.println("1" );
        } else if ((((Number) x).doubleValue()== ((Number) 2).doubleValue())) {System.out.println("2" );
        } else if ((((Number) x).doubleValue()== ((Number) 3).doubleValue())) {System.out.println("3" );
        } else if (true) {System.out.println("S" );
        } else {
            throw new IllegalArgumentException("No branch of cond matched");
        };
        Object input = scanner.nextInt();
        System.out.println(input );
        System.out.println("CALL JAVA FROM LISP");
        for (int i = 1; i <= 5; i++) {
            System.out.println(i );
            System.out.println((((Number) 1).doubleValue()+ ((Number) i).doubleValue()));
        }
        ;
        Object lst = java.util.Arrays.asList(1, 2, 3, 4);
        System.out.println(lst);
        scanner.close();
    }
}