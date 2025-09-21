class Talaba{
    protected String name;
}
class Student extends Talaba{
    public Student(String n){
        this.name=n;
    }
    public void chopEtish(){
        System.out.println(this.name);    
    }
}
public class ProtectedClass {
    public static void main(String[] args) {
        Student s=new Student("Izzatbek");
        s.chopEtish();
    }
}
