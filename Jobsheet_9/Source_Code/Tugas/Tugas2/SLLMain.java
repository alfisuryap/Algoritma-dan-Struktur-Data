public class SLLMain {
    public static void main(String[] args) {
        SingleLinkedList singLL = new SingleLinkedList();
        
        System.out.println("------------------------------------------- LINKED LIST ---------------------------------------------");
        singLL.addFirst('a');
        singLL.print();
        singLL.addLast('e');
        singLL.print();
        singLL.insertAfter('a','b');
        singLL.print();
        singLL.insertAt(2, 'c');
        singLL.print();
        singLL.insertBefore('e', 'd');
        singLL.print();
        
        System.out.println("\nMaka Penambahan data sudah sesuai seperti berikut ini");
        singLL.print();
        System.out.println("\n------------------------------------------- LINKED LIST ---------------------------------------------");
    }
}