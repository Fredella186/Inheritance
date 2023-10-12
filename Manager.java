import java.util.Date;
public class Manager extends Employee {

    public String department;

    public Manager(String name, Date birthDate, double salary, String dept) {
        super(name, birthDate, salary);
        department = dept;
    }

    public String getDetail() {
        return super.getDetails();
    }
    
}
