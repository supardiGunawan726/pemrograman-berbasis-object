package com.kendaraan;

public abstract class Kendaraan {
  String merk;

  abstract void setKecepatan(int kecepatan);
  abstract void seJenis(String jenis);

  void SetMerk(String merk){
    this.merk = merk;
  }
}
