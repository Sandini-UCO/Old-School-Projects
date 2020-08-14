package Functions;

public class Modulus {

    private static float Sum = 0;

    public static void Mod(float x, float y){
        Sum = x % y;
    }

    public static float getSum() {
        return Sum;
    }
}

