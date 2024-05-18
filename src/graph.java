public class graph {

  private vertex vertexList[];
  private int adjMat[][];
  private int nVerts;

  public graph(int maxVerts) {
    vertexList = new vertex[maxVerts];
    adjMat = new int[maxVerts][maxVerts];
    nVerts = 0;

    for (int i = 0; i < maxVerts; i++)
      for (int j = 0; j < maxVerts; j++)
        adjMat[i][j] = 0;

  }
  
  public void addVertex(char lab) {
    vertexList[nVerts++] = new vertex(lab);

  }

  public void addEdge(int start, int end) {
    adjMat[start][end] = 1;
    adjMat[end][start]=1;

  }

  public void adjancencyMatrix() {
    for (int i = 0; i < adjMat.length; i++) {
      for (int j = 0; j < adjMat[0].length; j++) {
        System.out.print(adjMat[i][j] + " ");
      }
      System.out.println();

    }
  }

}
