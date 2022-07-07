package main.java.ru.smirnova.w2;

import java.util.*;

/**
 * Класс, который хранит коллекцию Object.
 * Добавляет и удалает из неё элементы,
 * выводит содержимое коллекции в строку.
 */
public class ObjectBox {

    Collection<Object> collection;

    ObjectBox() {
        this.collection = new TreeSet<>();
    }

    /**
     * Метод добавляюет объект в коллекцию
     * @param obj объект, который добавляется в коллекцию
     */
    void addObject(Object obj){
        this.collection.add(obj);
    }

    /**
     * Метод проверяет наличие объекта в коллекции и при наличии удаляет его
     * @param obj объект удаляется из коллекции, если присутствует в ней
     */
    void deleteObject(Object obj){
        this.collection.remove(obj);
    }

    /**
     * Метод выводит содержимое коллекции в строку
     */
    String dump(){
        return this.collection.toString();
    }

    @Override
    public String toString() {

        StringBuilder result = new StringBuilder();
        for(Object i : this.collection){
            result.append(i).append(" ");
        }
        return result.toString();
    }

    @Override
    public boolean equals(Object obj) {

        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }

        ObjectBox newObjectBox = (ObjectBox) obj;
        return this.collection.equals(newObjectBox.collection);
    }

    @Override
    public int hashCode() {
        return (int) (Math.random() * 32);
    }
}
