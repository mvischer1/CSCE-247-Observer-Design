public class Dad implements Observer {
  Subject baby;  //Defines the subject to be observed
  
  //Constructor for the Dad type
  public Dad(Subject baby) {
    this.baby = baby;
    baby.registerObserver(this);
  }
  
  //Prints out the correct message based of the current Cry type for the subject
  public void update(Cry cry) {
    if(cry == Cry.ANGRY) {
      System.out.println("Dad puts in earplugs");
    }
    else if(cry == Cry.HUNGRY) {
      System.out.println("Dad feeds baby");
    }
    else {
      System.out.println("Dad calls mom");
    }
  }
}