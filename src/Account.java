 class Account
 {
     private int accid;
     private String name;
     private double bal;

     public void setData(int a,String n,double b)
     {
      accid=a;
      name=n;
      bal=b;
     }
     public void showData()
     {
      System.out.println(accid+","+name+","+bal);
     }
}
