package initialization;

class Dog {
    Dog() {}
    public void bark(int barkTimes) {
        System.out.println("Barking " + barkTimes + " times");
    }
    public void bark(String howlNoise) {
        System.out.println("Howling " + howlNoise);
    }

    public void bark(int barkTimes, String howlNoise) {
        System.out.println("Barking " + barkTimes + "times then howling " + howlNoise);
    }

    public void bark(String howlNoise, int barkTimes) {
        System.out.println("Howling " + howlNoise + " then barking " + barkTimes + " times");
    }
}

public class Practice5 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.bark(3);
        dog.bark("Uuuuuuuu");
        dog.bark(5, "Aaaaaaaa");
        dog.bark("Ffffff", 7);
    }
}

/* output:
Barking 3 times
Howling Uuuuuuuu
Barking 5times then howling Aaaaaaaa
Howling Ffffff then barking 7 times
 */