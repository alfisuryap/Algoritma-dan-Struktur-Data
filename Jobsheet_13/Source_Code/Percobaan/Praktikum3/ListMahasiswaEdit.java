import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Collections;
import java.util.Comparator;

public class ListMahasiswaEdit {
    List<Mahasiswa> mahasiswas = new ArrayList<>();

    public void tambah(Mahasiswa... mahasiswa) {
        mahasiswas.addAll(Arrays.asList(mahasiswa));
    }

    public void hapus(int index) {
        mahasiswas.remove(index);
    }

    public void update(int index, Mahasiswa mhs) {
        mahasiswas.set(index, mhs);
    }

    public void tampil() {
        mahasiswas.stream().forEach(mhs -> {
            System.out.println("" + mhs.toString());
        });
    }

    int binarySearch(String nim){
        return Collections.binarySearch(mahasiswas, new Mahasiswa(nim, null, null), new Comparator<mahasiswa>(){
            @Override
            public int compare(mahasiswa o1, mahasiswa o2){
                return o1.nim.compareTo(o2.nim);
            }
        });
    }

    public static void main(String[] args) {
        ListMahasiswaEdit lm = new ListMahasiswaEdit();
        Mahasiswa m = new Mahasiswa("201234", "Noureen", "021xx1");
        Mahasiswa m1 = new Mahasiswa("201235", "Akhleena", "021xx2");
        Mahasiswa m2 = new Mahasiswa("201236", "Shannum", "021xx3");
        lm.tambah(m, m1, m2);
        lm.tampil();
        lm.update(lm.linearSearch("201235"), new Mahasiswa("201235",
                "Akhleena Lela", "021xx2"));
        System.out.println("");
        lm.tampil();
    }
}