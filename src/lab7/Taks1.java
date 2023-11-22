package lab7;

public class Taks1 {
    enum Season {
        WINTER, SPRING, SUMMER, AUTUMN
    }
    public static void main(String[] args) {
        School mySchool = new School(1000, Season.SUMMER);
        System.out.println("Number of students: " + mySchool.getNumberOfStudents());
        System.out.println("Current season: " + mySchool.getCurrentSeason());
    }

    public static class School {
        private int numberOfStudents;
        private Season currentSeason;

        public School(int numberOfStudents, Season currentSeason) {
            this.numberOfStudents = numberOfStudents;
            this.currentSeason = currentSeason;
        }

        public int getNumberOfStudents() {
            return numberOfStudents;
        }

        public Season getCurrentSeason() {
            return currentSeason;
        }

        public void setNumberOfStudents(int numberOfStudents) {
            this.numberOfStudents = numberOfStudents;
        }

        public void setCurrentSeason(Season currentSeason) {
            this.currentSeason = currentSeason;
        }


    }
}
