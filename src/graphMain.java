public class graphMain {
  public static void main(String[] args) {
    
    graph graph = new graph(5);
    graph graph2 = new graph(4);
//menambahkan vertex
    graph.addVertex('A');
    graph.addVertex('B');
    graph.addVertex('C');
    graph.addVertex('D');
    graph.addVertex('E');
   
//menambahedge
    graph.addEdge(0, 1);
    graph.addEdge(1, 2);
    graph.addEdge(0, 3);
    graph.addEdge(3, 4);
    graph.adjancencyMatrix();
    System.out.println();

    graph2.addVertex('A');
    graph2.addVertex('B');
    graph2.addVertex('C');
    graph2.addVertex('D');
  
   
//menambahedge
        graph2.addEdge(0, 1); // A - B
        graph2.addEdge(0, 2); // A - C
        graph2.addEdge(0, 3); // A - D
        graph2.addEdge(1, 3); // B - D
    graph2.adjancencyMatrix();
    System.out.println();

  }
  
}
