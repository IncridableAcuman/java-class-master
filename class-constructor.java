import java.util.*;

class Developer{
    private String name;
    private String role;
    private String company;
    private int expirence;
    
    public Developer(String devName,String devRole,String devCompany,int devExpirence){
        this.name=devName;
        this.role=devRole;
        this.company=devCompany;
        this.expirence=devExpirence;
    }
    public String getName(){
        return name;
    }
    public
}

public class Main
{
  public static void main(String[] args) {
    Developer dev=new Developer("Izzatbek","Software Engineer","UZINFOCOM",2);
    System.out.print("Developer: "+dev.getName());
  }
}