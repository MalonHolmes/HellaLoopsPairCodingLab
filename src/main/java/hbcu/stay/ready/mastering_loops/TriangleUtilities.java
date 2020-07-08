package hbcu.stay.ready.mastering_loops;

public class TriangleUtilities {
    
    public static String getTriangle(int numberOfRows) {
        String result = "";
        for(int row = 1; row <= numberOfRows; row++){
            result += getRow(row) + "\n";
        }
        return result;
    }

    public static String getRow(int width) {
        String result = "";
        for(int i = 1; i <= width; i++){
            result += "*";
        }
        return result;
    }
    
    public static String getSmallTriangle() {
        String result = "";
        for(int row = 1; row <= 4; row++){
            result += getRow(row) + "\n";
        }
        return result;
    }

    public static String getLargeTriangle() {
        String result = "";
        for(int row = 1; row <= 9; row++){
            result += getRow(row) + "\n";
        }
        return result;
    }
}
