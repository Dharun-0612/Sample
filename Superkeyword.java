//It is a B1 branch
   class Animal{

    String colour="Brown";

    Animal(String name)
    {
        System.out.println(name);
    }

    void makeSound(){
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal{
    
    Dog()
    {   
        super("Jimmy");
        super.makeSound();
        System.out.println("Dog");
        System.out.println(super.colour);
    }

   
}

public class Superkeyword{
    public static void main(String args[])
    {
        Dog d=new Dog();
    }
} 