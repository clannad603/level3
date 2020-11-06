
import java.util.Scanner;
class Game {
   private String name;
    private int lifevalue;
   private int defensevalue;
   private int aggressivity;
    public Game( String name,int lifevalue,int defensevalue,int aggressivity){
        this.setName(name);
        this.setLifevalue(lifevalue);
        this.setDefensevalue(defensevalue);
        this.setAggressivity(aggressivity);
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setLifevalue(int lifevalue) {
        this.lifevalue = lifevalue;
    }

    public void setAggressivity(int aggressivity) {
        this.aggressivity = aggressivity;
    }

    public void setDefensevalue(int defensevalue) {
        this.defensevalue = defensevalue;
    }

    public String getName() {
        return name;
    }

    public int getLifevalue() {
        return lifevalue;
    }

    public int getDefensevalue() {
        return defensevalue;
    }

    public int getAggressivity() {
        return aggressivity;
    }
    public void attribute(){
        System.out.println( "姓名： "+getName()+",攻击力 :"+getAggressivity()+",防御力 ："+getDefensevalue()+",生命值 ："+getLifevalue());
    }

    public int attack(int b,int c){
        int a;
        a=b-c;
        if(a>=1){
            return a;
        }else{
            return 0;
        }
    }

}
class Hero extends Game{
     Hero( String name,int lifevalue,int defensevalue,int aggressivity){
        super( name,lifevalue,defensevalue,aggressivity);
    }
}
  class Monster extends  Game{

     Monster( String name, int lifevalue, int defensevalue, int aggressivity) {
        super( name, lifevalue, defensevalue, aggressivity);
    }
}


    class gameprocess{
    public static void main(String[] args) {
        System.out.println("为你的主角赋予属性 依次为名称，生命值，防御力，攻击力");
        Scanner sc=new Scanner(System.in);
        String name1=sc.next();
        int lifevalue1=sc.nextInt();
        int defensevalue1=sc.nextInt();
        int aggressivity1=sc.nextInt();
           Game hero=new Hero( name1,lifevalue1,defensevalue1,aggressivity1);
        hero.attribute();
        System.out.println("为你的对手赋予属性 依次为名称，生命值，防御力，攻击力");
        Scanner c=new Scanner(System.in);
        String name2=c.next();
        int lifevalue2=c.nextInt();
        int defensevalue2=c.nextInt();
        int aggressivity2=c.nextInt();
        Game monster=new Monster ( name2,lifevalue2,defensevalue2,aggressivity2);
        monster.attribute();
        int attack1,attack2;
      do{
          attack1=hero.attack(aggressivity1,defensevalue2);
          lifevalue2=lifevalue2-attack1;
          System.out.println("你对怪造成了"+attack1+"点伤害");
          attack2= monster.attack(aggressivity2,defensevalue1);
          lifevalue1=lifevalue1-attack2;
          System.out.println("你被怪造成了"+attack2+"点伤害");
          if(lifevalue1<=0){
              lifevalue1=0;
          }
          if(lifevalue2<=0){
              lifevalue2=0;
          }
          System.out.println("你目前剩余的生命"+ lifevalue1);
          System.out.println("怪目前剩余的生命"+lifevalue2);

      }while(lifevalue1>0&&attack1!=0&&lifevalue2>0);
        if(lifevalue1>0&&attack1!=0){
            System.out.println("你已击杀"+name2);
        }
        if(attack1==0){
            System.out.println("未能击穿敌方护甲");
        }
        if(lifevalue2>0&&attack2!=0){
            System.out.println("你已被击杀");
            System.out.println("游戏结束了哦");
        }
    }
}
