class Employee {

    // Instance variables
    private String name;
    private double baseSalary;
    private int yearsOfExperience;

    // Parameterized constructor
    Employee(String name, double baseSalary, int yearsOfExperience) {
        this.name = name;
        this.baseSalary = baseSalary;
        this.yearsOfExperience = yearsOfExperience;
    }

    // Method
    public double calculateAnnualCompensation() {
        double bonus = baseSalary * 0.05 * yearsOfExperience;
        return baseSalary + bonus;
    }

    // Getter for name
    public String getName() {
        return name;
    }
}


class Main {

    public static void main(String[] args) {

        Employee[] employees = {
            new Employee("John", 60000, 2),
            new Employee("David", 75000, 4),
            new Employee("Sarah", 65000, 6)
        };

        Employee highestPaidEmployee = employees[0];

        for (int i = 0; i < employees.length; i++) {

            if (employees[i].calculateAnnualCompensation()
                    > highestPaidEmployee.calculateAnnualCompensation()) {

                highestPaidEmployee = employees[i];
            }
        }

        System.out.println(
            "Highest compensation: "
            + 
            + " - $"
            + highestPaidEmployee.calculateAnnualCompensation()
        );
    }
}