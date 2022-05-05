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
    public void addFirst(int input){
        node ndInput = new node(input, null);
        if(isEmpty()){ //jika linked list kosong
            head = ndInput; //head dan tail sama dengan node input
            tail = ndInput;
        }else{
            ndInput.next = head;
                head = ndInput;
        }
    }
    public void addLast(int input){
        node ndInput = new node(input, null);
        if(isEmpty()){
            head = ndInput; //head dan tail sama dengan node input
            tail = ndInput;
        }else{
            tail.next = ndInput;
            tail = ndInput;
        }
    }
    public void insertAfter(int key, int input){
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
    public void insertAt(int index, int input){
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
    public int getData(int index){
        node tmp = head;
        for (int i=0; i<index; i++){
            tmp =  tmp.next;
        }
        return tmp.data;
    }
    public int indexOf(int key){
        node tmp = head;
        int index = 0;
        while (tmp != null && tmp.data != key) {
            tmp = tmp.next;
            index++;
        }
        if (tmp == null){
            return -1;
        }else{
            return index;
        }
    }
    public void removeFirst(){
        if(isEmpty()){
            System.out.println("Linked List Masih Kosong");
        }else if (head == tail){
            head = tail = null;
        }else{
            head = head.next;
        }
    }
    public void removeLast() {
        if (isEmpty()){
            System.out.println("Linked List Masih kosong, tidak dapat dihapus!");
        }else if (head == tail){
            head = tail = null;
        }else{
            node temp = head;
            while (temp.next != tail){
                temp = temp.next;
            }
            temp.next = null;
            tail = temp;
        }
    }
    public void remove(int key){
        if(isEmpty()){
            System.out.println("Linked List Masih kosong, tidak dapat dihapus!");
        }else {
            node temp = head;
            while (temp != null){
                if((temp.data == key) && (temp == head)){
                    this.removeFirst();
                    break;
                }else if (temp.next.data == key){
                    temp.next = temp.next.next;
                    if(temp.next == null){
                        tail = temp;
                    }
                    break;
                }
                temp = temp.next;
            }
        }
    }
    public void removeAt(int index){
        if(index == 0){
            removeFirst();
        }else{
            node temp = head;
            for(int i=0; i < index-1; i++){
                temp = temp.next;
            }
            temp.next = temp.next.next;
            if (temp.next == null){
                tail = temp;
            }
        }
    }
    public void insertBefore(int key, int input){
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
