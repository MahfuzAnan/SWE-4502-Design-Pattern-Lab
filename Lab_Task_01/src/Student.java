public class Student extends Person{
    public Status status;

    public Student(String name, String address, String phoneNumber, String email, Status status) {
        super(name, address, phoneNumber, email);
        this.status = status;
    }
}
