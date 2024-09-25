package Education_practice.DataStructures.BunaryTree;

public class Tree {
    Node root;

    //поиск узла по дереву
    public int find(int index){
        Node current=root;
        while (current.index!=index){
            if(current.index<index){
                current=current.leftChild;
            }else {
                current= current.rightChild;
            }
            if(current==null){
                return 0;
            }
        }
        return 1;
    }

    //вставка нового узла, отличного от уже существующих
    public void insert(int value){
        Node newNode = new Node(value);
        Node parent;
        Node current=root;
        while(true){
            if(current==null){
                root=newNode;
                return;
            }
            if(current.index==value){
                System.out.println("Элемент уже добавлен");
                return;
            }

            parent=current;
            if(current.index>value){
                current=current.leftChild;
                if(current==null){
                    parent.leftChild=newNode;
                    return;
                }
            }

            else{
                current=current.rightChild;
                if(current==null){
                    parent.rightChild=newNode;
                    return;
                }
            }
        }
    }

    // удаление узла из дерева
    public void delete(int value){
        Node current = root;
        Node parent=root;
        while(current.index!=value){
            parent=current;
            if(current.index>value){
                current=current.rightChild;
            }
            else{
                current=current.leftChild;
            }
        }
        if(current.rightChild==null && current.leftChild==null){
            if(parent.rightChild==current){
                parent.rightChild=null;
            }else{
                parent.leftChild=null;
            }
        }


    }
    // получение корня дерева
    public Node getRoot(){
        return root;
    }
// проход по дереву слева направо
    public void symmetricalGoThrough(Node tempNode){
        if (tempNode!=null) {
            symmetricalGoThrough(tempNode.leftChild);
            System.out.println("Node = "+tempNode.index);
            symmetricalGoThrough(tempNode.rightChild);
        }

    }
    //проход по дереву в прямом порядке
    public void inorderGoThrough(Node tempNode){
        if(tempNode!=null){
            System.out.println("Node = "+tempNode.index);
            inorderGoThrough(tempNode.leftChild);
            inorderGoThrough(tempNode.rightChild);
        }
    }
    public void reversedOrderGoThrough(Node tempNode){
        if(tempNode!=null){
            reversedOrderGoThrough(tempNode.leftChild);
            reversedOrderGoThrough(tempNode.rightChild);
            System.out.println("Node="+ tempNode.index);
        }
    }

    public int getMin(){
        Node current=root;
        while(current.leftChild!=null) current=current.leftChild;
        return current.index;
    }

    public int getMax(){
        Node current=root;
        while(current.rightChild!=null) current=current.rightChild;
        return current.index;
    }


}
