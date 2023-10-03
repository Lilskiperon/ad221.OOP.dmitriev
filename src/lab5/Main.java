package lab5;

public class Main {
    public static void main(String[] args) {
        // об'єкти класу People
        Person person1 = new Person("Білоус", "Петро", 35);
        Person person2 = new Person("Резніков", "Максим", 12);

        // об'єкти класу Student
        Student student1 = new Student("Петров", "Іван", 20, "Група А", "123");
        Student student2 = new Student("Сидорова", "Ольга", 19, "Група Б", "124");

        // об'єкти класу Lecturer
        Lecturer lecturer1 = new Lecturer("Іванов", "Петро", 40, "Математика", 6000.0);
        Lecturer lecturer2 = new Lecturer("Смирнова", "Марія", 35, "Інформатика", 5500.0);

        Person[] people = new Person[6];
        people[0] = person1;
        people[1] = person2;
        people[2] = student1;
        people[3] = student2;
        people[4] = lecturer1;
        people[5] = lecturer2;

        // Цикл з виведення інформації
        for (Person person : people) {
            System.out.println(person.printInfo());
        }
    }

    public static class Person {
        private String lastName;
        private String firstName;
        private int age;

        // Конструктор класу
        public Person(String lastName, String firstName, int age) {
            this.lastName = lastName;
            this.firstName = firstName;
            this.age = age;
        }

        // Гетер
        public String getLastName() {
            return lastName;
        }

        // Сетер
        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

        // Гетер
        public String getFirstName() {
            return firstName;
        }

        // Сетер
        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        // Гетер
        public int getAge() {
            return age;
        }

        // Сетер
        public void setAge(int age) {
            this.age = age;
        }

        // Метод для виведення інформації
        public String printInfo() {
            return "Людина " + lastName + " " + firstName + ", вік: " + age;
        }

    }

    public static class Student extends Person {
        private String group;
        private String studentId;

        // Конструктор класу Student
        public Student(String lastName, String firstName, int age, String group, String studentId) {
            super(lastName, firstName, age);
            this.group = group;
            this.studentId = studentId;
        }

        // Гетер
        public String getGroup() {
            return group;
        }

        // Сетер
        public void setGroup(String group) {
            this.group = group;
        }

        // Гетер
        public String getStudentId() {
            return studentId;
        }

        // Сетер
        public void setStudentId(String studentId) {
            this.studentId = studentId;
        }

        // Перевизначений метод printInfo()
        @Override
        public String printInfo() {
            return "Студент групи " + group + " " + getLastName() + " " + getFirstName() + ", вік: " + getAge() +
                    ". Номер студентського квитка: " + studentId;
        }

    }

    public static class Lecturer extends Person {
        private String department;
        private double salary;

        // Конструктор класу Lecturer
        public Lecturer(String lastName, String firstName, int age, String department, double salary) {
            super(lastName, firstName, age);
            this.department = department;
            this.salary = salary;
        }

        // Гетер
        public String getDepartment() {
            return department;
        }

        // Сетер
        public void setDepartment(String department) {
            this.department = department;
        }

        // Гетер
        public double getSalary() {
            return salary;
        }

        // Сетер
        public void setSalary(double salary) {
            this.salary = salary;
        }

        // Перевизначений метод printInfo()
        @Override
        public String printInfo() {
            return "Викладач кафедри " + department + " " + getLastName() + " " + getFirstName() + ", вік: " + getAge() +
                    ". Зарплата: " + salary;
        }
    }

}