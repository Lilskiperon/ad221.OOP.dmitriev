package lab10;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
public class Main {
interface DataStructure<T> extends Iterable<T> {
    void addObject(T obj);
    void removeObject(T obj);
    List<T> getObjects();
}


static class ObjectGroup<T> implements DataStructure<T> {
    private List<T> objects;

    public ObjectGroup() {
        this.objects = new ArrayList<>();
    }

    @Override
    public void addObject(T obj) {
        objects.add(obj);
    }

    @Override
    public void removeObject(T obj) {
        objects.remove(obj);
    }

    @Override
    public List<T> getObjects() {
        return objects;
    }

    @Override
    public Iterator<T> iterator() {
        return objects.iterator();
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

        // Iterate over intGroup using the iterator
        System.out.println("Iterating over intGroup:");
        Iterator<Integer> intIterator = intGroup.iterator();
        while (intIterator.hasNext()) {
            System.out.println(intIterator.next());
        }
    }
}