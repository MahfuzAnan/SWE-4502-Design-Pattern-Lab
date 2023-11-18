public class Person {
    public String name, address, phoneNumber, email;

    public Person(String name, String address, String phoneNumber, String email){
        this.name = name;
        this. address = address;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    @Override
    public String toString() {
        return "Name: " + name +"\n" + "Class Name :" + this.getClass().getName();
    }
}
