import java.util.Date;
public class Employee {
    public String name;
    public Date birthDate;
    public double salary;

    public Employee(String n, Date b, double s) {
        name = n;
        birthDate = b;
        salary = s;
    }

    public String getDetails() {
        return "Pelanggan ini bernama " + name + "lahir tanggal " + birthDate + "dengan gaji sebesar " + salary;
    }
}
