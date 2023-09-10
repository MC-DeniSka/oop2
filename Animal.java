public abstract class Animal{
    protected String name;
    protected Double age;

    public String getName(){
        return name;

    }

    public void setName(String name){
        this.name = name;
    }

    public Double getAge() {
        return age;
    }

    public void setAge(Double age) {
        this.age = age;
    }
    public Animal(){

    }
    

   

    public Animal(String name, Double age) {
        this.name = name;
        this.age = age;
    }
    
    public String displayInfo(){
        return String.format("%s -  %.1f",name,age);
    }    

    public void makeSound(){
        System.out.println(name + "животное подало голос");
    }
}
