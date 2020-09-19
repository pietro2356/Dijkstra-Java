package dijkstra;

import java.util.HashSet;
import java.util.Set;

public class Graph {
    private Set<Node> nodi = new HashSet<>();

    public void addNode(Node item) {
        nodi.add(item);
    }
}
