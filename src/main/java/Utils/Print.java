package Utils;

public class Print {
    //Overload
    public static void print(Enum Colors, String string){
        System.out.println(Utils.Colors.ANSI_RED.getColor() + string + Utils.Colors.ANSI_RESET.getColor());
    }
    public static void print(Enum Colors, int qty){
        System.out.println(Utils.Colors.ANSI_BLUE.getColor() + Integer.toString(qty));
    }
}
