import java.util.LinkedList;

public class Main{
    public static void main(String[] args) {
        LinkedList<Integer> Link = new LinkedList<Integer>();

        Link.add(1);
        Link.add(2);
        Link.add(5);
        Link.add(7);
        Link.add(3);
        Link.add(11);
        Link.add(10);

        System.out.println("Traversing");
        traverse(Link);

        System.out.println(" ");
        System.out.println(" ");
        System.out.println("Searching");
        search(Link,10);
        System.out.println();
        search(Link,6);
        
        System.out.println(" ");
        System.out.println("Insertion");
        System.out.print("before : ");
        
        traverse(Link);
        insertion(Link, 20, 2);

        System.out.println("");
        System.out.print("after : ");
        traverse(Link);

        System.out.println("");
        System.out.println("");
        System.out.println("Change In Value 10 : Index 0");
        updateElement(Link, 10, 0);
        traverse(Link);

        System.out.println("");
        System.out.println("");
        System.out.println("Delete Index 1");
        traverse(Link);
        System.out.println("");
        deletion(Link, 1);
        
        traverse(Link);
    
    }

    // Traversing
    static void traverse(LinkedList<Integer> linkedlist){
        
        for(int i=0;i<linkedlist.size();i++){
            System.out.print(linkedlist.get(i)+ " ");
        }

    }

    // Searching
    static void search(LinkedList<Integer> linkedlist,int key){
        boolean elementFound = false; 
        for(int i=0;i<linkedlist.size();i++){
            elementFound = true;
            if(linkedlist.get(i)==key){
                System.out.printf("found : %d at index %d",linkedlist.get(i),i);
            }else{
               elementFound = false;
            }
        }

        if(!elementFound){
             System.out.println("element not found");
        }
        
    }

    // Insertion
    static void insertion(LinkedList<Integer> linkedList,int value,int index){
        linkedList.add(index, value);
    }

    static void updateElement(LinkedList<Integer> linkedList,int value,int index){
        linkedList.set(index,value);
    }

    static void deletion(LinkedList<Integer> linkedList,int index){
        linkedList.remove(index);
    }


}