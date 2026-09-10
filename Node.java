import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

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
    public void bfs() {
        Queue<Node> queue = new LinkedList<>();
        queue.add(this);

        while (!queue.isEmpty()) {
            Node current = queue.poll();
            System.out.println(current.label);

            if (current.children != null) {
                queue.addAll(current.children);
            }
        }
    }
    public void dfs() {
        System.out.println(this.label);
        for (Node child : this.children) {
            child.dfs();
        }
    }
    public boolean haschild() {
        return !children.isEmpty();
    }
}
