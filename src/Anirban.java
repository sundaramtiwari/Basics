import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;


public class Anirban {

	public static void main(String[] args) {

	}

}

class Graph {
	int V; // No. of vertices
	List<Integer>[] adj; // Pointer to an array containing adjacency lists

	Graph(int V) {
		this.V = V;
		adj = new LinkedList[V];
	}

	void addEdge(int v, int w) {
		if (adj[v] == null) {
			adj[v] = new LinkedList<Integer>();
		  }

		adj[v].add(w); // Add w to v’s list.
	}

	// This function is a variation of DFSUtil() in http://www.geeksforgeeks.org/archives/18212
	boolean isCyclicUtil(int v, boolean visited[], boolean recStack[]) {
		if (visited[v] == false) {
			// Mark the current node as visited and part of recursion stack
			visited[v] = true;
			recStack[v] = true;

			// Recur for all the vertices adjacent to this vertex
			for (Integer i : adj[v]) {
				if (!visited[i] && isCyclicUtil(i, visited, recStack))
					return true;
				else if (recStack[i])
					return true;
			}
		}
		recStack[v] = false; // remove the vertex from recursion stack
		return false;
	}

	// Returns true if the graph contains a cycle, else false.
	// This function is a variation of DFS() in http://www.geeksforgeeks.org/archives/18212
	boolean isCyclic() {
		// Mark all the vertices as not visited and not part of recursion stack
		boolean[] visited = new boolean[V];
		boolean[] recStack = new boolean[V];

		for (int i = 0; i < V; i++) {
			visited[i] = false;
			recStack[i] = false;
		}

		// Call the recursive helper function to detect cycle in different
		// DFS trees
		for (int i = 0; i < V; i++)
			if (isCyclicUtil(i, visited, recStack))
				return true;

		return false;
	}
}