 public class Main {
    public static void main(String[] args) {
        Employee emp1 = new Employee();
        Employee emp2 = new Employee();
        Employee emp3 = new Employee();

        emp1.displayDetails();
        emp2.displayDetails();
        emp3.displayDetails();

    }
}
 class Employee {
    int employeeno;
    String employeename;
    float salary;

    Employee() {
        System.out.println("**Employee Info**");
        employeeno = 123;
        employeename = "Shlok";
        salary = 5000;
    }
    void displayDetails() {
        System.out.println("Employee number: " +employeeno+ " | Employee name:"+employeename+" | Employee salary"+salary);
    }
    
}

