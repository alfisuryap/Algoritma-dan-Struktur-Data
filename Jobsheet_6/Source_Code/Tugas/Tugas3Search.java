package Jobsheet_6.Source_Code.Tugas;

public class Tugas3Search {
    int idx;
    Tugas3 data[];

    Tugas3Search(int x) {
        this.data = new Tugas3[x];

    }
    void tambah(Tugas3 t) {
         if (idx < data.length) {
             data[idx] = t;
             idx++;
        }
        else {
            System.out.println("Data sudah penuh !!");
        }
    }
    void tampil() {
        for (Tugas3 m : data) {
        m.tampil();
        }
    }
    void selectionSort() {
         for (int i = 0; i < data.length - 1; i++) {
            int idxMin = i;
        for (int j = i + 1; j < data.length; j++) {
            if (data[j].nilai > data[idxMin].nilai) {
                idxMin = j;
                }
        }
            Tugas3 tmp = data[idxMin];
                data[idxMin] = data[i];
                data[i] = tmp;
        }
    }
    public void TampilIndex(int y, int in) {
        if (in != -1) {
            System.out.println("Data " + y + " ditemukan pada index ke-" + in);
         } else {
            System.out.println("Data " + y + "tidak ditemukan");
        }
    }
    public void TampilData(int y, int in) {
         if (in != -1) {
            System.out.println("Nilai : " + data[in].nilai);
        } else {
            System.out.println("Data " + y + "tidak ditemukan");
        }
    }
    public int BinarySearch(int cari, int kiri, int kanan) {
        int mid;
        if (kanan >= kiri) {
            mid = (kiri + kanan) / 2;
                if (cari == data[mid].nilai) {
                    if (cari == data[mid].nilai) {
                       TampilIndex(cari, mid);
                       TampilData(cari, mid);
                        return mid;
                    }
                    if (cari == data[kiri].nilai || cari == data[kanan].nilai) {
                        if (cari == data[kiri].nilai) {
                            TampilIndex(cari, kiri);
                            TampilData(cari, kiri);
                            System.out.println("Kiri basecase");
                        }
                        if (cari == data[kanan].nilai) {
                            TampilIndex(cari, data[kanan].nilai);
                            TampilData(cari, kanan);
                            System.out.println("Kanan basecase");
                        }
                    }

                } else if (data[mid].nilai < cari) {
                    if (cari == data[kiri].nilai || cari == data[kanan].nilai) {
                        if (cari == data[kiri].nilai) {
                            TampilIndex(cari, kiri);
                            TampilData(cari, kiri);
                            return BinarySearch(cari, kiri, mid - 1);
                        }
                        else {
                            TampilIndex(cari, kanan);
                            TampilData(cari, kanan);
                            return BinarySearch(cari, kiri, mid - 1);
                        }
                    }
                    return BinarySearch(cari, kiri, mid - 1);
                }
                else {
                    if (cari == data[kiri].nilai || cari == data[kanan].nilai) {
                        if (cari == data[kiri].nilai) {
                            TampilIndex(cari, kiri);
                            TampilData(cari, kiri);
                            return BinarySearch(cari, mid + 1, kanan);
                        }else {
                            TampilIndex(cari, kanan);
                            TampilData(cari, kanan);
                            return BinarySearch(cari, mid + 1, kanan);
                        }
                }
                    return BinarySearch(cari, mid + 1, kanan);
            }
        }
        return -1;
    }
}