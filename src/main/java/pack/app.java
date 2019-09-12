package pack;

import Utils.Print;

public class app {
    public static void main(String[] args) {
        Cat cat = null;
        Cat kitty = null;
        //Kitty itty = new Kitty();


        //cat.print();
        //kitty.print();

        cat.printStatic();
        kitty.printStatic();
        //itty.printStatic();

        Print.union(2, 56);
        Print.union("string", "string");
        Print.union(true, false);
    }
}
