package com.Week8;

import java.util.*;

public class Graph <E>{

    // A map contains one key for a node and one set that contains all the edges of the node
    private Map<E, Set<Edge<E>>> edgeMap;
    private int numEdges = 0;


    public Graph(){
        edgeMap = new HashMap<E, Set<Edge<E>>>();
    }

    public boolean containsNode(E element){
        return edgeMap.containsKey(element);
    }

    public boolean addNode(E element){
        if (element == null || edgeMap.containsKey(element)){
            return false;
        }
        edgeMap.put(element, new HashSet<Edge<E>>());
        return true;
    }

    public boolean addEdge(E source, E destination, int weight){
        if (!edgeMap.containsKey(source)){
            addNode(source);
        }
        if (!edgeMap.containsKey(destination)){
            addNode(destination);
        }
        Edge<E> newEdge = new Edge<>(source, destination, weight);
        if (!edgeMap.get(source).contains(newEdge)){
            edgeMap.get(source).add(newEdge);
            numEdges++;
            return true;
        }else{
            return false;
        }
    }

    public Set<E> getNeighbors(E element){
        if (element == null || !edgeMap.containsKey(element)){
            return null;
        }
        Set<E> neighbors = new HashSet<E>();
        for (Edge<E> edge:edgeMap.get(element)){
            neighbors.add(edge.getDestination());
        }
        return neighbors;
    }

    /**
     * Breadth First Search
     */

    public boolean bfs(E start, E end){
        if (start == null || end == null || !edgeMap.containsKey(start) || !edgeMap.containsKey(end)){
            return false;
        }
        if (start.equals(end)){
            return true;
        }
        Queue<E> visited = new LinkedList<>();
        Queue<E> toVisit = new LinkedList<>();
        visited.add(start);
        toVisit.add(start);
        while (!toVisit.isEmpty()){
            E current = toVisit.remove();
            if (getNeighbors(current) != null) {
                for (E neighbor : getNeighbors(toVisit.remove())) {
                    if (!visited.contains(neighbor)) {
                        if (neighbor.equals(end)) {
                            return true;
                        }
                        toVisit.add(neighbor);
                        visited.add(neighbor);

                    }
                }
            }
        }
        return false;
    }

    /**
     * Depth First Search
     */
    private Set<E> visited;

    public boolean dfs(E start, E end){
        if (start == null || end == null || !edgeMap.containsKey(start) || !edgeMap.containsKey(end)){
            return false;
        }

        visited.clear();
        return doDfs(start, end);
    }

    private boolean doDfs(E start, E end){
        if (start.equals(end)){
            return true;
        }
        visited.add(start);
        if (getNeighbors(start) != null){
            for (E neighbor : getNeighbors(start)){
                if (!visited.contains(neighbor)) {
                    if (doDfs(start, end)){
                        return true;
                    }
                }
            }
        }
        return false;
    }


}
