import java.util.ArrayList;
import java.util.List;

public class Node {
    public String label;
    public Node parent;
    public List<Node> children;

    public Node(String label) {
        this.label = label;
        this.children = new ArrayList<>();
    }

    public void addChild(Node child) {
        this.children.add(child);
    }

    public int height() {
        if (children.isEmpty()) {
            return 0;
        }

        int maxHeight = 0;

        for (Node child : children) {
            maxHeight = Math.max(maxHeight, child.height());
        }

        return maxHeight + 1;
    }
}
