
public class Main {
    public static void main(String[] args) {

        System.out.println("Welcome to Employee Wage Computation Program");

        // UC5 - Calculating Wages for a Month - Assume 20 Working Day per Month
        final int WAGE_PER_HOUR = 20;
        final int FULL_DAY_HOURS = 8;
        final int PART_TIME_HOURS = 4;
        final int WORKING_DAYS_PER_MONTH = 20;

        int totalWage = 0;

        for (int day = 1; day <= WORKING_DAYS_PER_MONTH; day++) {
            int empCheck = (int)(Math.random() * 2); // 0 or 1

            if (empCheck == 1) {
                System.out.println("Day " + day + ": Employee is Present");
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
                totalWage += dailyWage;
                System.out.println("Daily Employee Wage: " + dailyWage);
            } else {
                System.out.println("Day " + day + ": Employee is Absent");
                System.out.println("Daily Employee Wage: 0");
            }
        }

        System.out.println("Total Monthly Wage: " + totalWage);

    }
}