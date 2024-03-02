package lambdasStreamProject;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args){
      Product p1=new Product("T123","RayMondBlackTshirt",1000);
      Product p2=new Product("T223","LPblackTshirt",2500);
      Product p3=new Product("T323","Kurta",1200);
      Product p4=new Product("T423","FormalPyant",3000);
      Product p5=new Product("T523","LPblackTshirt",1500);
      List<Product> list=new ArrayList<>();
      list.add(p1);
      list.add(p2);
      list.add(p3);
      list.add(p4);
      list.add(p5);
      Coustomer c=new Coustomer("Hari","123456789","LPblackTshirt");
      Stream<Product> s=list.stream();
      s.filter((prod)->{
          String name=prod.getpName();
          return name.equalsIgnoreCase(c.getProductName());
      }).forEach((prod)->{
          if(prod.getPrice()>1500){
              System.out.println(prod.getName()+" :"+c.getCname()+" is eligible for CashBack of :" + prod.getPrice()*0.15);
          }
          return;
      });
    }
}
