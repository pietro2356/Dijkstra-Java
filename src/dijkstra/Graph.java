package dijkstra;

import java.util.HashSet;
import java.util.Set;

public class Graph {
    private Set<Nodo> nodi = new HashSet<>();

    public void addNode(Nodo item) {
        nodi.add(item);
    }
}
