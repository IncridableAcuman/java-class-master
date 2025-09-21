
import java.util.Scanner;

 class Person{
    private final  String name;
    private final  int age;

    public Person(String name,int age){
        this.name=name;
        this.age=age;
    }
    public String  display(){
        return "Name: "+name+"  Age: "+age;
    }
}

 class Developer extends Person{
    private final String website;

    public Developer(String name,int age,String website){
        super(name, age);
        this.website=website;
    }
    @Override
    public String display(){
        return super.display()+" Website: " + this.website;
    }
}

public class Merosxorlik {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {

            System.out.print("Name=");
            String name=scanner.next();

            System.out.print("Age=");
            int age=scanner.nextInt();

            System.out.print("Website=");
            String website=scanner.next();
            Developer d=new Developer(name, age, website);
            System.out.println(d.display());
        }
    }
}
