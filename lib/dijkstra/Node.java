package dijkstra;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Node {
    private String nome;
    private List<Node> percorso = new LinkedList<>();
    private Integer distanza = Integer.MAX_VALUE;

    Map<Node, Integer> nodiVicini = new HashMap<>();

    public void addDestinazione(Node destinazione, int distanza) {
        nodiVicini.put(destinazione, distanza);
    }

    public Node(String nome){
        this.nome = nome;
    }
}
