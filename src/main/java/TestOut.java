import java.util.function.Function;

public class TestOut {public static Object add(Object a, Object b) {
    return (((Number) a).doubleValue() + ((Number) b).doubleValue());
}
    public static Object aAdd(Object a, Object b) {
        return (((Number) (((Number) a).doubleValue()+ ((Number) b).doubleValue())).doubleValue() + ((Number) a).doubleValue());
    }
    public static Object subtract(Object a, Object b) {
        return (((Number) a).doubleValue() - ((Number) b).doubleValue());
    }
    public static Object multiply(Object a, Object b) {
        return (((Number) a).doubleValue() * ((Number) b).doubleValue());
    }
    public static Object divide(Object a, Object b) {
        return (((Number) a).doubleValue() / ((Number) b).doubleValue());
    }
    public static Object factorial(Object a) {
        if ((((Number) a).doubleValue()> ((Number) 1).doubleValue())) {
            return (((Number) a).doubleValue() * ((Number) factorial((((Number) a).doubleValue()- ((Number) 1).doubleValue()))).doubleValue());

        } else {
            return 1;
        }}
    public static void main(String[] args) {System.out.println(java.util.Arrays.asList(1, 2, 3, 4));
        Function<Object, Object> lambdaFunction1 = (x) -> {return (((Number) x).doubleValue() * ((Number) x).doubleValue());
        };
        lambdaFunction1.apply(5);
        add(3, 1);
        subtract(10, 4);
        multiply(2, 6);
        divide(8, 2);
        System.out.println("dddqddq" );
        Object x = 10;
        Object y = 5;
        System.out.println(add(x, y));
        System.out.println(true || false);
        System.out.println((((Number) 4).doubleValue()> ((Number) 2).doubleValue()) && (((Number) 3).doubleValue()== ((Number) 1).doubleValue()));
        System.out.println(factorial(5));
        System.out.println((((Number) 5).doubleValue()> ((Number) 3).doubleValue()) && (((Number) 7).doubleValue()< ((Number) 10).doubleValue()));
        System.out.println((((Number) 5).doubleValue()< ((Number) 3).doubleValue()) || (((Number) 7).doubleValue()> ((Number) 10).doubleValue()));
        System.out.println(!(((Number) 5).doubleValue()== ((Number) 5).doubleValue()));
        System.out.println((((Number) 10).doubleValue()% ((Number) 3).doubleValue()));
        System.out.println((((Number) 10).doubleValue()% ((Number) 3).doubleValue()));
    }
}