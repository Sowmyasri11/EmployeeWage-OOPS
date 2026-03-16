
public class Main {
    public static void main(String[] args) {

        System.out.println("Welcome to Employee Wage Computation Program");

        // UC1 - Check Employee is Present or Absent
        int empCheck = (int)(Math.random() * 2); // 0 or 1

        if (empCheck == 1) {
            System.out.println("Employee is Present");
        } else {
            System.out.println("Employee is Absent");
        }

    }
}