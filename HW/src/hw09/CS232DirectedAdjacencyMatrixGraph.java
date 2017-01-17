package hw09;

import java.util.ArrayList;

/**
 * An adjacency matrix implementation of the Graph ADT for directed graphs.
 * 
 * @author Grant Braught
 * @author Dickinson College
 * @version April 27, 2016
 * 
 * @param <V>
 *            the type of object associated with the vertices.
 * @param <E>
 *            the type of object associated with the edges.
 */
public class CS232DirectedAdjacencyMatrixGraph<V, E> extends
		CS232AbstractGraph<V, E> {

	/**
	 * Holds the objects associated with each edge. Null values indicate that an
	 * edge does not exist.
	 * 
	 * <Pre>
	 * Row (first) index = start vertex.
	 * Column (second) index = end vertex
	 * </pre>
	 */
	protected E[][] edges;

	/**
	 * Construct a new AdjacencyMatrixGraph with the specified number of
	 * vertices.
	 * 
	 * @param numVertices
	 *            the number of vertices in the graph.
	 */
	public CS232DirectedAdjacencyMatrixGraph(int numVertices) {
		super(numVertices);
		edges = (E[][]) new Object[numVertices][numVertices];
	}

	/**
	 * {@inheritDoc}
	 */
	public void addEdge(int v1, int v2, E value) {
		checkVertices(v1, v2);

		if (v1 == v2) {
			throw new IllegalArgumentException(
					"Self-edges are not allowed: v1 cannot equal v2.");
		}

		if (value == null) {
			throw new IllegalArgumentException("Edge value cannot be null.");
		}

		// add the edge.
		if (edges[v1][v2] == null) {
			numEdges++;
		}
		edges[v1][v2] = value;
	}

	/**
	 * {@inheritDoc}
	 */
	public E getEdge(int v1, int v2) {
		checkVertices(v1, v2);
		return edges[v1][v2];
	}

	/**
	 * {@inheritDoc}
	 */
	public E removeEdge(int v1, int v2) {
		checkVertices(v1, v2);
		E tmp = edges[v1][v2];
		edges[v1][v2] = null;
		
		if (tmp != null) {
			numEdges--;
		}
		
		return tmp;
	}

	/**
	 * {@inheritDoc}
	 */
	public ArrayList<Integer> getNeighbors(int v) {
		// Intentionally not implemented - see homework assignment.
		throw new UnsupportedOperationException("Not yet implemented");
	}
	
	/**
	 * Get the in degree of vertex v.
	 * 
	 * @param v
	 *            the vertex of which to compute the in degree.
	 * @return the in degree of vertex v.
	 */
	public int inDegree(int v) {
		// Intentionally not implemented - see homework assignment.
		throw new UnsupportedOperationException("Not yet implemented");
	}
}
