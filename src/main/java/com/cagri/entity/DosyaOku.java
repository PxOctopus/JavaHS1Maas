package com.cagri.entity;


import com.google.gson.*;


import java.io.FileNotFoundException;
import java.io.FileReader;

import static com.cagri.utility.PersonelDB.personelList;

public class DosyaOku {

    public void write2List() throws FileNotFoundException {

        //JSON ayrıstırma metodundan yararlanılmak uzere JsonParser sınıfından bır nesne olusturuldu
        JsonParser parser = new JsonParser();

        try {
            //JSON ayrıstırma metodu String, sayi, dizi veya Object donebildiginden
            // en genic temel tur objectde cevrildi:
            Object obj = parser.parse(new FileReader("C:\\Users\\cagri\\IdeaProjects\\JavaHS1Maas\\src\\main\\resources\\YoneticiVeMemurListesi.json"));

            //Object class'indan elde edilen nesne ise daha sonra JsonArray class'ının yardımıyla
            //bir Object dizisine cevrildi:
            JsonArray array = (JsonArray) obj;

            //forEach ile JsonArray'den herbir Object alınarak JsonObject class'ının yardımıyla name/value mappings'i saglayacak
            //JSON nesnesine cevrildi ve icerisindeki "key"lere karsilik gelen "value"lar String nesnelere donusturuldu;
            for (Object o : array) {
                JsonObject person = (JsonObject) o;

                String ad = person.get("ad").getAsString();
                System.out.println(ad);

                String soyad = person.get("soyad").getAsString();
                System.out.println(soyad);

                String unvan = person.get("unvan").getAsString().toUpperCase();
                System.out.println(unvan);

                if (unvan.equalsIgnoreCase("yonetici")) {
                    personelList.add(new Yonetici(ad, soyad, unvan));
                } else if (unvan.equalsIgnoreCase("memur")) {
                    personelList.add(new Memur(ad, soyad, unvan));
                }
            }
        } catch (JsonIOException | JsonSyntaxException | FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
