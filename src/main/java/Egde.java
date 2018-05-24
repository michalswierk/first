public class Egde {
  private  Node from;
  private Node to;
  int distance;

  public Node getFrom() {
    return from;
  }

  public void setFrom(Node from) {
    this.from = from;
  }

  public int getDistance() {
    return distance;
  }

  public void setDistance(int distance) {
    this.distance = distance;
  }

  public Node getTo() {
    return to;
  }

  public void setTo(Node to) {
    this.to = to;
  }
  public Egde(Node from, Node to,int distance){
    this.distance=distance;
    this.from=from;
    this.to=to;


  }
  public String toString(){
    return String.format("%d->%d (d) ",from,to,distance );
  }
}
