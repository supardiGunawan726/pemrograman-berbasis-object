class BuahCatur {
    private String nama;

    BuahCatur(String nama){
        this.nama = nama;
    }

    void info(){
        System.out.println("Nama bidak: " + this.nama);
    }

    void gerak(){}
}

class Kuda extends BuahCatur {

    Kuda(String nama) {
        super(nama);
    }

    @Override
    void gerak() { // overriding method
        gerak(true);
    }

    void gerak(boolean keKiri){ // overloading method
        if (keKiri){
            System.out.println("Pindah dari B1 ke B3");
        } else {
            System.out.println("Pindah dari B1 ke C3");
        }
    }

}

public class App {
    public static void main(String[] args) throws Exception {
        Kuda kuda = new Kuda("kuda kiri");
        kuda.info();
        kuda.gerak();
        kuda.gerak(false);
    }
}
