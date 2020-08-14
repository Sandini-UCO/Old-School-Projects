package Functions;

public class Addition {
    private static float Sum = 0;

    public static void Add(float x, float y){
        Sum = x + y;
    }

    public static float getSum() {
        return Sum;
    }
}
