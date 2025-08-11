public class serialize {

    static class Node {
        int data;
        Node left, right;
        Node(int data) {
            this.data = data;
        }
    }

    static class Codec {
        private static final String NULL_SYMBOL = "#";
        private static final String SEPARATOR = ",";

        public String serialize(Node root) {
            StringBuilder sb = new StringBuilder();
            serializeHelper(root, sb);
            return sb.toString();
        }

        private void serializeHelper(Node node, StringBuilder sb) {
            if (node == null) {
                sb.append(NULL_SYMBOL).append(SEPARATOR);
                return;
            }
            sb.append(node.data).append(SEPARATOR);
            serializeHelper(node.left, sb);
            serializeHelper(node.right, sb);
        }

        public Node deserialize(String data) {
            java.util.LinkedList<String> nodes = new java.util.LinkedList<>(java.util.Arrays.asList(data.split(SEPARATOR)));
            return deserializeHelper(nodes);
        }

        private Node deserializeHelper(java.util.LinkedList<String> nodes) {
            String val = nodes.removeFirst();
            if (val.equals(NULL_SYMBOL)) {
                return null;
            }
            Node node = new Node(Integer.parseInt(val));
            node.left = deserializeHelper(nodes);
            node.right = deserializeHelper(nodes);
            return node;
        }
    }

    // Utility method to print inorder traversal of the tree
    static void inorder(Node root) {
        if (root == null) return;
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.right.left = new Node(4);
        root.right.right = new Node(5);

        // Serialize
        Codec codec = new Codec();
        String serialized = codec.serialize(root);
        System.out.println("Serialized tree: " + serialized);

        // Deserialize
        Node deserializedRoot = codec.deserialize(serialized);
        System.out.print("Inorder traversal of deserialized tree: ");
        inorder(deserializedRoot);
        System.out.println();
    }
}
