import java.util.Scanner;
class product {
    int pcode;
      String pname;
      double price;
      product (){
      pcode=0;
      pname="unknown";
      price=0;
      }
      product(int c,String n,double p){
             pcode=c;
             pname=n;
             price=p;
      }
      void display(){
             System.out.println(pcode+"\t"+pname+"\t"+price);
      }
    }
public class ProductMain{
       public static void main(String[] args){
       Scanner sc=new Scanner(System.in);
       product p1=new product(101,"laptop",45000.00);
       System.out.println("Enter details of product 2 :");
       
       System.out.print("Product Code:");
       int c2 = sc.nextInt();
       sc.nextLine();
       
       System.out.print("Product Name:");
       String n2 = sc.nextLine();
       
       System.out.print("Price:");
       double pr2=sc.nextDouble();
       
       product p2=new product(c2, n2, pr2);
       
       System.out.println("Enter details of product 3 :");
       
       product p3=new product();
       
       
       System.out.print("Product Code:");
       p3.pcode= sc.nextInt();
       sc.nextLine();
       
       System.out.print("Product Name:");
       p3.pname= sc.nextLine();
       
       System.out.print("Price:");
       p3.price=sc.nextDouble();
       
       System.out.println("\n--- Product With Lowest Price---");
       
       product low = p1;
       
       if(p2.price<low.price){
       low=p2;
       }
        if(p3.price<low.price){
       low=p3;
       }
       System.out.println("\n Code\tname\tprice");
       low.display();
       }
       
          
          
       
       
       

}     

