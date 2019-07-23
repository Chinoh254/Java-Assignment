import java.util.Scanner;

public class Overload {
    public static void main(String[] args) {
        over("Chinoh","Maonga");
    }
    public static String over(String x,String y){
        Scanner forward;
        forward=new Scanner(System.in);
        System.out.println("Enter value of x");
        x=forward.next();
        System.out.println("Enter value of y");
        y=forward.next();
        String ans=x+" "+y;
        System.out.println(ans);
        return ans;
    }
    public void over(){
        System.out.println("Method overloading");
    }
    public static Integer over(Integer x,Integer y){
        Scanner forward;
        forward=new Scanner(System.in);
        System.out.println("Enter value of x");
        x=forward.nextInt();
        System.out.println("Enter value of y");
        y=forward.nextInt();
        Integer ans=x+y;
        System.out.println(ans);
        return ans;
    }
    public void over(int x){
        Scanner forward;
        forward=new Scanner(System.in);
        x=forward.nextInt();
        System.out.println("You entered "+x);
    }
}
