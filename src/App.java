import java.util.HashSet;

import dijkstra.*;

public class App {
    public static void main(final String[] args) throws Exception {
        final Nodo nodeA = new Nodo("A");
        final Nodo nodeB = new Nodo("B");
        final Nodo nodeC = new Nodo("C");
        final Nodo nodeD = new Nodo("D");
        final Nodo nodeE = new Nodo("E");
        final Nodo nodeF = new Nodo("F");

        nodeA.addDestination(nodeB, 10);
        nodeA.addDestination(nodeC, 15);

        nodeB.addDestination(nodeD, 12);
        nodeB.addDestination(nodeF, 15);

        nodeC.addDestination(nodeE, 10);

        nodeD.addDestination(nodeE, 2);
        nodeD.addDestination(nodeF, 1);

        nodeF.addDestination(nodeE, 5);

        Graph graph = new Graph();
        

        graph.addNode(nodeA);
        graph.addNode(nodeB);
        graph.addNode(nodeC);
        graph.addNode(nodeD);
        graph.addNode(nodeE);
        graph.addNode(nodeF);

        graph = Dijkstra.calcPathGraph(graph, nodeA);

        System.out.println(graph);
    }
}
