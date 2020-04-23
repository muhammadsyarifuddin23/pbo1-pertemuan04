public class main {
    public static void main(String[] args) {
//        int isi karung = 0;
//        int penuh = 300;
//
//        System.out.println("Isi karung Sekarang : " + isikarung + "L");
//        System.out.println("Isi karung Ketika Penuh : " + penuh + "L");
//
//        while(isikarung != penuh){
//            isikarung++;
//            System.out.println("Sedang mengisi karung..");
//            System.out.println("Isi karung Sekarang : " + isikarung + "L");
//        }
//
//        System.out.println("Finale: Isi karung Sekarang : " + isikarung + "L");

//        int isikarung = 0;
//        int penuh = 300;
//
//        System.out.println("Isi karung Sekarang : " + isikarung + "L");
//        System.out.println("Isi karung Ketika Penuh : " + penuh + "L");
//
//        do {
//            isikarung++;
//            System.out.println("Sedang mengisi karung..");
//            System.out.println("Isi karung Sekarang : " + isikarung + "L");
//        }while(isikarung != penuh);
//
//        System.out.println("Finale: Isi karung Sekarang : " + isikarung + "L");


        int isikarung = 0;
        int penuh = 300;

        System.out.println("Isi karung Sekarang : " + isikarung + "L");
        System.out.println("Isi karung Ketika Penuh : " + penuh + "L");

        for(isikarung = 0 ; isikarung <= penuh ; isikarung++){
            System.out.println("Sedang mengisi karung..");
            System.out.println("Isi karung Sekarang : " + isikarung + "L");
        }

        System.out.println("Finale: Isi karung Sekarang : " + isikarung + "L");

        int nilaiArr[] = {30,45,53,7,12,58,79,87,79};
        System.out.println(nilaiArr.length);
        System.out.println(nilaiArr[0]);
        System.out.println(nilaiArr[7]);

        String mataKuliah[];
        mataKuliah = new String[10];

        mataKuliah[0] = "Pemrograman Berbasis Objek 1";
        mataKuliah[1] = "Visual 2";
        mataKuliah[2] = "Rekayasa Perangkat Lunak";
        mataKuliah[3] = "Organisasi Komputer";
        mataKuliah[4] = "Pemrograman Web 2";

        String keterangan[] = {"Harian","Tugas","UTS","UAS"};

        double bobot[] = {0.1, 0.2, 0.3, 0.4};

        double[][] nilaiMahasiswa = new double[5][30];

        nilaiMahasiswa[0][0] = 80;
        nilaiMahasiswa[1][0] = 90;
        nilaiMahasiswa[2][0] = 75;
        nilaiMahasiswa[3][0] = 70;

        nilaiMahasiswa[4][0] = nilaiMahasiswa[0][0] * bobot [0] +
                nilaiMahasiswa[1][0] * bobot [1] +
                nilaiMahasiswa[2][0] * bobot [2] +
                nilaiMahasiswa[3][0] * bobot [3];

        System.out.println("Nilai si mahasiswa 1 :"+nilaiMahasiswa[4][0]);

        nilaiMahasiswa[0][1] = 80;
        nilaiMahasiswa[1][1] = 90;
        nilaiMahasiswa[2][1] = 75;
        nilaiMahasiswa[3][1] = 70;

        nilaiMahasiswa[4][1] = 0;
        for (int i=0 ; i<=3 ; i++) {
            nilaiMahasiswa[4][1] += nilaiMahasiswa[i][1] * bobot[i];
        }

        System.out.println("Nilai si mahasiswa 2 :"+nilaiMahasiswa[4][1]);

        double jumlahNilaiAkhir = 0;
        for (int i=0 ; i<=3 ; i++) {
            jumlahNilaiAkhir += nilaiMahasiswa[4][i];
        }
        System.out.println(jumlahNilaiAkhir);

    }
}
