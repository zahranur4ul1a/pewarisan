package pewarisan;
public class person {
    private String name;
    private int age;

    public person(){
        name = "";
        age = 0;
    }

    public person(String name, int age){
        this.name = name;
        this.age = age;

    }
    public String getName(){
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge(){
        return this.age;
    }
    public void setAge(){
        this.age = age;
    }
    public void print(){
        System.out.println("Nama:\t" +name);
        System.out.println("Age: \t" +age);
    }
}
