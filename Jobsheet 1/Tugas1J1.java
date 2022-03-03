public class Tugas1J1 {
    static String customerHariIni[][] = {
        {"Ani", "4"},
        {"Budi", "15"},
        {"Bina", "6"},
        {"Cita", "11"}
    };
    static int[] hitungTarif(){
        int beratPakaian[] = new int [customerHariIni.length];
        int tarif[] = new int [customerHariIni.length];
        for(int i = 0 ; i < customerHariIni.length; i++){
            tarif[i] = 0;
            beratPakaian[i] = Integer.parseInt(customerHariIni[i][1]);
            if (beratPakaian[i] > 10){
                tarif[i] = beratPakaian[i] * 4275;
            } else {
                tarif[i] = beratPakaian[i] * 4500;
            }
        }
        return tarif;
    }

    static int tarifTotal(int[] tarif){
        int total = 0;
        for(int i = 0; i < tarif.length; i++){
            total += tarif[i];
        }
        return total;
    }

    static void cetakData(){
        int tarif[] = hitungTarif();
        int total = tarifTotal(tarif);
        System.out.println("==========================================");
        System.out.println("Pendapatan Smile Laundry Hari ini");
        System.out.println("---------------------------------");
        System.out.println("| No |\tNama\t|\tTarif\t|");
        System.out.println("---------------------------------");
        for(int i = 0 ; i < tarif.length; i++){
            System.out.printf("| %-3d| %-9s| %-14d|", (i+1), customerHariIni[i][0], tarif[i]);
            System.out.println();
        }
        System.out.println("---------------------------------");
        System.out.println("Total pendapatan = " + total);
        System.out.println("==========================================");
    }

    public static void main(String[] args) {
        cetakData();
    }
}
