package dijkstra;

import java.util.Map.Entry;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

public class Dijkstra {

    public static Graph calcPathGraph(Graph grafo, Nodo origine) {
        
        origine.setDistance(0);
        Set<Nodo> nodiEsaminati = new HashSet<>();
        Set<Nodo> nodiDaEsaminare = new HashSet<>();

        nodiDaEsaminare.add(origine);

        while (nodiDaEsaminare.size() != 0) {
            Nodo nodoCorrente = calcMinDistNodo(nodiDaEsaminare);
            nodiDaEsaminare.remove(nodoCorrente);

            for (Entry<Nodo, Integer> corrVicina : nodoCorrente.getAdjacentNodes().entrySet()) {
                Nodo nodoVicino = corrVicina.getKey();
                Integer pesoLink = corrVicina.getValue();

                if (!nodiEsaminati.contains(nodoVicino)) {
                    CalcDistMin(nodoVicino, pesoLink, nodoCorrente);
                    nodiDaEsaminare.add(nodoVicino);
                }
            }
            nodiEsaminati.add(nodoCorrente);
        }
        
        return grafo;
    }

    private static void CalcDistMin(Nodo nodo, Integer peso, Nodo sorgente) {
        Integer distanzaSorgente = sorgente.getDistance();

        if (distanzaSorgente + peso < nodo.getDistance()) {
            nodo.setDistance(distanzaSorgente + peso);
            LinkedList<Nodo> percorsoMin = new LinkedList<>(sorgente.getShortestPath());
            percorsoMin.add(sorgente);
            nodo.setShortestPath(percorsoMin);
        }
    }

    private static Nodo calcMinDistNodo(Set<Nodo> nodiDaEsaminare){
        Nodo lowestDistanceNode = null;
        int lowestDistance = Integer.MAX_VALUE;
        for (Nodo node : nodiDaEsaminare) {
            int nodeDistance = node.getDistance();
            if (nodeDistance < lowestDistance) {
                lowestDistance = nodeDistance;
                lowestDistanceNode = node;
            }
        }
        return lowestDistanceNode;
    }
}