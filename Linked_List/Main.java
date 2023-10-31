/**
 * Main
 */
public class Main {

    public static class LL {

        private Node head;
        private Node tail;
        private int size;

        public LL(){
            size = 0;
        }

        public void insertBegin(int value){
            Node node = new Node(value);
            node.next = head;
            head = node;

            if(tail == null){
                tail = head;
            }
            size +=1;
        }

        public void insertLast(int value){

            if(tail==null){
                insertBegin(value);
                return;
            }
            Node node = new Node(value);
            tail.next = node;
            tail = node;
            size++;
            
        }

        public void insertIndex(int value,int index){

            Node temp = head;
            for(int i=1;i<index;i++){
                temp = temp.next;
            }

            Node node = new Node(value,temp.next);
            temp.next = node;

            size +=1;
            
        }

        public void printll(){
            Node node = head;
            while (node!=null) {
                System.out.print(node.value + " -> ");
                node = node.next;
            }
            System.out.print("END");
        }


        
        private class Node {
            
            private int value;
            private Node next;

            public Node(int value){
                this.value = value;
            }

            public Node(int value,Node next){
                this.value = value;
                this.next = next;
            }
            
        }
        
    } 

    public static void main(String[] args) {
        LL list = new LL();

        list.insertBegin(1);
        list.insertBegin(2);
        list.insertBegin(3);
        list.insertBegin(4);

        list.printll();

        list.insertLast(0);
        list.insertLast(-1);

        list.insertBegin(5);

        System.out.println("");
        list.printll();

        System.out.println("");
        list.insertIndex(8, 4);
        list.printll();

    }
}