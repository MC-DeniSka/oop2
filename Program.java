

public class Program {
    public static void main(String []args){

        Cat Cat1 = new Cat("barsik",5.0);
        Dog Dog1 = new Dog("tuzik",6.8);
        System.out.println(Cat1.displayInfo());
        System.out.println(Dog1.displayInfo());
        Cat1.makeSound();
        Dog1.makeSound();
    }

}
