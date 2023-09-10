public class Cat extends Animal{

    static final String kind = "Cat";//Константа вида животного
    public Cat(String name,Double age) {
        this.name = name;
        this.age = age;
    }
   
    @Override
    public void makeSound(){
        System.out.println(name + " - meows");
    }
    @Override 
    public String displayInfo(){
        return String.format("%s -  %s -  %s",kind,name,age);
    }  
}