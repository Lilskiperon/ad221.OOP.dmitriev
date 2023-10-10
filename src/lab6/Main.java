package lab6;

public class Main {
    public static void main(String[] args) {
        ArrayDataStructure dataStructure = new ArrayDataStructure();
        testDataStructure(dataStructure);
    }

    public static void testDataStructure(DataStructure ds) {
        System.out.println("Додаємо елементи\n");
        ds.add("Яблуко");
        ds.add("Груша");
        ds.add("Банан");
        display(ds);

        System.out.println("\nВидаляємо банан. Успішно?: " + ds.remove("Банан"));
        display(ds);

        System.out.println("\nОчищуємо структуру");
        ds.clear();
        display(ds);

        System.out.println("\nДодаємо елементи");
        ds.add("Яблуко");
        ds.add("Груша");
        ds.add("Помідора");
        ds.add("Банан");
        display(ds);

        System.out.println("\nЧи є помідора?");
        System.out.println(ds.contains("Помідора"));
    }

    public static void display(DataStructure ds) {
        System.out.println("Чи порожня структура?: " + ds.isEmpty());
        System.out.println("Розмір структури: " + ds.size());
        System.out.println("Список елементів структури:");
        for (int i = 0; i < ds.size(); i++) {
            System.out.println("[" + i + "]: " + ds.get(i));
        }
    }
    public interface DataStructure {
        boolean add(String item);
        boolean remove(String item);
        boolean contains(String item);
        int size();
        boolean isEmpty();
        void clear();
        String get(int index);
    }
    public static class ArrayDataStructure implements DataStructure {
        private String[] array;
        private int count;

        public ArrayDataStructure() {
            this.array = new String[8];
            this.count = 0;
        }

        @Override
        public boolean add(String item) {
            if (count == array.length) {
                int newSize = (count * 3) / 2 + 1;
                String[] newArray = new String[newSize];
                System.arraycopy(array, 0, newArray, 0, count);
                array = newArray;
            }
            array[count++] = item;
            return true;
        }

        @Override
        public boolean remove(String item) {
            for (int i = 0; i < count; i++) {
                if (array[i].equals(item)) {
                    System.arraycopy(array, i + 1, array, i, count - i - 1);
                    count--;
                    if (count < array.length / 2) {
                        String[] newArray = new String[array.length / 2];
                        System.arraycopy(array, 0, newArray, 0, count);
                        array = newArray;
                    }
                    return true;
                }
            }
            return false;
        }

        @Override
        public boolean contains(String item) {
            for (int i = 0; i < count; i++) {
                if (array[i].equals(item)) {
                    return true;
                }
            }
            return false;
        }

        @Override
        public int size() {
            return count;
        }

        @Override
        public boolean isEmpty() {
            return count == 0;
        }

        @Override
        public void clear() {
            count = 0;
            array = new String[8];
        }

        @Override
        public String get(int index) {
            if (index >= 0 && index < count) {
                return array[index];
            }
            return null;
        }
    }
}