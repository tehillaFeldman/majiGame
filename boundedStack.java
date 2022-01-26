
import java.util.*;
import java.util.Scanner;

class boundedStack {

  //create array
  ArrayDeque<Double> majiGame = new ArrayDeque<>(5);

  public void load(double place) {
    
    int i = 0;
    //run load 
    while (i <= place) {

      String gameSpells;

      Scanner spellvalue = new Scanner(System.in);
      System.out.println("What is your spell: ");

      gameSpells = spellvalue.nextLine();
      //if array is full then pollfirst
      if (majiGame.size() >= 50) { 

        majiGame.pollFirst();
      }
      //if array is not full then add spell
      //input parsed to a double
      majiGame.addLast((double) Double.parseDouble(gameSpells));
      System.out.println(majiGame);

      //continue through the loop
      i++;
    }

  }

  public void pop() {
    System.out.println(majiGame.pollLast());
  }

  public void unload() {
    while (majiGame.size() > 0) {
      System.out.print(majiGame.pollLast() + " ");
    }
    System.out.println();
  }

}