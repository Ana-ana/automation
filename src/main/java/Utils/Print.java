package Utils;

public class Print {
    //Overload
    public static void print(Colors colors, String string){
        System.out.println(colors.getColor() + string + Colors.ANSI_RESET.getColor());
    }
    public static void print(Colors colors, int qty){
        System.out.println(colors.getColor() + qty + Colors.ANSI_RESET.getColor());
    }
    public static void print(Colors colors, Object o){
        System.out.println(colors.getColor() + o + Colors.ANSI_RESET.getColor());
    }
}
