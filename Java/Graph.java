/*Description: Find the edge weights. 
Author: April Randolph
Date: 10/19/2019, 02/06/2020*/
import java.util.*;
import java.lang.*;
import java.io.*;

class Graph {
	
	class Edge implements Comparable<Edge> {
		
		int src, dst, weight;
		
		public int compareTo(Edge edge) {
			return this.weight-edge.weight;
		}
	}
	
	class Subset {
		int parent, rank;
	}
		
	int V;
	int E;
	Edge[] edges;
	Graph(int v, int e) {
		
		V = v;
		E = e;
		edges = new Edge[E];
		for(int i=0;i<e;++i)
			edges[i] = new Edge();		
	}
	
	int find(Subset subsets[], int i) {
		if(subsets[i].parent != i)
			subsets[i].parent = find(subsets, subsets[i].parent);
		
		return subsets[i].parent;
	}
	
	void Union(Subset subsets[], int x, int y) {
		int xroot = find(subsets, x);
		int yroot = find(subsets, y);
		
		if(subsets[xroot].rank < subsets[yroot].rank)
			subsets[xroot].parent = yroot;
		else if(subsets[xroot].rank > subsets[yroot].rank)
			subsets[yroot].parent = xroot;
		
		else {
			subsets[yroot].parent = xroot;
			subsets[xroot].rank++;
		}
	}
		
	void KruskalMST() {	
		Edge result[] = new Edge[V];
		int e = 0;
		int i = 0;
		for(i=0;i<V;i++)
			result[i] = new Edge();
		Arrays.sort(edges);
		Subset subsets[] = new Subset[V];
		for(i=0;i<V;i++)
			subsets[i] = new Subset();
		
		for(int v =0;v<V;++v) {
			subsets[v].parent = v;
			subsets[v].rank = 0;
		}
		
		i = 0;
		while (e < V -1) {
			Edge next_edge = new Edge();
			next_edge = edges[i++];
			
			int x = find(subsets, next_edge.src);
			int y = find(subsets, next_edge.dst);
			
			if( x!= y) {
				result[e++] = next_edge;
				Union(subsets, x, y);
			}
		
		}
		System.out.println("Resulting graph:");
		for(i = 0;i<e;++i) {
			System.out.println(result[i].src+ " " + result[i].dst + " " + result[i].weight);
		}
		
	}
	
	public static void main(String[] args) {
		
		int V = 4;
		int E = 5;
		Graph graph = new Graph(V, E);
		
		graph.edges[0].src = 0;
		graph.edges[0].dst = 1;
		graph.edges[0].weight = 10;
		
		graph.edges[1].src = 0;
		graph.edges[1].dst = 2;
		graph.edges[1].weight = 6;
		
		graph.edges[2].src = 1;
		graph.edges[2].dst = 3;
		graph.edges[2].weight = 5;
		
		graph.edges[3].src = 1;
		graph.edges[3].dst = 3;
		graph.edges[3].weight = 15;
		
		graph.edges[4].src = 2;
		graph.edges[4].dst = 3;
		graph.edges[4].weight = 4;
		for(int i = 0;i<5;++i)
			System.out.println(graph.edges[i].src+ " " + graph.edges[i].dst + " " + graph.edges[i].weight);
		
		graph.KruskalMST();
	}
	
}
