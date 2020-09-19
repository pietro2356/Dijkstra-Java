package dijkstra;

import java.util.HashSet;
import java.util.Set;

import jdk.internal.jimage.ImageReader.Node;

public class Graph {
    private Set<org.w3c.dom.Node> nodi = new HashSet<>();

    public void addNode(Node item) {
        nodi.add(item);
    }
}
