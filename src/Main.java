
public class Main {
    public static void main(String[] args) {

        System.out.println("Welcome to Employee Wage Computation Program");

        // UC1 & UC2 - Check Employee is Present or Absent and Calculate Daily Wage
        final int WAGE_PER_HOUR = 20;
        final int FULL_DAY_HOURS = 8;

        int empCheck = (int)(Math.random() * 2); // 0 or 1

        if (empCheck == 1) {
            System.out.println("Employee is Present");
            int dailyWage = WAGE_PER_HOUR * FULL_DAY_HOURS;
            System.out.println("Daily Employee Wage: " + dailyWage);
        } else {
            System.out.println("Employee is Absent");
            System.out.println("Daily Employee Wage: 0");
        }

    }
}