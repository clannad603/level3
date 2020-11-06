import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner x=new Scanner(System.in);
        System.out.println("买家入场");
        String c=x.next();
            Jingdong jingdongziying=new Jingdong();
            Person zio=new Person(c);
        System.out.println("you have select the computer which you want to buy,money,computer");

        int d=x.nextInt();
        String b=x.next();
        System.out.println("you have send your order");
            jingdongziying.salecomputer(d,b, jingdongziying.kuaidi());
        System.out.println("please check your order");
        System.out.println("choose 0 to finish your order or delect");
        int num=x.nextInt();
        if(num==0){
            System.out.println("订单已确定，我们将为您尽快发货");
            jingdongziying.setComputerbuyer(zio);
            jingdongziying.deliver(b,d);
        }else{
            System.out.println("您取消了您的订单");
        }
    }
}
