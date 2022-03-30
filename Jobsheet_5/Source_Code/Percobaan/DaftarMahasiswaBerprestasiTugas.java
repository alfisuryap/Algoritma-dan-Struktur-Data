package Jobsheet_5.Source_Code.Percobaan;

public class DaftarMahasiswaBerprestasiTugas {
    Mahasiswa listMhs[] = new Mahasiswa[5];
    int idx;

    //setelah ini tuliskan method tambah()
    void tambah(Mahasiswa m){
        if(idx < listMhs.length){
            listMhs[idx] = m;
            idx++;
        }else{
            System.out.println("Data sudah penuh!!");
        }
    }

    //setelah ini tuliskan method tampil()
    void tampil(){
        for(Mahasiswa m : listMhs){
            m.tampil();
            System.out.println("------------------------------");
        }
    }

    //setelah ini tuliskan method insertionSort()
    void insertionSort(boolean asc){
        for(int i = 1; i < listMhs.length; i++){
            Mahasiswa temp = listMhs[i];
            int j = i;
            
            if(asc){
                while(j > 0 && listMhs[j - 1].ipk > temp.ipk){
                    listMhs[j] = listMhs[j - 1];
                    j--;
                }
            }else{
                while(j > 0 && listMhs[j - 1].ipk < temp.ipk){
                    listMhs[j] = listMhs[j - 1];
                    j--;
                }
            }
            listMhs[j] = temp;
        }
    }
}
