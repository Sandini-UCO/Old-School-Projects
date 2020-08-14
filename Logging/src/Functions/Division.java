package Functions;

public class Division {

    private static float Sum = 0;

    public static void Divide(float x, float y){
        Sum = x / y;
    }

    public static float getSum() {
        return Sum;
    }
}
