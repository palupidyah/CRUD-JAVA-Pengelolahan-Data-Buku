package UASAlpro2;



public class DataBuku {
    
    int idBuku, tahun;
    String judul, namaPenulis, penerbit, terakhir;

    public DataBuku(int idBuku, String judulbuku, String namapenulis, String penerbit, int tahunterbit){
        this.idBuku = idBuku;
        this.judul = judulbuku;
        this.namaPenulis = namapenulis;
        this.penerbit = penerbit;
        this.tahun = tahunterbit;
        this.terakhir = "";
    }
    public DataBuku(String judul2, String namaPenulis2, int tahun2) {
    }

    public int getIDBuku(){
        return idBuku;
    }
    public String getJudulBuku(){
        return judul;
    }
    public String getNamaPenulis(){
        return namaPenulis;
    }
    public String getPenerbit(){
        return penerbit;
    }
    public int getTahunTerbit(){
        return tahun;
    }

    @Override
    public String toString(){
        System.out.println("---------------------------------------------------------");
        System.out.println("ID Buku\t\t: "+idBuku);
        System.out.println("Judul Buku\t: "+judul);
        System.out.println("Nama Penulis\t: "+namaPenulis);
        System.out.println("Penerbit\t: "+penerbit);
        System.out.println("Tahun Terbit\t: "+tahun);
        return this.terakhir;  
    }

}
