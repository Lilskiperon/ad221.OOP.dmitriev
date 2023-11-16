package lab8;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

class ObjectGroup<T> {
    private List<T> objects;

    public ObjectGroup() {
        this.objects = new ArrayList<>();
    }

    public void addObject(T obj) {
        objects.add(obj);
    }

    public void removeObject(T obj) {
        objects.remove(obj);
    }

    public List<T> getObjects() {
        return objects;
    }

    public void addCollection(Collection<? extends T> collection) {
        objects.addAll(collection);
    }
    public static <E> ObjectGroup<E> getOddElements(ObjectGroup<E> inputGroup) {
        ObjectGroup<E> resultGroup = new ObjectGroup<>();
        List<E> inputObjects = inputGroup.getObjects();

        for (int i = 0; i < inputObjects.size(); i += 2) {
            resultGroup.addObject(inputObjects.get(i));
        }

        return resultGroup;
    }
}

public class Main {
    public static void main(String[] args) {
        ObjectGroup<Integer> intGroup = new ObjectGroup<>();
        intGroup.addObject(-3);
        intGroup.addObject(75);
        intGroup.addObject(100);

        System.out.println("Original Group: " + intGroup.getObjects());

        ObjectGroup<Integer> oddElementsGroup = ObjectGroup.getOddElements(intGroup);
        System.out.println("Odd Elements Group: " + oddElementsGroup.getObjects());

        Collection<Double> doubleCollection = new ArrayList<>();
        doubleCollection.add(14.11);
        doubleCollection.add(10.2);
        doubleCollection.add(-4.35);

        ObjectGroup<Double> doubleGroup = new ObjectGroup<>();
        doubleGroup.addCollection(doubleCollection);

        System.out.println("Double Group: " + doubleGroup.getObjects());
    }
}
