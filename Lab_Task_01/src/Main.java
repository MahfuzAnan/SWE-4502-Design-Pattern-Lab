public class Main {
    public static void main(String[] args) {
        MyDate m = new MyDate(2023, 8, 17);

        Employee e = new Employee("Anan", "jashore", "01234567899", "anan@gmail.com", "Uttara", 100, m);

        System.out.println(e.toString());

        PartTime pt = new PartTime("Anan", "jashore", "01234567899", "anan@gmail.com", "Uttara", 100, m, "Manager", 4);
        System.out.println(pt.calculateSalary());
    }
}