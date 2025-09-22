abstract class GPA{
    public abstract double gpa();
}

class Student extends GPA{
    @Override
    public double gpa(){
        return 5.0;
    }
}

public class Abstract {
    public static void main(String[] args) {
        Student s=new Student();
        System.out.println(s.gpa());
    }
}
