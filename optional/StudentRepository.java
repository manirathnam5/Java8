package optional;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StudentRepository {


    public static List<Student> getStudentDetails(){

        List<Student>  studentList = Arrays.asList(
                new Student("Manish" , 3214,"IIT","Chennai","ECE"),
                new Student("Nikitha" , 2434,"TEC","Bangalore","CSE"),
                new Student("Maya" , 5434,"TEC","Bangalore","CSE"),
                new Student("Santhosh" , 2467,"TEC","Bangalore","ECE"),
                new Student("Raja" , 2478,"","Chennai","IT"),
                new Student("Ramesh" , 2497,"IIT","Mumbai","IT"),
                new Student("Tyson" , 2409,"IIT","Delhi","ECE"),
                new Student("MIke" , 2431,"IIT","Hyderabad","ECE"));

        return studentList;

    }
}
