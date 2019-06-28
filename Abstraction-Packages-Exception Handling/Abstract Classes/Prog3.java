/*
Create an abstract class Instrument which is having the abstract function play. 
Create three more sub classes from Instrument which is Piano, Flute, Guitar. Override the play method inside all three classes printing a message 
“Piano is playing  tan tan tan tan    for Piano class
“Flute is playing  toot toot toot toot  for Flute class
“Guitar is playing  tin  tin  tin   for Guitar class 
You must not allow the user to declare an object of Instrument class.
Create an array of 10 Instruments.
Assign different type of instrument to Instrument reference.
Check for the polymorphic behavior of  play method.
Use the instanceof operator to print that which object stored at which index of instrument array.
*/

import java.util.Random;

abstract class Instrument {
    public abstract void play();
}

class Piano extends Instrument {
    public void play() {
        System.out.println("Piano is playing tan tan tan tan");
    }
}

class Flute extends Instrument {
    public void play() {
        System.out.println("Flute is playing toot toot toot toot");
    }
}

class Guitar extends Instrument {
    public void play() {
        System.out.println("Guitar is playing tin tin tin");
    }
}

class Test {
    public static void main(String[] args) {
        Instrument arr[] = new Instrument[10];
        Random rand = new Random();
        for (int i = 0;i < arr.length;i++) {
            int choice = rand.nextInt(3) + 1;
            switch(choice) {
                case 1:
                    arr[i] = new Piano();
                    break;
                case 2:
                    arr[i] = new Flute();
                    break;
                case 3:
                    arr[i] = new Guitar();
                    break;
            }
        }
        for (Instrument i:arr) {
            System.out.println("Instrument[" + i + "] instanceof Piano: " + (i instanceof Piano));
            System.out.println("Instrument[" + i + "] instanceof Flute: " + (i instanceof Flute));
            System.out.println("Instrument[" + i + "] instanceof Guitar: " + (i instanceof Guitar));
            i.play();
        }
    }
}