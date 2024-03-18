package com.cagri.entity;


import com.cagri.utility.PersonelDB;

import java.io.IOException;
import java.util.Collections;

public class Program {
    public static void main(String[] args) throws IOException {

        ///// DosyaOku class'ının kullanimi:
        ///// JSON dosyasindan unvana dayali olarak Yonetici veya Memur class'ından
        ///// nesneler olusturulmasini ve bu nesneleri bir Personel arraylistine kaydedilmesini saglayan
        ///// write2list() adındaki metot burada calistirilmiş ve arraylist sout ile ekrana ciktilanmistir:
        DosyaOku dosyaOku = new DosyaOku();
        dosyaOku.write2List();
        System.out.println(PersonelDB.personelList);

        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        System.out.println("============THE NEXT METHOD============");
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");

        ///// MaasBordro class'ının kullanımı:
        ///// Personel subclass özellik ve metotlarinin kullanilmasi üzere personel nesnelerinin oluşturulmasi
        ///// ve MaasBordro sinifi ile bordro bilgilerinin çıktılanarak dosya sistemine kaydedilmesi:

        Personel yonetici = new Yonetici("Ozan", "Akyol","Ankara",160,550,10000d);
        Personel memur1 = new Memur("Erman", "Caglar","Eskisehir",190,1,400);
        Personel memur2 = new Memur("Hasan", "Inceler","Eskisehir",180,3,400);
        Personel memur3 = new Memur("Taylan", "Gunes","Eskisehir",180,2,400);
        Collections.addAll(PersonelDB.personelList, yonetici, memur1, memur2, memur3);


        MaasBordro maasBordro = new MaasBordro();
        maasBordro.wageReport();

    }
}
