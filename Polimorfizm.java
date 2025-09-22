class First{
    public int findMaxNumber(int a,int b){
        return Math.max(a, b); 
    }
    public  double findMaxNumber(double a,double b){
        return Math.max(a, b);
    }
}


public class Polimorfizm {
    public static void main(String[] args) {
       First f=new First(); 
       System.out.println(f.findMaxNumber(5,12));
       System.out.println(f.findMaxNumber(5.5, 8.8));
    }
}
