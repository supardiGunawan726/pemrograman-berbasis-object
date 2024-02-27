public class HandPhone {
    String jenis_hp;
    int tahun_pembuatan;

    public void setDataHP(String jenis_hp, int tahun_pembuatan){
        this.jenis_hp = jenis_hp;
        this.tahun_pembuatan = tahun_pembuatan;
    }

    String getJenisHP(){
        return jenis_hp;
    }

    int getTahunPembuatan(){
        return tahun_pembuatan;
    }
    

    public static void main(String[] args) throws Exception {
        HandPhone hp = new HandPhone();
        hp.setDataHP("Samsung", 2022);
        System.out.println(hp.getJenisHP());
        System.out.println(hp.getTahunPembuatan());
    }
}

