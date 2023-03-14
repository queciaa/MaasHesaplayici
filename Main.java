package MaasHesaplayici;

public class Main {

    public static void main(String[] args) {

        Employee employer1 = new Employee("Kemal", 2000, 45, 1985);

        System.out.println("Tax " + employer1.tax());
        System.out.println("Bonus " + employer1.bonus());
        System.out.println("Raise Salary " + employer1.raiseSalary());
        System.out.println(employer1.toString());

    }

}
