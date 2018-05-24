public class Node {
  private String name;
  int curDistance = Integer.MAX_VALUE;
  Node curNode;

  public String getName() {
    return name;
  }

  public int getCurDistance() {
    return curDistance;
  }

  public void setCurDistance(int curDistance) {
    this.curDistance = curDistance;
  }

  public Node getCurNode() {
    return curNode;
  }

  public void setCuNode(Node curNode) {
    this.curNode = curNode;
  }

  public void setName(String name) {
    this.name = name;

  }
}
