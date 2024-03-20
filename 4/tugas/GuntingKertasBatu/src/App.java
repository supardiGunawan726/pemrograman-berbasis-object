class GuntingKertasBatu {
    private String jenis;
    
    GuntingKertasBatu(String jenis){
        this.jenis = jenis;
    }

    public String getJenis() {
      return jenis;
    }

    void lawan(GuntingKertasBatu target){}
}

class Gunting extends GuntingKertasBatu {
    Gunting() {
        super("Gunting");
    }

    @Override
    void lawan(GuntingKertasBatu target) { // overriding
        switch (target.getJenis()) {
            case "Kertas":
                lawanKertas();
                break;
            case "Batu":
                lawanBatu();
                break;
            default:
                System.out.println("Target tidak diketahui");
                break;
        }
    }

    void lawan(Kertas kertas){ // overloading
        lawanKertas();
    }

    void lawan(Batu batu){ // overloading
        lawanBatu();
    }

    void lawanKertas(){
        System.out.println("Gunting menang melawan kertas");
    }

    void lawanBatu(){
        System.out.println("Gunting kalah melawan batu");
    }
}

class Kertas extends GuntingKertasBatu {
    Kertas() {
        super("Kertas");
    }

    @Override
    void lawan(GuntingKertasBatu target) {
        switch (target.getJenis()) {
            case "Gunting":
                lawanGunting();
                break;
            case "Batu":
                lawanBatu();
                break;
            default:
                System.out.println("Target tidak diketahui");
                break;
        }
    }

    void lawan(Gunting gunting){ // overloading
        lawanGunting();
    }

    void lawan(Batu batu){ // overloading
        lawanBatu();
    }

    void lawanGunting(){
        System.out.println("Kertas kalah melawan gunting");
    }

    void lawanBatu(){
        System.out.println("Kertas menang melawan batu");
    }
}

class Batu extends GuntingKertasBatu {
    Batu() {
        super("Batu");
    }

    @Override
    void lawan(GuntingKertasBatu target) {
        switch (target.getJenis()) {
            case "Gunting":
                lawanGunting();
                break;
            case "Kertas":
                lawanKertas();
                break;
            default:
                System.out.println("Target tidak diketahui");
                break;
        }
    }

    void lawan(Gunting gunting){ // overloading
        lawanGunting();
    }

    void lawan(Kertas kertas){ // overloading
        lawanKertas();
    }

    void lawanGunting(){
        System.out.println("Batu menang melawan gunting");
    }

    void lawanKertas(){
        System.out.println("Batu kalah melawan kertas");
    }
}

public class App {
    public static void main(String[] args) throws Exception {
        Gunting gunting = new Gunting();
        GuntingKertasBatu kertas = new GuntingKertasBatu("Kertas");
        GuntingKertasBatu batu = new GuntingKertasBatu("Batu");

        gunting.lawan(kertas);
        gunting.lawan(batu);

        kertas.lawan(gunting);
        kertas.lawan(batu);

        batu.lawan(gunting);
        batu.lawan(kertas);
    }
}
