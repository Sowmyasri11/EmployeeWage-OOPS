
public class Main {
    public static void main(String[] args) {

        System.out.println("Welcome to Employee Wage Computation Program");

        // UC1, UC2, UC3 & UC4 - Check Employee is Present or Absent and Calculate Daily Wage with Part Time using Switch Case
        final int WAGE_PER_HOUR = 20;
        final int FULL_DAY_HOURS = 8;
        final int PART_TIME_HOURS = 4;

        int empCheck = (int)(Math.random() * 2); // 0 or 1

        if (empCheck == 1) {
            System.out.println("Employee is Present");
            int empType = (int)(Math.random() * 2); // 0 - Part Time, 1 - Full Time
            int hours = 0;
            switch (empType) {
                case 0:
                    hours = PART_TIME_HOURS;
                    break;
                case 1:
                    hours = FULL_DAY_HOURS;
                    break;
            }
            int dailyWage = WAGE_PER_HOUR * hours;
            System.out.println("Daily Employee Wage: " + dailyWage);
        } else {
            System.out.println("Employee is Absent");
            System.out.println("Daily Employee Wage: 0");
        }

    }
}