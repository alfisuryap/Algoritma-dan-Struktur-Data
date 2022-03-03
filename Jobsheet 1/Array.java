public class Array {
    public static void main(String[] args) {
        String cabangToko[] = {
            "RoyalGarden1", 
            "RoyalGarden2",
            "RoyalGarden3",
            "RoyalGarden4"
        };
        String namaBunga[] = {
            "Aglonema", "Keladi", "Alocasia", "Mawar"
        };
        int stock[][] = {
           {9,3,15,2},
           {6,11,9,12},
           {2,10,10,5},
           {5,7,12,9}
       };

       //menghitung banyak stock setiap cabang
       int totalStock[] = new int[cabangToko.length];
       for(int i = 0; i < stock.length; i++){
           totalStock[i] = 0;
           for(int j = 0; j < stock[0].length; j++){
               totalStock[i] += stock[i][j];
           }
       }

       //mencetak tabel
       System.out.println("============================================================================================");
       System.out.println("\t\t\t  List Stock Bunga dari Setiap Cabang Toko");
       System.out.println("============================================================================================");
       System.out.print("|\t\t");
       for(int i = 0; i < namaBunga.length; i++){
        if(i == namaBunga.length - 1){
            System.out.printf("| %-12s |", namaBunga[i]);
            break;
        }
           System.out.printf("| %-12s ", namaBunga[i]);
        }
        System.out.print("\t Total     |");
        System.out.println();
        for(int j = 0; j < cabangToko.length; j++){
            System.out.printf("| %-13s |", cabangToko[j]);
            for(int k = 0; k < stock[0].length; k++){
                System.out.printf(" %-12d |", stock[j][k]);
            }
            System.out.printf(" %-12d |", totalStock[j]);
            System.out.println();
       }
       
       //menghitung pendapatan
       int pendapatan[][] = new int[stock.length][stock[0].length];
       int pendapatanTotal[] = new int[stock.length];
       for(int i = 0; i < stock.length; i++){
           pendapatanTotal[i] = 0;
           for(int j = 0; j < stock[0].length; j++){
               if(j == 0){
                   pendapatan[i][j] = stock[i][j] * 75000;
               } else if(j == 1){
                   pendapatan[i][j] = stock[i][j] * 50000;
               } else if (j == 2){
                   pendapatan[i][j] = stock[i][j] * 60000;
               } else {
                   pendapatan[i][j] = stock[i][j] * 10000;
               }
               pendapatanTotal[i] += pendapatan[i][j];
           }
       }
       System.out.println("\nPendapatan Cabang RoyalGarden1 = " + pendapatanTotal[0]);
    }
}
