public class Inheritance {
    public static void main (String[] args) {
        // Dog dog = new Dog();
        // dog.makeSound();

          Thing widget = new Widget();
        ((Thing)widget).refuseToWork();

        Bird bird = new Bird();
        bird.makeSound();

        Person firstPerson = new Person();
        firstPerson.printFullName();

        Object[] list = {new Dog(), new DogFood()};
        // Dog dog = (Dog) list[0];
    //   ((Dog)list[1]).makeSound();

    for(Object object: list) {
        if(object instanceof Animal) {
            ((Animal)object).makeSound();
        }
    }
    
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

class Widget extends Thing {
    String[] excuses = {"It's too heavy.", "I don't know how.", "You know I don't speak Spanish."};
    int excuseId = 1;

    void refuseToWork() {
        String excuse = excuses[++excuseId];
        System.out.println(excuse);
    }
}

class Thing {
    String purpose = "do stuff";

    void printPurpose() {
        System.out.println(purpose);
    }
}