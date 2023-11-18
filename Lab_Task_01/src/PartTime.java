public class PartTime extends Staff {
    public double hourlyRate;
    public int workedHours;

    public PartTime(String name, String address, String phoneNumber, String email, String office, double hourlyRate, MyDate dateHired, String title, int workedHours) {
        super(name, address, phoneNumber, email, office, 0, dateHired, title);
        this.hourlyRate = hourlyRate;
        this.workedHours = workedHours;
    }

    public double calculateSalary() {
        return hourlyRate * workedHours;
    }
}
