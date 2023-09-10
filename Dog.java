public class Dog extends Animal{

    static final String kind = "Dog";//Константа вида животного
    public Dog(String name,Double age) {
        this.name = name;
        this.age = age;
    }
   
    @Override
    public void makeSound(){
        System.out.println(name + " - barks");
    }
    @Override 
    public String displayInfo(){
        return String.format("%s -  %s -  %s",kind,name,age);
    }
}