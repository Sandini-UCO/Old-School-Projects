package Functions;

public class Multiplication {

    private static float Sum = 0;

    public static void Multiply(float x, float y){
        Sum = x * y;
    }

    public static float getSum() {
        return Sum;
    }
}
