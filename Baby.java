import java.util.ArrayList;  //used to implement the ArrayList for the observers

public class Baby implements Subject {
  ArrayList<Observer> observers;  //Defines the ArrayList of type Observers
  Cry cry;
  
  //Baby Constructor that prints initial message and initiates the ArrayList
  public Baby() {
    System.out.println("A baby is born");
    observers = new ArrayList<Observer>();
  }
  
  //Adds an observer to the ArrayList
  public void registerObserver(Observer observer) {
    observers.add(observer);
  }
  
  //Removes an observer from the ArrayList
  public void removeObserver(Observer observer) {
    observers.remove(observer);
  }
  
  //Calls the update method in the observer classes for each observer in the current ArrayList
  public void notifyObservers() {
    for(Observer observer : observers) {
      observer.update(cry);
    }
  }
  
  //Prints unique message and sets the baby's cry atribute to ANGRY, then calls the notifyObservers
  public void angryCry() {
    System.out.println();
    System.out.println("This baby is angry!");
    cry = Cry.ANGRY;
    notifyObservers();
  }
  
  //Prints unique message and sets the baby's cry atribute to HUNGRY, then calls the notifyObservers
  public void hungryCry() {
    System.out.println();
    System.out.println("This baby is hungry");
    cry = Cry.HUNGRY;
    notifyObservers();
  }
  
  //Prints unique message and sets the baby's cry atribute to WET, then calls the notifyObservers
  public void wetCry() {
    System.out.println();
    System.out.println("This baby is wet");
    cry = Cry.WET;
    notifyObservers();
  }
}