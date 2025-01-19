package graph;

public class Edge {

	public Node from;
	public Node to;
	public double cost;
	
	public Edge(Node from, Node to, double cost) {
		this.from = from;
		this.to = to;
		this.cost = cost;
	}
}
