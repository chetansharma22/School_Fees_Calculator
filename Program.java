import java.util.Scanner;

class School{
    int sports(int x)
    {
        int n=0,total;
        String s,h;
        System.out.println("In Sports :- ");
        Scanner ss=new Scanner(System.in);
        s=ss.nextLine();
        switch(s)
        {
            case "Yes":
             n=x+500;
             break;
            case "yes":
             n=x+500;
             break;
            case "no":
             n=x;
            break;
            case "No":
            n=x;
            break;
        }
        System.out.println("In Hostel :- ");
        h=ss.nextLine();
        switch(h)
        {
           case "Yes":
             total=n+1000;
            System.out.println("Total fees :"+total);
             break;
            case "yes":
             total=n+1000;
             System.out.println("Total fees :"+ total);
             break;
            case "no":
             total=n;
             System.out.println("Total fees :"+ total);
            break;
            case "No":
            total=n;
            System.out.println("Total fees :" +total);
            break; 
        }
ss.close();
return 0;
}
}
public class School_In_Java {
     public static void main(String[] args) {
        int fees;
        School s=new School();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Your Class:-  ");
        int clas=sc.nextInt();
        switch(clas)
    {
    case 1:
        fees=1000;
        s.sports(fees);
        break;
    case 2:
        fees=2500;
        s.sports(fees);
        break;
    case 3:
        fees=3000;
        s.sports(fees);
        break;
    case 4:
        fees=4500;
        s.sports(fees);
        break;
    case 5:
        fees=5000;
        s.sports(fees);
        break;
    case 6:
        fees=6000;
        s.sports(fees);
        break;
    case 7:
        fees=7000;
        s.sports(fees);
        break;
    case 8:
        fees=8000;
        s.sports(fees);
        break;
    case 9:
        fees=9000;
        s.sports(fees);
        break;
    case 10:
        fees=10000;
        s.sports(fees);
        break;
    }
        sc.close();
        
    }
}
