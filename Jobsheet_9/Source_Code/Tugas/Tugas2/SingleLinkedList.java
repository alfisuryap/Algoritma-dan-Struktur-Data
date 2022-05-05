public class SingleLinkedList {
    node head; //posisi awal linked list
    node tail; //posisi akhir linked list
    
    public boolean isEmpty() {
        return head == null;
    }

    public void print(){
        if(!isEmpty()){
            node tmp = head;
            System.out.print("Isi Linked List\t\t\t: ");
            while(tmp != null){
                System.out.print(tmp.data +"\t\t");
                tmp = tmp.next;
            }
            System.out.println("");
        }else{
            System.out.println("Linked List Kosong");
        }
    }

    public void addFirst(char input){
        node ndInput = new node(input, null);
        if(isEmpty()){ //jika linked list kosong
            head = ndInput; //head dan tail sama dengan node input
            tail = ndInput;
        }else{
            ndInput.next = head;
                head = ndInput;
        }
    }

    public void addLast(char input){
        node ndInput = new node(input, null);
        if(isEmpty()){
            head = ndInput; //head dan tail sama dengan node input
            tail = ndInput;
        }else{
            tail.next = ndInput;
            tail = ndInput;
        }
    }

    public void insertAfter(char key, char input){
        node ndInput = new node(input, null);
        node temp = head;
        do {
            if (temp.data == key) {
                ndInput.next = temp.next;
                temp.next = ndInput;
                if(ndInput.next == null) tail = ndInput;
                break;
            }
            temp = temp.next;
        }while (temp != null);
    }

    public void insertAt(int index, char input){
        if (index < 0){
            System.out.println("Indeks salah");
        }else if (index == 0){
            addFirst(input);
        }else {
            node temp = head;
            for(int i=0; i<index-1; i++){
                temp = temp.next;
            }
            temp.next = new node(input, temp.next);
            if(temp.next.next == null) tail=temp.next;
        }
    }
    
    public void insertBefore(char key, char input){
        node ndInput = new node(input, null);
        node temp = head;
        node prev = null;
        
        do{
            if(head.data == key){
                addFirst(input);
                break;
            }else if (temp.data == key){
                ndInput.next = temp;
                prev.next = ndInput;
                if(temp.next == null){
                    tail = ndInput;
                    break;
                }
            }
            prev = temp;
            temp = temp.next;
        }while (temp != null);
    }
}