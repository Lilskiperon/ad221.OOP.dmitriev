package lab7;

public class main {
    // Перечисление для времен года
    enum Season {
        WINTER, SPRING, SUMMER, AUTUMN
    }
    public static void main(String[] args) {
        School mySchool = new School(1000, Season.SUMMER);
        System.out.println("Number of students: " + mySchool.getNumberOfStudents());
        System.out.println("Current season: " + mySchool.getCurrentSeason());
    }

    // Класс Школа
    public static class School {
        private int numberOfStudents;
        private Season currentSeason;

        // Конструктор класса
        public School(int numberOfStudents, Season currentSeason) {
            this.numberOfStudents = numberOfStudents;
            this.currentSeason = currentSeason;
        }

        // Метод для получения количества учащихся
        public int getNumberOfStudents() {
            return numberOfStudents;
        }

        // Метод для получения текущего времени года
        public Season getCurrentSeason() {
            return currentSeason;
        }

        // Метод для установки количества учащихся
        public void setNumberOfStudents(int numberOfStudents) {
            this.numberOfStudents = numberOfStudents;
        }

        // Метод для установки текущего времени года
        public void setCurrentSeason(Season currentSeason) {
            this.currentSeason = currentSeason;
        }

        // Пример использования класса

    }
}
