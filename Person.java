public class Person  implements  Computerbuyer{
private String name;

    public Person(String name) {
        this.setName(name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void getcomputer(Computer computer) {
        System.out.println("您得到了"+computer.getComputername());
    }
}
