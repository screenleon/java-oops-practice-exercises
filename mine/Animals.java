/*Q:
Create a interface named as Animal consisting of 2 abstract methods
named as sound() and eat().
1]Create a class named as Dog which implements Animal interface.
2]Create a class named as Cow which implements Animal interface.
3]Create an object of class Dog and assign to reference variable of interface Animal.
4]Create an object of class Cow and assign to reference variable of interface Animal.
The Overridden method should print the following output -
For Dog class
		sound()- "Dog barks.!"
		eat()- "Dog Eats bone."
For Cow class
		sound()-"Cow moo,
		eat() - "Cow eats grass."
Note-
The names of interface, class and methods should be same as defined in the question 
or else the program won't be considered output.
The output should be same as above.
*/

package mine;

public class Animals {
    public static void main(String[] args) {
        Animal dog = new Dog();
        dog.sound();
        dog.eat();
        Animal cow = new Cow();
        cow.sound();
        cow.eat();
    }
}

interface Animal {
    void sound();
    void eat();
}

class Dog implements Animal {
    @Override
    public void sound() {
        System.out.println("Dog barks.!");
    }

    @Override
    public void eat() {
        System.out.println("Dog Eats bone.");
    }
}

class Cow implements Animal {
    @Override
    public void sound() {
        System.out.println("Cow moo.");
    }

    @Override
    public void eat() {
        System.out.println("Cow eats grass.");
    }
}