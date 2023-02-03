import java.util.ArrayList;
import java.util.List;

public class LEACHProtocol {
    private List<node> nodes;
    private int numClusters;

    public LEACHProtocol(List<node> nodes, int numClusters) {
        this.nodes = nodes;
        this.numClusters = numClusters;
    }

    public List<Cluster> performClustering() {
        // Algorithme de clustering LEACH ici
        // ...
    }
    List<Node> nodes = new ArrayList<>();
    // Lire les positions des nœuds à partir d'un fichier ou d'une source externe
    // ...
    
    int numClusters = 10;
    
    LEACHProtocol leach = new LEACHProtocol(nodes, numClusters);
    List<Cluster> clusters = leach.performClustering();
    
    for (Cluster cluster : clusters) {
        System.out.println("Cluster center: (" + cluster.centerX + ", " + cluster.centerY + ")");
        System.out.println("Nodes in this cluster: " + cluster.nodes);
    }
    }

}