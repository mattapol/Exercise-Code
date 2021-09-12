import java.util.*;
public class W1 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
double p,r,s;
String m,w;
System.out.print("Input your money: ");
m=sc.nextLine();
p=Double.parseDouble(m);
r=0.0;
s=0.0;
System.out.print("Input your account type(Plese type A B C or X in uppercase): ");
w=sc.nextLine();
if(w.equals("A")){
    r=p*1.5/100;
}else if(w.equals("B")){
    r=p*2.0/100;
}else if(w.equals("C")){
    r=p*1.5/100;
}else if(w.equals("X")){
    r=p*5.0/100;
}
s=p+r;
  System.out.println("Your total money in one year = " +s);
  }
}
