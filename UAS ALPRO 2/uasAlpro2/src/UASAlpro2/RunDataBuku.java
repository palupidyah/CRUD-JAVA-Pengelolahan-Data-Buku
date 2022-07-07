package UASAlpro2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class RunDataBuku {
    
    private static boolean found;

    public static void main(String[] args) {

        int aksi;
        try (Scanner scan = new Scanner(System.in)) {
            try (Scanner scan2 = new Scanner(System.in)) {
                List<DataBuku> book = new ArrayList<DataBuku>();

                do{
                    
                    System.out.println("_________________________________________________________");
                    System.out.println("|\t\t\t\t\t\t\t|");
                    System.out.println("|\t\t   Selamat Datang di\t\t\t|\n|\t\tPerpustakaan Kelompok 1 ^o^\t\t|");
                    System.out.println("|\t\t\t\t\t\t\t|\n|\t\t \tMENU:    \t\t\t|");
                    System.out.println("|\t\t1. Tambah Data Buku\t\t\t|");
                    System.out.println("|\t\t2. Tampilkan Data Buku\t\t\t|");
                    System.out.println("|\t\t3. Cari Data Buku\t\t\t|");
                    System.out.println("|\t\t4. Hapus Data Buku\t\t\t|");
                    System.out.println("|\t\t5. Update Data Buku\t\t\t|");
                    System.out.println("|\t\t6. Keluar\t\t\t\t|");
                    System.out.println("_________________________________________________________");


                    System.out.print("\nPilihan Anda\t: ");
                    aksi = scan.nextInt();

                        switch(aksi){
                            case 1:
                                System.out.println("\n");
                                System.out.println("=========================================================");
                                System.out.println("|\t\tMenu Menambah Data Buku\t\t\t|");
                                System.out.println("=========================================================");

                                System.out.print("Masukkan ID Buku\t: ");
                                int IdBuku = scan.nextInt();
                                System.out.print("Masukkan Judul Buku\t: ");
                                String judul = scan2.nextLine();
                                System.out.print("Masukkan Nama Penulis\t: ");
                                String namaPenulis = scan2.nextLine();
                                System.out.print("Masukkan Penerbit Buku\t: ");
                                String penerbit = scan2.nextLine();
                                System.out.print("Masukkan Tahun Terbit\t: ");
                                int tahun = scan.nextInt();

                                book.add(new DataBuku(IdBuku, judul, namaPenulis, penerbit, tahun));
                                break;
                            case 2:
                                System.out.println("\n");
                                System.out.println("=========================================================");
                                System.out.println("|\t\tMenampilkan Seluruh Data Buku\t\t|");
                                System.out.println("=========================================================");

                                Iterator<DataBuku> i = book.iterator();
                                
                                while(i.hasNext()){
                                    DataBuku d = i.next();
                                    System.out.println(d);
                                }
                            case 3:
                                found = false;
                                System.out.println("\n");
                                System.out.println("=========================================================");
                                System.out.println("|\t\tMenu Mencari Data Buku\t\t\t|");
                                System.out.println("=========================================================");


                                System.out.print("\nMasukkan ID Buku untuk mencari\t: ");
                                int idBuku = scan.nextInt();
                                i = book.iterator();
                                while(i.hasNext()){
                                    DataBuku e = i.next();
                                    if(e.getIDBuku() == idBuku){
                                        System.out.println(e);
                                        found = true;
                                    }
                                
                                }if(found){
                                    System.out.println("---------------------------------------------------------");
                                    System.out.println("\t\t!!!Data ditemukan!!!");
                                    System.out.println("---------------------------------------------------------");
                                    System.out.println("\n");
                                } else{
                                    System.out.println("---------------------------------------------------------");
                                    System.out.println("\t\t!Data tidak ditemukan!\t\t");
                                    System.out.println("---------------------------------------------------------");   
                                }
                                break;                                
                            case 4:
                                found = false;
                                System.out.println("\n");
                                System.out.println("=========================================================");
                                System.out.println("|\t\tMenu Menghapus Data Buku\t\t|");
                                System.out.println("=========================================================");

                                System.out.print("Masukkan ID Buku untuk menghapus\t: ");
                                idBuku = scan.nextInt();
                                i = book.iterator();
                                while(i.hasNext()){
                                    DataBuku e = i.next();
                                    if(e.getIDBuku() == idBuku){
                                        i.remove();
                                        found = true;
                                    }
                                }
                                if(!found){
                                    System.out.println("---------------------------------------------------------");
                                    System.out.println("\t\t!!!DATA TIDAK DITEMUKAN!!!\t");
                                    System.out.println("---------------------------------------------------------");
                                }else{
                                    System.out.println("---------------------------------------------------------");
                                    System.out.println("\t\tData berhasil dihapus!\t\t");
                                    System.out.println("---------------------------------------------------------");
                                }break;
                            case 5:
                                found = false;
                                System.out.println("\n");
                                System.out.println("=========================================================");
                                System.out.println("|\t\tMenu Mengupdate Data Buku\t\t|");
                                System.out.println("=========================================================");

                                System.out.print("Masukkan ID Buku untuk mencari\t: ");
                                idBuku = scan.nextInt();
                                System.out.println("---------------------------------------------------------");
                                ListIterator<DataBuku>li = book.listIterator();
                                while(li.hasNext()){
                                    DataBuku e = li.next();
                                    if(e.getIDBuku() == idBuku){
                                        System.out.println("\t\tUpdate Data Buku");
                                        System.out.println("---------------------------------------------------------");
                                        System.out.print("Masukkan Judul Buku\t: ");
                                        judul = scan2.nextLine();
                                        System.out.print("Masukkan Nama Penulis\t: ");
                                        namaPenulis = scan2.nextLine();
                                        System.out.print("Masukkan Nama Penerbit\t: ");
                                        penerbit = scan2.nextLine();
                                        System.out.print("Masukkan Tahun Terbit\t: ");
                                        tahun = scan.nextInt();
                                        System.out.println("---------------------------------------------------------");
                                        li.set(new DataBuku(idBuku, judul, namaPenulis, penerbit, tahun));
                                        found = true;
                                    }
                                }
                                        if(!found){
                                            System.out.println("---------------------------------------------------------");
                                            System.out.println("\t\t\tData tidak ditemukan");
                                            System.out.println("---------------------------------------------------------");
                                            System.out.println("\n");
                                        }else{
                                            System.out.println("---------------------------------------------------------");
                                            System.out.println("\t\tData telah berhasil diganti!");
                                            System.out.println("---------------------------------------------------------");
                                        }
                                            System.out.println("---------------------------------------------------------");
                                            break;
                            case 6:
                                System.exit(6);
                            default:
                                System.out.println("---------------------------------------------------------");
                                System.err.println("\t\t\t!!!EROR!!!\n\t\tMasukkan input dengan benar(1-6)\n\t\tSilahkan coba lagi ^_^");
                                System.out.println("---------------------------------------------------------");
                        }

                } while(aksi !=0);
            }
        }
    }

}
