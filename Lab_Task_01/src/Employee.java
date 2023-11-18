public class Employee extends Person {
    public String office;
    public double salary;
    public MyDate dateHired;


    public Employee(String name, String address, String phoneNumber, String email, String office, double salary, MyDate dateHired) {
        super(name, address, phoneNumber, email);
        this.office = office;
        this.salary = salary;
        this.dateHired = dateHired;
    }

}
