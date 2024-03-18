package com.cagri.entity;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DecimalFormat;

import static com.cagri.utility.PersonelDB.personelList;

public class MaasBordro {
//    DecimalFormat df = new DecimalFormat("#,##0.00");

    public void wageReport() {
        hoursChecker();

        double mesai = 0;
        double yoneticiBonusu = 0;

        for (Personel personel : personelList) {
            File path = new File("C:\\Users\\cagri\\IdeaProjects\\JavaHS1Maas\\src\\main\\java\\com\\cagri\\PersonelFolders\\" + personel.getAd() + personel.getSoyad());
            path.mkdirs();
            String personelNameJson = path + "/" + personel.getAd() + personel.getSoyad() + ".json";

            try {
                FileWriter writer = new FileWriter(personelNameJson);
                writer.write("Maas Bordro, " + "SUBAT" + " " + " 2020" + "\n====================\n");
                writer.write("Personel Ismi: " + personel.getAd() + "\n");
                writer.write("Calisma Saati: " + personel.getCalismaSaati() + "\n");


                if (personel instanceof Memur) {
                    writer.write("Ana Odeme: ₺" + ((Memur)personel).maasHesapla() + "\n");
                    yoneticiBonusu = 0d;
                    mesai = ((Memur) personel).getMesaiUcret();
                    writer.write("Mesai: ₺" + (mesai) + "\n");
                }

                if (personel instanceof Yonetici) {
                    writer.write("Ana Odeme: ₺" + ((Yonetici)personel).maasHesapla() + "\n");
                    yoneticiBonusu = (((Yonetici) personel).getYoneticiBonusu());
                    mesai = 0d;
                    writer.write("Yonetici Bonusu: ₺" + (yoneticiBonusu) + "\n");
                }
                writer.write("====================\n");
                writer.write("Toplam Odeme: ₺" + (mesai + yoneticiBonusu + personel.maasHesapla()) + "\n");
                writer.write("====================\n");
                writer.close();

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }


    private void hoursChecker() {
        boolean saat150 = false;
        boolean saat10 = false;

        for (Personel personel : personelList) {
            if (personel.getCalismaSaati() < 150) {
                System.out.println(personel.getAd() + " " + personel.getSoyad() + " 150 saatten az çalışmıştır.");
                saat150 = true;
            }
            if (personel.getCalismaSaati() < 10) {
                System.out.println(personel.getAd() + " " + personel.getSoyad() + " 10 saatten az çalışmıştır.");
                saat10 = true;
            }
        }

        if (!saat150) {
            System.out.println("Hiçbir personel 150 saatten az çalışmamıştır.");
        }
        if (!saat10) {
            System.out.println("Hiçbir personel 10 saatten az çalışmamıştır.");
        }
    }
}

