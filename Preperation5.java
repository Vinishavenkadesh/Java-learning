//animal -> two method sleep eat method
//dog - class -> bark

// mainla initials dog eat sleep 
class Animal{
    public void sleep(){
        System.out.println("Dog is Sleeping");
    }
    public void eat(){
        System.out.println("Dog is Eating");
    }
}
class Dog extends Animal{
      public void bark(){
        System.out.println("Dpg is Barking");
      }
}

class Preperation5{
    public static void main(String [] args) {
        Dog dog = new Dog();
        dog.eat();
        dog.sleep();
        dog.bark();

    }
}
