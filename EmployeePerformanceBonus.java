import java.util.Scanner;
public class EmployeePerformanceBonus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int employeeType = sc.nextInt();
        String employeeName = sc.next();

        Employee emp = null;
        double baseEarnings = 0.0;

        if (employeeType == 1) {
            double basicSalary = sc.nextDouble();
            int rating = sc.nextInt();
            emp = new TechnicalEmployee(employeeName, basicSalary, rating);
            baseEarnings = basicSalary;
        } else if (employeeType == 2) {
            double salesAmount = sc.nextDouble();
            emp = new SalesEmployee(employeeName, salesAmount);
            baseEarnings = salesAmount;
        }

        if (emp != null) {
            double bonus = emp.calculateBonus();
            double totalEarnings = baseEarnings + bonus;

            System.out.println("Employee Name: " + emp.employeeName);
            System.out.printf("Bonus: %.2f%n", bonus);
            System.out.printf("Total Earnings: %.2f%n", totalEarnings);
        }

        sc.close();
    }
}

class Employee {
    String employeeName;

    public Employee(String employeeName) {
        this.employeeName = employeeName;
    }

    public double calculateBonus() {
        return 0.0;
    }

    public double calculateBonus(double amount) {
        return amount * 0.02;
    }
}

class TechnicalEmployee extends Employee {
    double basicSalary;
    int rating;

    public TechnicalEmployee(String employeeName, double basicSalary, int rating) {
        super(employeeName);
        this.basicSalary = basicSalary;
        this.rating = rating;
    }

    @Override
    public double calculateBonus() {
        return basicSalary * rating * 2 / 100.0;
    }

    public double calculateBonus(double salary, int employeeRating) {
        return salary * employeeRating * 2 / 100.0;
    }
}

class SalesEmployee extends Employee {
    double salesAmount;

    public SalesEmployee(String employeeName, double salesAmount) {
        super(employeeName);
        this.salesAmount = salesAmount;
    }

    @Override
    public double calculateBonus() {
        return salesAmount * 3 / 100.0;
    }

    @Override
    public double calculateBonus(double amount) {
        return amount * 3 / 100.0;
    }
}

