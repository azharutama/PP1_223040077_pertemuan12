import org.w3c.dom.Node;

public class vertex {

  private char label;
  private boolean wasVisited;

  public vertex(char lab) {

    label = lab;
    wasVisited = false;

  }
  
    //setter getter//
  
public void setlabel(char label) {
  this.label= label;
}

  public char getData() {
    return label;
}



public void setWasvisited(boolean wasVisited) {
  this.wasVisited = wasVisited;
}


public boolean getWasVisited() {
    return wasVisited;
}




}


