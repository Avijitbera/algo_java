package graph;

public class Edge {
    private Vertex start;
    private Vertex end;
    private Integer weight;

    public Edge(Vertex startV, Vertex endV, Integer inputWeight){
        this.start = startV;
        this.end = endV;
        this.weight = inputWeight;
    }

    public Vertex getEnd(){
        return this.end;
    }

    public Vertex getStart(){
        return this.start;
    }

    public Integer getWeight(){
        return this.weight;
    }

}
