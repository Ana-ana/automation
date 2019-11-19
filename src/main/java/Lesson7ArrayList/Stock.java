package Lesson7ArrayList;

import java.util.Iterator;
import java.util.function.Consumer;

public class Stock extends StockItem implements Iterable<StockItem> {
    public Stock(String name, int id) {
        super(name, id);
    }

    Iterator<T> iterator();


    public void forEach(Consumer<? super StockItem> action) {
        for (action t : this) {
            System.out.println(action);
        }
    }


    /*
    created by Anna
     */

    /*
Создать класс Stock задача которого, хранить товар, класс должен реализовать интерфейс Iterable.
Поместить наименования товара на склад.
Используя цикл for-each вывести наименования товара в консоль.
Сделать реализацию для ArrayList или LinkedList.
     */

}
