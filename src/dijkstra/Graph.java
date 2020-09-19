package dijkstra;

import java.util.HashSet;
import java.util.Set;

public class Graph {
    private Set<Nodo> nodi = new HashSet<>();

    public void addNode(Nodo nodeA) {
        nodi.add(nodeA);
    }

    public Set<Nodo> getNodes() {
        return nodi;
    }

    public void setNodes(Set<Nodo> nodi) {
        this.nodi = nodi;
    }
}
