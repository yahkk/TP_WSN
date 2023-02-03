import java.util.ArrayList;
import java.util.List;

class Cluster{
    private int centerX;
    private int centerY;
    private List<node> nodes;

    public Cluster(int centerX, int centerY, List<node> nodes) {
        this.centerX = centerX;
        this.centerY = centerY;
        this.nodes = nodes;
    }
}
