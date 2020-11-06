import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Game2 {
         private String name;
         private int lifevalue;
         private int defensevalue;
         private int aggressivity;
         public Game2( String name,int lifevalue,int defensevalue,int aggressivity){
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
     class Hero2 extends Game2 {
         Hero2(String name, int lifevalue, int defensevalue, int aggressivity) {
             super(name, lifevalue, defensevalue, aggressivity);
         }

         static class  Monster2 extends Game2 {


             Monster2(String name, int lifevalue, int defensevalue, int aggressivity) {
                 super(name, lifevalue, defensevalue, aggressivity);
             }


         }
         static class oper{
             public static void main(String[] args) {
             List<Monster2> list = new ArrayList<>();
             Scanner x = new Scanner(System.in);
                 int i = 1;
                 while (i <= 3) {
                     System.out.println("为你的对手赋予属性 依次为 编号，名称，生命值，防御力，攻击力");
                     Monster2 monster = new Monster2( x.next(), Integer.parseInt(x.next()), Integer.parseInt(x.next()), Integer.parseInt(x.next()));
                     monster.attribute();
                     list.add(monster);
                     i++;
                 }
                 System.out.println("为你的主角赋予属性 依次为名称，生命值，防御力，攻击力");
                 Scanner sc = new Scanner(System.in);
                 String name1 = sc.next();
                 int lifevalue1 = sc.nextInt();
                 int defensevalue1 = sc.nextInt();
                 int aggressivity1 = sc.nextInt();
                 Game2 hero = new Hero2(name1, lifevalue1, defensevalue1, aggressivity1);
                 hero.attribute();
                 int attack1,attack2;
                 int c;
                 for (Monster2 monster2 : list) {

                         do {
                             c = monster2.getLifevalue();
                             attack1 = hero.attack(aggressivity1, monster2.getDefensevalue());
                             c = c - attack1;
                             System.out.println("你对怪造成了" + attack1 + "点伤害");
                             attack2 = monster2.getAggressivity() - defensevalue1;
                             if (attack2 <= 0) {
                                 attack2 = 0;
                             }
                             lifevalue1 = lifevalue1 - attack2;
                             System.out.println("你被怪造成了" + attack2 + "点伤害");
                             if (lifevalue1 <= 0) {
                                 lifevalue1 = 0;
                             }
                             if (c <= 0)
                                 c = 0;
                             System.out.println("你目前剩余的生命" + lifevalue1);
                             System.out.println("怪目前剩余的生命" + c);

                         } while (lifevalue1 > 0 && attack1 != 0 && c > 0);
                         if (lifevalue1 > 0 && attack1 != 0) {
                             System.out.println("你已击杀" + monster2.getName());
                         }
                         if (attack1 == 0) {
                             System.out.println("未能击穿敌方护甲");
                         }
                         if (c > 0 && attack2 != 0) {
                             System.out.println("你已被击杀");
                             System.out.println("游戏结束了哦");
                         }
                     }

                 }


         }
}







