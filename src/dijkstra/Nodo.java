package dijkstra;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Nodo {

    private String nome;

    private LinkedList<Nodo> percorso = new LinkedList<>();

    private Integer distanza = Integer.MAX_VALUE;

    private Map<Nodo, Integer> nodoVicino = new HashMap<>();

    public Nodo(String nome) {
        this.nome = nome;
    }

    public void addDestination(Nodo destinazione, int distanza) {
        nodoVicino.put(destinazione, distanza);
    }

    public String getName() {
        return nome;
    }

    public void setName(String nome) {
        this.nome = nome;
    }

    public Map<Nodo, Integer> getAdjacentNodes() {
        return nodoVicino;
    }

    public void setAdjacentNodes(Map<Nodo, Integer> adjacentNodes) {
        this.nodoVicino = adjacentNodes;
    }

    public Integer getDistance() {
        return distanza;
    }

    public void setDistance(Integer distance) {
        this.distanza = distance;
    }

    public List<Nodo> getShortestPath() {
        return percorso;
    }

    public void setShortestPath(LinkedList<Nodo> shortestPath) {
        this.percorso = shortestPath;
    }

}