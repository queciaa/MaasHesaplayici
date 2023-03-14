package MaasHesaplayici;

import java.util.Calendar;

public class Employee {
    String name;
    double salary;
    int workHours;
    int hireYear; // başlangıç yılı;

    Employee(String name, double salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;

    }

    public double tax() {
        // double tax = 0;
        if (this.salary >= 1000) {
            return salary * 0.03;
        }

        return 0.0;
    }

    public int bonus() {
        int bonus = 0;
        if (this.workHours > 40)
            bonus += (workHours - 40) * 30;
        return bonus;
    }

    public double raiseSalary() {

        // we can reach the current year via this code.
        Calendar instance = Calendar.getInstance();
        int year = instance.get(Calendar.YEAR);

        if (year - this.hireYear < 10)
            return this.salary * 0.05;

        else if (year - this.hireYear > 9 && (year - this.hireYear < 20))
            return this.salary * 0.1;

        else if (year - this.hireYear > 19)
            return this.salary * 0.15;

        return 0;
    }

    @Override
    public String toString() {

        System.out.println("---------------------");
        return "Name: " + this.name + "\nSalary: " + this.salary + "\nWork Hours: " + workHours + "\nHire Year: "
                + hireYear +
                "\nSalary including tax and bonus: " + (this.salary + bonus() - tax()) + "\nNet Salary: "
                + (this.salary + bonus() - tax() + raiseSalary());
    }
}
