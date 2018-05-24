import com.sun.javafx.geom.Edge;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Graph {

  Node destination;
  List<Node> vertices = new ArrayList<>();
  List<Edge> edges = new ArrayList<>();
  Set<Node> nodes = new HashSet<>();
  List<Node> unvisited = new ArrayList<>();
  Node source;
  Node curNode;

  public void calc() {

    List<Node> neighbour = new ArrayList<>();

    while (!unvisited.isEmpty()) {
      curNode = getClosestNode();
      List<Node> neigbours = getneighbours(curNode);
      for (Node neighbournode : neigbours) {
        if (unvisited.contains(neighbournode)) {
          distance_update(curNode, neighbournode);
        }
      }


    }
  }

  private void distance_update(Node curNode, Node neighbournode) {
   // if(curNode.getCurDistance()>)
  }


  public List<Node> getneighbours(Node curNode) {

    return null;

  }

  public Node getClosestNode() {
    return null;
  }


  public Node getCurNode() {
    Node min = unvisited.get(0);
    for (Node node : unvisited) {
      if (node.getCurDistance() < min.getCurDistance()) {
        min = node;
      }
    }
    return min;
  }

  public void setCurNode(Node curNode) {
    this.curNode = curNode;
  }

  public void initialize() {
    source.setCurDistance(0);
    unvisited.addAll(nodes);


  }


}
