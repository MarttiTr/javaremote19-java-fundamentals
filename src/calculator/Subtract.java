package calculator;

public class Subtract {
    public float subtractArray(float[] inputArray) {

        float result = inputArray[0];

        for (int i = 1; i < inputArray.length; i++) {
            result -= inputArray[0];
        }
        return result;
    }
}
