import java.util.Scanner;
import java.util.Stack;
import java.util.Comparator;

public class FilmMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner sd = new Scanner(System.in);
        Scanner sa = new Scanner(System.in);
        
        Stack <Film> films = new Stack();
        
        char pilih;
        int menu = 0;
        do{
            System.out.println("======================================");
            System.out.println(" Data Film Layar Lebar Sepanjang Masa ");
            System.out.println("======================================");
            System.out.println("1. Input Judul Film                   ");
            System.out.println("2. Hapus Data Film Teratas            ");
            System.out.println("3. Cek Judul Film Teratas             ");
            System.out.println("4. Info semua judul Film              ");
            System.out.println("5. Keluar                             ");
            System.out.println("======================================");
            System.out.println("Pilih: ");
            menu = sd.nextInt();
            switch(menu){
                case 1:{
                    do { 
                    System.out.println("=====================================");
                    System.out.println("ID Film         : ");
                    String id = sc.nextLine();
                    System.out.println("Judul Film      : ");
                    String judul = sc.nextLine();
                    System.out.println("Tahun Tayang    : ");
                    String tahun = sc.nextLine();
                    System.out.println("Director        : ");
                    String director = sc.nextLine();
                    Film data = new Film(id, judul, tahun, director);
                    films.push(data);
                    System.out.println("Mau tambah data atau tidak Y/N");
                    pilih = sa.next().charAt(0);
                    System.out.println("");
                    
                    } while (pilih == 'y' || pilih == 'Y');
                     
                }
                break;

                case 2 :{
                    System.out.println("=====================================");
                    System.out.println("       Hapus Data Film Teratas       ");
                    System.out.println("=====================================");
                    System.out.println(films.pop());
                    System.out.println("");
                }
                break;

                case 3:{
                    System.out.println("=====================================");
                    System.out.println("           Judul Film Teratas        ");
                    System.out.println("=====================================");
                    System.out.println(films.peek());
                    System.out.println("");
                }
                break;

                case 4:{
                    System.out.println("=====================================");
                    System.out.println("        Info Semua Judul Film        ");
                    System.out.println("=====================================");
                    for(int i = 0; i < films.size(); i++){
                        System.out.println(films.get(i));
                    }
                    System.out.println("");
                }
                break;
                
                case 5: {
                    System.out.println("");
                    System.out.println("+            Terima Kasih             +");
                }
                break;
            }
        }while (menu < 5 && menu > 0);
    }
}