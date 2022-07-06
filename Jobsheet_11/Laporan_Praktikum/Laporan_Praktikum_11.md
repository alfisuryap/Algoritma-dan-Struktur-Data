Nama    : Alfi Surya Pratama

Kelas   : TI-1F

NIM     : 2141720075

# **PRAKTIKUM ALGORITMA DAN STRUKTUR DATA**
## **JOBSHEET 11**
## **TREE**

### **11.2 Implementasi Binary Search Tree menggunakan Linked List**

### *11.2.1 Langkah-langkah Percobaan*

*Class "Node"*

~~~java
public class Node {
    int data;
    Node left;
    Node right;

    public Node() {

    }

    public Node(int data) {
        this.left = null;
        this.data = data;
        this.right = null;
    }
}
~~~

*Class "BinaryTree"*

~~~java
public class BinaryTree {
    Node root;

    public BinaryTree() {
        root = null;
    }

    boolean isEmpty() {
        return root == null;
    }

    void add(int data) {
        if (isEmpty()) { //tree is empty
            root = new Node(data);
        } else {
            Node current = root;
            while (true) {
                if (data < current.data) {
                    if (current.left != null) {
                        current = current.left;
                    } else {
                        current.left = new Node(data);
                        break;
                    }
                } else if (data > current.data) {
                    if (current.right != null) {
                        current = current.right;
                    } else {
                        current.right = new Node(data);
                        break;
                    }
                } else { //data is already exist
                    break;
                }
            }
        }
    }

    boolean find(int data) {
        boolean hasil = false;
        Node current = root;
        while (current != null) {
            if (current.data == data) {
                hasil = true;
                break;
            } else if (data < current.data) {
                current = current.left;
            } else {
                current = current.right;
            }
        }
        return hasil;
    }

    void traversePreOrder(Node node) {
        if (node != null) {
            System.out.print(" " + node.data);
            traversePreOrder(node.left);
            traversePreOrder(node.right);
        }
    }

    void traversePostOrder(Node node) {
        if (node != null) {
            traversePostOrder(node.left);
            traversePostOrder(node.right);
            System.out.print(" " + node.data);
        }
    }

    void traverseInOrder(Node node) {
        if (node != null) {
            traversePreOrder(node.left);
            System.out.print(" " + node.data);
            traversePreOrder(node.right);
        }
    }

    Node getSuccessor(Node del) {
        Node successor = del.right;
        Node successorParent = del;
        while (successor.left != null) {
            successorParent = successor;
            successor = successor.left;
        }
        if (successor != del.right) {
            successorParent.left = successor.right;
            successor.right = del.right;
        }
        return successor;
    }

    void delete(int data) {
        if (isEmpty()) {
            System.out.println("Tree is empty!");
            return;
        }
        //find node (current) that will be delected
        Node parent = root;
        Node current = root;
        boolean isLeftChild = false;
        while (current != null) {
            if (current.data == data) {
                break;
            } else if (data < current.data) {
                parent = current;
                current = current.left;
                isLeftChild = true;
            } else if (data > current.data) {
                parent = current;
                current = current.right;
                isLeftChild = false;
            }
        }
        //deletion
        if (current == null) {
            System.out.println("Couldn't find data");
            return;
        } else {
            //if there is no child, simply delete it
            if (current.left == null && current.right == null) {
                if (current == root) {
                    root = null;
                } else {
                    if (isLeftChild) {
                        parent.left = null;
                    } else {
                        parent.right = null;
                    }
                }
            } else if (current.left == null) {//if there is 1 child (right)
                if (current == root){
                    root = current.right;
                } else {
                    if (isLeftChild) {
                        parent.left = current.right;
                    } else {
                        parent.right = current.right;
                    }
                }
            } else if (current.right == null) {//if there is 1 child (left)
                if (current == root){
                    root = current.left;
                } else {
                    if (isLeftChild) {
                        parent.left = current.left;
                    } else {
                        parent.right = current.left;
                    }
                }
            } else {
                Node successor = getSuccessor(current);
                if (current == root){
                    root = successor;
                } else {
                    if (isLeftChild) {
                        parent.left = successor;
                    } else {
                        parent.right = successor;
                    }
                }
            }
        }
    }
}
~~~

*Main Class "BinaryTreeMain"*

