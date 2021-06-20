package tk.chaber.triangles_properties.util;

public class Value {
    public static double HIGHEST_SAFE_PRECISION = 0.0001; //Based on tests done

    public static double round(double input){
        double multiplier = 1 / HIGHEST_SAFE_PRECISION;

        double multipliedInput = input * multiplier;

        double multipliedRounded = Math.round(multipliedInput);

        return multipliedRounded / multiplier;
    }

    public static double round(double input, double roundTo){
        double multiplier = 1 / roundTo;

        double multipliedInput = input * multiplier;

        double multipliedRounded = Math.round(multipliedInput);

        return multipliedRounded / multiplier;
    }

    public static String simplify(double input){
        double rounded = round(input, HIGHEST_SAFE_PRECISION);

        return String.valueOf(rounded);
    }
}
