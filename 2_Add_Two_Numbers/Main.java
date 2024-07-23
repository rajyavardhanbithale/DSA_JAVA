public class Main {
    public static class LinkNode {
        
       public void Insert(int value){
            Node node = new Node(value);
            node.next = head

       }

        private class Node {
            private int value;
            private Node next;

            public Node(int value) {
                this.value = value;
            }

            public Node(int value, Node next) {
                this.value = value;
                this.next = next;
            }
        }
    }
}