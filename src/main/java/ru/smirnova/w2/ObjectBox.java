package main.java.ru.smirnova.w2;

import java.util.Collection;

/**
 * Класс, который хранит коллекцию Object.
 * Добавляет и удалает из неё элементы,
 * выводит содержимое коллекции в строку.
 */
public class ObjectBox implements Objectable {

    Collection<Object> collection;

    /**
     * Метод добавляюет объект в коллекцию
     * @param obj объект, который добавляется в коллекцию
     */
    public void addObject(Object obj){
        collection.add(obj);
    }

    /**
     * Метод проверяет наличие объекта в коллекции и при наличии удаляет его
     * @param obj объект удаляется из коллекции, если присутствует в ней
     */
    public void deleteObject(Object obj){
        collection.remove(obj);
    }

    /**
     * Метод выводит содержимое коллекции в строку
     */
    public void dump(){
        System.out.println(collection.toString());
    }
}
