public class Main {

    public static void main(String[] args) {

        float myMinFloatValue = (Float.MIN_VALUE);
        float myMaxFloatValue = (Float.MAX_VALUE);
        System.out.println("Float minimum value = " + myMinFloatValue);
        System.out.println("Float maximum value = " + myMaxFloatValue);

        double myMinDoubleValue = (Double.MIN_VALUE);
        double myMaxDoubleValue = (Double.MAX_VALUE);
        System.out.println("Double minimum value = " + myMinDoubleValue);
        System.out.println("Double maximum value = " + myMaxDoubleValue);

        int myIntValue = 5 / 2;
        float myFloatValue = 5f / 2f;
        double myDoubleValue = 5d / 2d;
        System.out.printf("MyIntValue= " + myIntValue);
        System.out.printf("myFloatValue= " + myFloatValue);
        System.out.printf("myDoubleValue= " + myDoubleValue);

        double numberOfPounds = 200d;
        double convertedKilograms = numberOfPounds * 0.45359237d;
        System.out.println("Converted kilograms= " + convertedKilograms);

    }
}