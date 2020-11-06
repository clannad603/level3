public class Jingdong implements Computershop {
    private Computerbuyer zio;
    @Override
    public void salecomputer(int money,String computer,String kuaidi) {
        System.out.println("你的订单为"+computer+":"+"价格为"+money+"将由"+kuaidi+"快递为您送达");
    }
    public void setComputerbuyer(Computerbuyer computerbuyer){
this.zio=computerbuyer;
    }

public void deliver(String computename, int money){
        for(int i=3;i>=1;i--){
            System.out.println("您的快递还有"+i+"天到");
        }
        Computer computer=new Computer(computename, money);
    System.out.println("您的"+computename+"已经到了，速来领取");
zio.getcomputer( computer);
}
    public String kuaidi(){
        int x=(int)(Math.random()*5);
        String srt;
        switch(x){
            case 0:
              srt="百世" ;
             break;
            case 1:
                 srt="京东";
                break;
            case 2:
                srt="圆通";
                break;
            case 3:
                srt="顺丰";
                break;
            case 4:
                srt="申通";

                break;
            default:
                throw new IllegalStateException("Unexpected value: " + x);
        }
        return srt;
    }

}
