import java.lang.reflect.Array;
import java.util.*;

public class main {
    public static void main(String[] args) {
        List<emp> empList = Arrays.asList(new emp("Sam", 1, "HCL"),
                new emp("Dam", 2, "Seimen"),
                new emp("Manny", 3, "DuceX"),
                new emp("Som", 4, "Nissan"));

        List<student> stuList = Arrays.asList(new student("Ham", 1, "CS", 3.5),
                new student("Gon", 2, "CSX", 3.1),
                new student("Killiua", 1, "PSY", 3.7),
                new student("Goku", 1, "HST", 2.5));

        for (student stu : stuList) {
            System.out.println("Student name: " + stu.getName() + " | Student ID: " + stu.getId() + " | Student Major: " + stu.getMajor() + " | Student GPA: "
                    + stu.getGpa());
        }
        System.out.println("----------------------------------");
        for (emp e : empList) {
            System.out.println("Employee name: " + e.getName() + " | Employee ID: " + e.getId() + "Employee Cpmpany: "
                    + e.getCompany());
        }
    }

}