package privat;

public class NameFactory {
    private static String MODIFICATION = "x1";
    private static String YEAR = "2019";
    private static String COLOR = "blue";

    public static String getCarName(){
        return  MODIFICATION+"-"+YEAR+"-"+COLOR;
    }
}
