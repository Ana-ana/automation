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
    public static String union(String str1, String str2){
        System.out.println(str1+str2);
        return str1+str2;
    }

    public static String union(int a, int b){
        String s = Integer.toString(a);
        String s2 = Integer.toString(b);
        System.out.println(s+s2);
        return s+s2;
    }
    public static String union(Double a, Double b){
        String s = Double.toString(a);
        String s2 = Double.toString(b);
        System.out.println(s+s2);
        return s+s2;
    }
    public static String union(char a, char b){
        String s = Character.toString(a);
        String s2 = Character.toString(b);
        System.out.println(s+s2);
        return s+s2;
    }
    public static String union(boolean a, boolean b){
        String s = Boolean.toString(a);
        String s2 = Boolean.toString(b);
        System.out.println(s+s2);
        return s+s2;
    }
}
