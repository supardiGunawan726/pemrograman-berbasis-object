class Senjata {
    private String nama;
    private int jumlahPeluru;

    Senjata(String nama, int jumlahPeluru){
        this.nama = nama;
        this.jumlahPeluru = jumlahPeluru;
    }

    void infoSenjata(){
        System.out.println("\n===========");
        System.out.println("Nama senjata: " + this.nama);
        System.out.println("Jumlah peluru: " + this.jumlahPeluru);
    }

    void tembak(){}
}

class Shotgun extends Senjata {
    Shotgun(String nama, int jumlahPeluru) {
        super(nama, jumlahPeluru);
    }

    @Override
    void tembak() { // override method
        System.out.println("Duar!");
    }
}

class AssaultRifle extends Senjata {
    AssaultRifle(String nama, int jumlahPeluru) {
        super(nama, jumlahPeluru);
    }

    @Override
    void tembak() { // overriding method
        tembak(false);
    }

    void tembak(boolean single){ // overloading method
        if (single){
            System.out.println("Dar");
        } else{
            System.out.println("Drrrrrrrrrrrrrrrrrrrrret");
        }
    }
}

public class App {
    public static void main(String[] args) throws Exception {
        Shotgun dbz = new Shotgun("DBZ", 20);
        dbz.infoSenjata();
        dbz.tembak();

        AssaultRifle m416 = new AssaultRifle("M416", 40);
        m416.infoSenjata();
        m416.tembak(true);
        m416.tembak();
    }
}
