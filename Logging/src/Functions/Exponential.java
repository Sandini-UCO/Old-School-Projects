package Functions;

public class Exponential {

    private static float Sum = 0;
    private static float temp = 0;
    public static void Power(float x, float y){
        Sum = (float) Math.pow(x,y);
    }

    public static float getSum() {
        return Sum;
    }
}
