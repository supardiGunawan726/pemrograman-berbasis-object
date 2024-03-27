package com.kendaraan;

public class Mobil extends Kendaraan implements IMobil {
  String jenis;
  int kecepatan;

  @Override
  public void setKecepatan(int kecepatan) {
    if (!isKecepatanMax() && this.kecepatan + kecepatan <= MAX_KECEPATAN){
      this.kecepatan += kecepatan;
    } else {
      System.out.println("Kecepatan Maximum");
    }
  }

  @Override
  public void seJenis(String jenis) {
    this.jenis = jenis;
  }

  @Override
  public boolean isKecepatanMax() {
    return this.kecepatan >= MAX_KECEPATAN;
  }

  @Override
  public String toString() {
    return "Jenis : " + jenis + "\n" + "Kecepatan :" + kecepatan;
  }
  
}
