public class SingleLinkedList {
    node head; //posisi awal linked list
    node tail; //posisi akhir linked list
    
    public boolean isEmpty() {
        return head == null;
    }
    
    public void pr(){
        if(!isEmpty()){
            node tmp = head;
            System.out.println("Berhasil menambahkan "+ tmp.data);
        }
    }

    public void print(){
        if(!isEmpty()){
            node tmp = head;
            while(tmp != null){
                System.out.println(tmp.data);
                tmp = tmp.next;
            }
            System.out.println();
        }else{
            System.out.println("Linked List Kosong");
        }
    }

    public void peek(){
        if(!isEmpty()){
            node tmp = head;
            System.out.println("Elemen Teratas : "+tmp.data);
        }else{
        System.out.println("Stack Masih Kosong");
        }
    }
    
    public void push(String input){
        node ndInput = new node(input, null);
        if(isEmpty()){ //jika linked list kosong
            head = ndInput; //head dan tail sama dengan node input
            tail = ndInput;
        }else{
            ndInput.next = head;
            head = ndInput;
        }
    }
}