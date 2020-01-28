public class Mom implements Observer {
  Subject baby;  //Defines the subject to be observed
  
  //Constructor for the Mom type
  public Mom(Subject baby) {
    this.baby = baby;
    baby.registerObserver(this);
  }
  
  //Prints out the correct message based of the current Cry type for the subject
  public void update(Cry cry) {
    if(cry == Cry.ANGRY) {
      System.out.println("Mom hugs and rocks baby, maybe spoiling");
    }
    else if(cry == Cry.HUNGRY) {
      System.out.println("Mom cuddles and feeds baby");
    }
    else {
      System.out.println("Mom changes baby");
    }
  }
    
  }