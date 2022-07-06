import java.util.Scanner;

public class GraphMain {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan Vertex\t\t\t: ");
        String[] vertex = new String[sc.nextInt()];
        sc.nextLine();

        for (int i = 0; i < vertex.length; i++) {
            System.out.print("Masukkan data vertex ke-" + i + "\t: ");
            vertex[i] = sc.nextLine();
        }

        Graph <String> gph = new Graph <String>(vertex);

        System.out.print("Masukkan Edge\t\t\t: ");
        int edge = sc.nextInt();

        int menu;
        do {
            System.out.println("Pilih menu dibawah ini");
            System.out.println("1. Directed\n2. Undirected");
            System.out.print("Masukkan Menu : ");
            menu = sc.nextInt();

            System.out.println("Masukkan Edge: <from> <to>");
            if(menu == 1) { 
                for (int i = 0; i < edge; i++) {
                    gph.graphType(sc.nextInt(), sc.nextInt());
                }
                gph.printGraph();

            } else if (menu == 2) { 
                for (int i = 0; i < edge; i++) {;
                    gph.addEdge(sc.nextInt(), sc.nextInt());
                }
                gph.printGraph();
            }
        } while (menu!=1 && menu!=2);
        sc.close();
    }
}
