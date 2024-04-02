class Mahasiswa<NIM, NAME, CLASS> {
    NIM nim;
    NAME name;
    CLASS clas;

    public void setNim(NIM nim) {
      this.nim = nim;
    }

    public void setName(NAME name) {
      this.name = name;
    }
    
    public void setClas(CLASS clas) {
      this.clas = clas;
    }

    public NIM getNim() {
      return nim;
    }

    public NAME getName() {
      return name;
    }

    public CLASS getClas() {
      return clas;
    }
}

public class MahasiswaKu {
    public static void main(String[] args) throws Exception {
       Mahasiswa<String, String, Integer> m = new Mahasiswa<String, String, Integer>();
       m.setNim("1102020");
       m.setName("Ferdi");
       m.setClas(21);

       System.out.println(m.getNim());
       System.out.println(m.getName());
       System.out.println(m.getClas());
    }
}