~~~java
public class BinaryTreeMain {
    public static void main(String[] args) {
        BinaryTree bt = new BinaryTree();

        bt.add(6);
        bt.add(4);
        bt.add(8);
        bt.add(3);
        bt.add(5);
        bt.add(7);
        bt.add(9);
        bt.add(10);
        bt.add(15);

        bt.traversePreOrder(bt.root);
        System.out.println("");
        bt.traverseInOrder(bt.root);
        System.out.println("");
        bt.traversePostOrder(bt.root);
        System.out.println("");
        System.out.println("Find " + bt.find(5));
        bt.delete(8);
        bt.traversePreOrder(bt.root);
        System.out.println("");
    }
}
~~~

### *11.2.2 Verifikasi Hasil Percobaan*

### *11.2.3 Pertanyaan*

1. Mengapa dalam binary search tree proses pencarian data bisa lebih efektif dilakukan dibanding binary tree biasa?

2. Untuk apakah di class Node, kegunaan dari atribut left dan right?

3. a. Untuk apakah kegunaan dari atribut root di dalam class BinaryTree?

    b. Ketika objek tree pertama kali dibuat, apakah nilai dari root?

4. Ketika tree masih kosong, dan akan ditambahkan sebuah node baru, proses apa yang akan terjadi?

5. Perhatikan method add(), di dalamnya terdapat baris program seperti di bawah ini. Jelaskan secara detil untuk apa baris program tersebut?

    ~~~java
    if(data < current.data){
        if(current.left != null){
            current = current.left;
        }else{
            current.left = new Node(data);
            break;
        }
    }
    ~~~

### **11.3 Implementasi binary tree dengan array**

### *11.3.1 Langkah-langkah Percobaan*

*Class "BinaryTreeArray"*

~~~java
public class BinaaryTreeArray {
    int[] data;
    int idxLast;

    public BinaaryTreeArray() {
        data = new int [10];
    }

    void populateData(int data[], int idxLast) {
        this.data = data;
        this.idxLast = idxLast;
    }

    void traverseInOrder(int idxStart) {
        if (idxStart <= idxLast) {
            traverseInOrder(2 * idxStart + 1);
            System.out.print(data[idxStart] + " ");
            traverseInOrder(2 * idxStart + 2);
        }
    }
}
~~~

*Main Class "BinaryTreeArrayMain"*

~~~java
public class BinaryTreeArrayMain {
    public static void main(String[] args) {
        BinaaryTreeArray bta = new BinaaryTreeArray();
        int[] data = {6,4,8,3,5,7,9,0,0,0};
        int idxLast = 6;
        bta.populateData(data, idxLast);
        bta.traverseInOrder(0);
    }
}
~~~

### *11.3.2 Verifikasi Hasil Percobaan*

<img src = "11.3.1.png">

### *11.3.3 Pertanyaan*

1. Apakah kegunaan dari atribut data dan idxLast yang ada di class BinaryTreeArray?

    - *Atribut data berfungsi untuk menyimpan data array*
    
    - *idxLast berfungsi untuk menyimpan batas index*

2. Apakah kegunaan dari method populateData()?

    *Method populatDate() berfungsi untuk menunjukkan data pada idxLast*

3. Apakah kegunaan dari method traverseInOrder()?

    *Method traverseInOrder() berfungsi untuk menelusuri tree dengan metode in order dengan prinsip (left visit right)*

4. Jika suatu node binary tree disimpan dalam array indeks 2, maka di indeks berapakah posisi left child dan rigth child masing-masing?

    *Jika array dimulai dari 0 maka didapati seperti di bawah ini :*

    - *Left child = indeks ke-5*
    
    - *Right child = indeks ke-6*

5. Apa kegunaan statement int idxLast = 6 pada praktikum 2 percobaan nomor 4?

    *Berfungsi untuk menunjukkan idxLast atau batas indeks arraynya adalah 6*

### **11.4 Tugas Praktikum**

1. Buat method di dalam class BinaryTree yang akan menambahkan node dengan cara rekursif.

2. Buat method di dalam class BinaryTree untuk menampilkan nilai paling kecil dan yang paling besar yang ada di dalam tree.

3. Buat method di dalam class BinaryTree untuk menampilkan data yang ada di leaf.

4. Buat method di dalam class BinaryTree untuk menampilkan berapa jumlah leaf yang ada di dalam tree.

5. Modifikasi class BinaryTreeArray, dan tambahkan :

    • method add(int data) untuk memasukan data ke dalam tree

    • method traversePreOrder() dan traversePostOrder()