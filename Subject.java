public interface Subject {
  public void registerObserver(Observer observer);  //adds the observer from the method parameters
  public void removeObserver(Observer observer);  //removes the observer from the method parameters
  public void notifyObservers();  //notify method recquired by the subject class that works with update from observer interface
}