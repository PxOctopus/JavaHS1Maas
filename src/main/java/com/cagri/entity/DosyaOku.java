package com.cagri.entity;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

import static com.cagri.utility.PersonelDB.personelList;

public class DosyaOku {

    public DosyaOku() throws FileNotFoundException {
        try {
            //BufferedReader ile dosya okuma:
            BufferedReader br = new BufferedReader(new FileReader("src/main/resources/YoneticiVeMemurListesi.json"));
            //Ilgili dosyayi JSON nesnesine dönüştürme:
            JSONObject jsonObject = new JSONObject(br.toString());
            //JSON nesnesi içindeki stringleri getirme:
            String ad = jsonObject.getString("ad");
            String soyad = jsonObject.getString("soyad");
            String unvan = jsonObject.getString("unvan");
            if (unvan.equalsIgnoreCase("yonetici")) {
                personelList.add(new Yonetici(ad, soyad, unvan));
            } else if (unvan.equalsIgnoreCase("memur")) {
                personelList.add(new Memur(ad, soyad, unvan));
            }
            System.out.println(personelList);
        } catch (FileNotFoundException | JSONException e) {
            throw new RuntimeException(e);
        }
    }
}
