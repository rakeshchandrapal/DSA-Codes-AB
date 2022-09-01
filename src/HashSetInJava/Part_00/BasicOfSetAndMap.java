package HashSetInJava.Part_00;
import java.util.*;

public class BasicOfSetAndMap {

    public static void main(String[] args) {
//        HashMap<String ,String> map = new HashMap<>();
//        map.put("One","I");
//        map.put("Two","II");
//        map.put("Three","III");
//
        HashSet<String> set = new HashSet<>();
        set.add("Rakesh");
        set.add("Avani");
        set.add("Avani");
//
//        System.out.println(map);
//        System.out.println(set);

//        Set<Student> call = new HashSet<>();
//        Student s1 = new Student(1,"Rakesh");
//        Student s2 = new Student(2,"William");
//        Student s3 = new Student(4,"Yash");
//        Student s4 = new Student(6,"Rakesh");
//
//        call.add(s1);
//        call.add(s2);
//        call.add(s3);
//        call.add(s4);
//
//        System.out.println(call);

        Student s1 = new Student(1,"Rakesh");
        Student s2 = new Student(2,"William");
        Student s3 = new Student(1,"Rakesh");
        System.out.println(s1.equals(s3));




//        Student s5 = new Student(4,"Yash");
//        call.add(s5);
//        call.add(s2);
//        System.out.println(call);
    }
}

class Student{

    int rollNo;
    String name;

    public Student(int rollNo,String name) {
        this.rollNo = rollNo;
        this.name = name;
    }
    public String toString()
    {
        return "["+rollNo+" , "+name+" ]";
    }
    @Override
    public int hashCode() {
        return rollNo;
    }
    @Override
    public boolean equals(Object obj) {
        Student that = (Student) obj;
        return (this.rollNo == that.rollNo);
    }

//


}