package Education_practice.DataStructures;

public class LinkedList {
    LinkedListItem root;

    LinkedListItem end;

    public LinkedList(){
        //to do
    }
    public LinkedList(int value){
        root = new LinkedListItem(value);
        end=root;
    }
    public void add(int element){
        LinkedListItem item= new LinkedListItem(element);
        end.next=item;
        end=item;
    }
    public void delete(){

    }
}
