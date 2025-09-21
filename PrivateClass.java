class Talaba{
    private String name;
    public String getName(){
        return name; 
    }
    public void setName(String n){
        this.name=n;
    }
}
public class PrivateClass {
    public static void main(String[] args) {
       Talaba talaba=new Talaba();
       talaba.setName("Izzatbek");
       System.out.println(talaba.getName());
       talaba.setName("Abror");
       System.out.println(talaba.getName());
       talaba.setName("Ismoil"); 
       System.out.println(talaba.getName());
    }
}
