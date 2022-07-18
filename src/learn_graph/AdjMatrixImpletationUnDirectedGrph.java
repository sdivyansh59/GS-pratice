package learn_graph;

import java.util.Scanner;

public class AdjMatrixImpletationUnDirectedGrph {

	public static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter total No. of Matrix Vertex");
		int V =sc.nextInt();
		System.out.println("Enter total No. of Matrix Edge");
		int E =sc.nextInt(); 
		
		boolean [][]adjMatrix = new boolean [V][V];
		
		for ( int i=0 ;i< E; i++) {
			System.out.println("from Vertex: ");
			int fromVertex = sc.nextInt();
			System.out.println("to Vertex: ");
			int toVertex= sc.nextInt();
			
			adjMatrix[fromVertex][toVertex] = true;
			adjMatrix[toVertex][fromVertex] = true;
		}
		
		//System.out.println();
		print2DArray(adjMatrix);
	}
	
	public static void print2DArray(boolean [][]adjMatrix){
		int row = adjMatrix.length;
		int col = adjMatrix[0].length;
		for( int i=0 ;i< row; i++) {
			for( int j=0 ; j< col ;j++) {
				System.out.print(adjMatrix[i][j]+" ");
			}
			System.out.println();
		}
	}

}
