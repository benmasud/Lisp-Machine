import java.util.Scanner;

public class TestOut {public static Object add(Object a, Object b) {
    return (((Number) a).doubleValue()+((Number) b).doubleValue());
}
    public static Object aAdd(Object a, Object b) {
        return (((Number) (((Number) a).doubleValue()+((Number) b).doubleValue())).doubleValue()+((Number) a).doubleValue());
    }
    public static Object subtract(Object a, Object b) {
        return (((Number) a).doubleValue()-((Number) b).doubleValue());
    }
    public static Object multiply(Object a, Object b) {
        return (((Number) a).doubleValue()*((Number) b).doubleValue());
    }
    public static Object divide(Object a, Object b) {
        return (((Number) a).doubleValue()/((Number) b).doubleValue());
    }
    public static Object factorial(Object a) {
        if ((((Number) a).doubleValue()>((Number) 1).doubleValue())) {
            return (((Number) a).doubleValue()*((Number) factorial((((Number) a).doubleValue()-((Number) 1).doubleValue()))).doubleValue());

        } else {
            return 1;
        }}
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        Object input = scanner.nextInt();
        System.out.println(input );




        scanner.close();
    }
}