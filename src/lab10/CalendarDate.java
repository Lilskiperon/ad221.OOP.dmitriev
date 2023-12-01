package lab10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class CalendarDate implements Comparable<CalendarDate> {
    private int year;
    private int month;
    private int day;

    public CalendarDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

    @Override
    public int compareTo(CalendarDate otherDate) {
        if (this.year != otherDate.year) {
            return Integer.compare(this.year, otherDate.year);
        }
        if (this.month != otherDate.month) {
            return Integer.compare(this.month, otherDate.month);
        }
        return Integer.compare(this.day, otherDate.day);
    }

    @Override
    public String toString() {
        return String.format("%04d/%02d/%02d", year, month, day);
    }

    public static void main(String[] args) {
        // Создание нескольких объектов CalendarDate
        CalendarDate date1 = new CalendarDate(2023, 1, 15);
        CalendarDate date2 = new CalendarDate(2022, 5, 3);
        CalendarDate date3 = new CalendarDate(2023, 8, 20);

        // Добавление объектов в список
        List<CalendarDate> dateList = new ArrayList<>();
        dateList.add(date1);
        dateList.add(date2);
        dateList.add(date3);

        // Сортировка списка по возрастанию
        Collections.sort(dateList);

        // Вывод содержимого списка в консоль
        System.out.println("Отсортированный по возрастанию:");
        Iterator<CalendarDate> ascendingIterator = dateList.iterator();
        while (ascendingIterator.hasNext()) {
            System.out.println(ascendingIterator.next());
        }

        Collections.sort(dateList, Collections.reverseOrder());

        System.out.println("Отсортированный по убыванию:");
        Iterator<CalendarDate> descendingIterator = dateList.iterator();
        while (descendingIterator.hasNext()) {
            System.out.println(descendingIterator.next());
        }
    }
}