import java.util.Arrays;
import java.util.List;

import dijkstra.Dijkstra;
import dijkstra.Graph;
import dijkstra.Nodo;

public class App {

    public static void main(final String[] args) throws Exception {
        Nodo nodeA = new Nodo("A");
        Nodo nodeB = new Nodo("B");
        Nodo nodeC = new Nodo("C");
        Nodo nodeD = new Nodo("D");
        Nodo nodeE = new Nodo("E");
        Nodo nodeF = new Nodo("F");

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

        List<Nodo> shortestPathForNodeB = Arrays.asList(nodeA);
        List<Nodo> shortestPathForNodeC = Arrays.asList(nodeA);
        List<Nodo> shortestPathForNodeD = Arrays.asList(nodeA, nodeB);
        List<Nodo> shortestPathForNodeE = Arrays.asList(nodeA, nodeB, nodeD);
        List<Nodo> shortestPathForNodeF = Arrays.asList(nodeA, nodeB, nodeD);

        for (Nodo node : graph.getNodes()) {
            switch (node.getName()) {
            case "B":
                if (node.getShortestPath().equals(shortestPathForNodeB)) {
                    System.out.println("B");
                }
                break;
            case "C":
                if (node.getShortestPath().equals(shortestPathForNodeC)) {
                    System.out.println("C");
                }
                break;
            case "D":
                if (node.getShortestPath().equals(shortestPathForNodeD)) {
                    System.out.println("D");
                }
                break;
            case "E":
                if (node.getShortestPath().equals(shortestPathForNodeE)) {
                    System.out.println("E");
                }
                break;
            case "F":
                if (node.getShortestPath().equals(shortestPathForNodeF)) {
                    System.out.println("F");
                }
                break;
            default:
                System.out.println(".");
            break;
            }
        }
    }
    
}
