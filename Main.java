import java.util.*;

class Developer{
    private final  String name;
    private final  String role;
    private final  String company;
    private final  int expirence;
    
    public Developer(String devName,String devRole,String devCompany,int devExpirence){
        this.name=devName;
        this.role=devRole;
        this.company=devCompany;
        this.expirence=devExpirence;
    }
    public String getName(){
        return name;
    }
    public String getRole(){
     return role;
    }
    public String getCompany(){
     return company;
    }
    public int getExpirence(){
     return expirence;
    }
}

public class Main
{
  public static void main(String[] args) {
      try (Scanner sc = new Scanner(System.in)) {
          String name=sc.nextLine();
          String role=sc.nextLine();
          String company=sc.nextLine();
          int expirence=sc.nextInt();
          Developer dev=new Developer(name,role,company,expirence);
          System.out.println("My name is "+dev.getName());
          System.out.println("I'm a "+dev.getRole());
          System.out.println("Our company "+dev.getCompany());
          System.out.println("I have "+dev.getExpirence() + " of expirence.");
      }
  }
}