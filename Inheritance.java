public class Inheritance {
    public static void main (String[] args) {
        Dog dog = new Dog();
        dog.makeSound();

        Bird bird = new Bird();
        bird.makeSound();

        Person firstPerson = new Person();
        firstPerson.printFullName();

        Object[] list = {new Dog(), new DogFood()}
    }
}
 class Animal {
     String sound = "";
     void makeSound () {
         System.out.println(sound);
     }

}

class Dog extends Animal {
    Dog() {
        sound ="bark";
    }

}

class Bird extends Animal {
    Bird () {
        sound ="Quack Quack";
    }
}

class Human {
    String firstName = "";
    String lastName = "";

    void printFullName () {
        System.out.println(firstName + " " + lastName);
    }

}

class Person extends  Human {
   Person () {
       firstName = "Hamza";
       lastName = "Mohamed";
    }
}

class DogFood {

}