import java.util.Scanner;
import java.util.*;
public class Percent{
  public static void main(String[] args) {
    Scanner scan=new Scanner(System.in);
    List num=new ArrayList();
    while(true){
      String s=scan.nextLine();
      if(s==null)break;
      num.add(Integer.parseInt(s));
    }
    Iterator iter=num.iterator();
    int sum=0;
    while(iter.hasNext()){
      sum+=(Integer)iter.next();
    }
    while(iter.hasNext()){
      System.out.println(iter.next()+"  "+((Integer)iter.next()/sum*100)+"%");
    }
      System.out.println(sum+"  100.0%");
    }
  }
