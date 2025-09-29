
                        // DFS using recursion 
import java.util.*;

public class DFSExample {

     Map<Integer, List<Integer>> adjList;        // node , list of neighbors, adjlist= var-graph store*

    public DFSExample() {
        adjList = new HashMap<>();
    }

    public void addEdge(int src, int dest) {            // adds edges src-first node , dest- second node
        adjList.putIfAbsent(src, new ArrayList<>());
        adjList.putIfAbsent(dest, new ArrayList<>());
        adjList.get(src).add(dest);                     // src node ke neighbor list mai dest add karta hai [1-2]
        adjList.get(dest).add(src);                     // backtracking
    }                                                   // undirected graph [] 1-2, 2-1]

    public void dfs(int start) {                        // start visited node
        Set<Integer> visited = new HashSet<>();        // Keeps track of visited nodes to avoid cycles
        dfsRecursive(start, visited);                   // node visited [1]
    }

     void dfsRecursive(int node, Set<Integer> visited) {     // current node, alreday visited, prevent revisting node and getting struct in cycle;
        visited.add(node);                                          // add visited node (1);
        System.out.print(node + " ");                               // then print 1

        for (int neighbor : adjList.getOrDefault(node, new ArrayList<>())) {        // current node connect with neighbor[2,3]
            if (!visited.contains(neighbor)) {                                      // not visited neighbor then
					(neighbor, visited);                                    // Recurse on unvisited neighbor
            }    
        }
    }

    public static void main(String[] args) {
        DFSExample graph = new DFSExample();
        graph.addEdge(1, 2);
        graph.addEdge(1, 3);
        graph.addEdge(2, 4);
        graph.addEdge(3, 5);
        graph.addEdge(4, 6);
        System.out.println("DFS starting from node 1:");
        graph.dfs(1);
    }
}

/*
 * 
 * 
 * C:\oop-practice>javac DFSExample.java
 * 
 * C:\oop-practice>java DFSExample
 * DFS starting from node 1:
 * 1 2 4 6 3 5
 */