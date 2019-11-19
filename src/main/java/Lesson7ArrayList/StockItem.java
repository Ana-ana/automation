package Lesson7ArrayList;

import java.util.ArrayList;

public class StockItem {

    private String name;
    private int id;
    protected ArrayList<String> stockNames = new ArrayList<String>();

    public StockItem(String name, int id) {
        this.name = name;
        this.id = id;
        getStockNames().add(name);
    }

    public ArrayList<String> getStockNames() {
        return stockNames;
    }
}
