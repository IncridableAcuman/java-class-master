class Talaba {
          String name;
      int age;
    public Talaba(String n,int a){
        this.name=n;
        this.age=a;
    }
    public void display(){
        System.out.println(name+" "+age);
    }
}
public class Kirish_modifikatorlari1 {
    public static void main(String[] args) {
        Talaba t=new Talaba("Izzatbek", 21);
        t.display();
    }
}
