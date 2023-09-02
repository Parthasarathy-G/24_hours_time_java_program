import java.util.*;
public class Stringnonrepeating{
    public static void main(String args[]){
        Scanner ps = new Scanner(System.in);
        int h = ps.nextInt(),m = ps.nextInt(),s = ps.nextInt();
        String s1 = ps.next();
        if(s1.equals("pm") && h!=12){
            h = h+12;
        }
        else if(s1.equals("am") && h==12){
            h = 0;
        }
        if(h>=0 && h<=9){
            System.out.print("0"+h+":");
        }
        else{
            System.out.print(h+":");
        }
        if(m>=0 && m<=9){
            System.out.print("0"+m+":");
        }
        else{
            System.out.print(m+":");
        }
        if(s>=0 && s<=9){
            System.out.print("0"+s);
        }
        else{
            System.out.print(s);
        }
    }
}



