//: polymorphism/music3/Music3.java
// An extensible program.
package polymorphism.music3;
import polymorphism.music.Note;
import static net.mindview.util.Print.*;
import java.util.*;

class Instrument {
  void play(Note n) { print("Instrument.play() " + n); }
  public String toString() { return "Instrument"; }
  void adjust() { print("Adjusting Instrument"); }
}

class Wind extends Instrument {
  void play(Note n) { print("Wind.play() " + n); }
  public String toString() { return "Wind"; }
  void adjust() { print("Adjusting Wind"); }
}	

class Percussion extends Instrument {
  void play(Note n) { print("Percussion.play() " + n); }
  public String toString() { return "Percussion"; }
  void adjust() { print("Adjusting Percussion"); }
}

class Stringed extends Instrument {
  void play(Note n) { print("Stringed.play() " + n); }
  public String toString() { return "Stringed"; }
  void adjust() { print("Adjusting Stringed"); }
}

class Piano extends Instrument {
  void play(Note n) { print("Piano.play() " + n); }
  public String toString() { return "Piano"; }
  void adjust() { print("Adjusting Piano"); }
}

class Brass extends Wind {
  void play(Note n) { print("Brass.play() " + n); }
  void adjust() { print("Adjusting Brass"); }
}

class Woodwind extends Wind {
  void play(Note n) { print("Woodwind.play() " + n); }
  public String toString() { return "Woodwind"; }
}

class RandomInstrumentGenerator {
  private Random rand = new Random(42);
  public Instrument next() {
    switch(rand.nextInt(6)) {
      default:
      case 0: return new Wind();
      case 1: return new Percussion();
      case 2: return new Stringed();
      case 3: return new Brass();
      case 4: return new Woodwind();
      case 5: return new Piano();
    }
  }
}

public class Music3 {
  // Doesn't care about type, so new types
  // added to the system still work right:
  public static void tune(Instrument i) {
    // ...
    i.play(Note.MIDDLE_C);
  }
  public static void tuneAll(Instrument[] e) {
    for(Instrument i : e)
      System.out.println(i);
  }	
  public static void main(String[] args) {
    // Upcasting during addition to the array:
    Instrument[] orchestra = {
      new Wind(),
      new Percussion(),
      new Stringed(),
      new Brass(),
      new Woodwind(),
      new Piano()
    };
    tuneAll(orchestra);

    RandomInstrumentGenerator gen = new RandomInstrumentGenerator();
    Instrument[] instruments = new Instrument[9];
    for (int i = 0; i < instruments.length; i++)
      instruments[i] = gen.next();
    for (int i = 0; i < instruments.length; i++)
      tune(instruments[i]);
  }
} /* Output:
Wind.play() MIDDLE_C
Percussion.play() MIDDLE_C
Stringed.play() MIDDLE_C
Brass.play() MIDDLE_C
Woodwind.play() MIDDLE_C
*///:~

/* Practice6 output:
Wind
Percussion
Stringed
Wind
Woodwind
 */

/* Practice7 output:
Wind
Percussion
Stringed
Wind
Woodwind
Piano
 */

/* Practice8 output:
Wind
Percussion
Stringed
Wind
Woodwind
Piano
Stringed.play() MIDDLE_C
Brass.play() MIDDLE_C
Wind.play() MIDDLE_C
Stringed.play() MIDDLE_C
Wind.play() MIDDLE_C
Percussion.play() MIDDLE_C
Piano.play() MIDDLE_C
Stringed.play() MIDDLE_C
Percussion.play() MIDDLE_C
 */