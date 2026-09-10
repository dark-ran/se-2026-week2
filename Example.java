public class Example {

    public static void main(String[] args) {
        Node root = new Node("Root");
        Node child1 = new Node("Child 1");
        Node child2 = new Node("Child 2");
        Node child1_1 = new Node("Child 1.1");

        root.addChild(child1);
        root.addChild(child2);
        child1.addChild(child1_1);

        System.out.println("Root label: " + root.label);
        System.out.println("Children of Root:");
        for (Node child : root.children) {
            System.out.println("- " + child.label);
        }

        System.out.println("Root height: " + root.height());
        System.out.println("Child 1 height: " + child1.height());
        System.out.println("Child 2 height: " + child2.height());
    }
}
