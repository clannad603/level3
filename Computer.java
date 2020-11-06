public class Computer {

    private String computername;
    private int money;
    public Computer(String computername, int money){
    this.setComputername(computername);
    this.setMoney(money);
}
    public String getComputername() {
        return computername;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public void setComputername(String computername) {
        this.computername = computername;
    }
}


