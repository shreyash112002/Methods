import java.util.Scanner;
class UseAccount
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a;
        String n;
        double b;
        System.out.println("Enter Accid , name , balance");
        a=sc.nextInt();
        sc.nextLine();
        n=sc.nextLine();
        b=sc.nextDouble();
        Account acc1=new Account();
            acc1.setData(a,n,b);
            acc1.showData();

    }
}
