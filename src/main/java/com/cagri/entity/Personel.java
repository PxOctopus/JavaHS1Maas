package com.cagri.entity;

import java.util.Random;
import java.util.UUID;

public abstract class Personel {
    private String id;
    private String ad;
    private String soyad;
    private String unvan;
    private String adres;
    private int calismaSaati;
    private double saatlikUcret;
    private double maas;


    public double maasHesapla() {
        return this.maas = saatlikUcret * calismaSaati;
    }

    public Personel(String ad, String soyad, String unvan) {
        this.id = UUID.randomUUID().toString();
        this.ad = ad;
        this.soyad = soyad;
        this.unvan = unvan;
    }

    public Personel(String ad, String soyad, String unvan, String adres, int calismaSaati, double saatlikUcret, double maas) {
        this.id = UUID.randomUUID().toString();
        this.ad = ad;
        this.soyad = soyad;
        this.unvan = unvan;
        this.adres = adres;
        this.calismaSaati = calismaSaati;
        this.saatlikUcret = saatlikUcret;
        this.maas = maas;
    }

    public String getId() {
        return id;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public String getUnvan() {
        return unvan;
    }

    public void setUnvan(String unvan) {
        this.unvan = unvan;
    }

    public String getAdres() {
        return adres;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }

    public int getCalismaSaati() {
        return calismaSaati;
    }

    public void setCalismaSaati(int calismaSaati) {
        this.calismaSaati = calismaSaati;
    }

    public double getSaatlikUcret() {
        return saatlikUcret;
    }

    public void setSaatlikUcret(double saatlikUcret) {
        this.saatlikUcret = saatlikUcret;
    }

    public double getMaas() {
        return maas;
    }

    public void setMaas(double maas) {
        this.maas = maas;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Personel{");
        sb.append("id='").append(id).append('\'');
        sb.append(", ad='").append(ad).append('\'');
        sb.append(", soyad='").append(soyad).append('\'');
        sb.append(", unvan='").append(unvan).append('\'');
        sb.append(", adres='").append(adres).append('\'');
        sb.append(", calismaSaati=").append(calismaSaati);
        sb.append(", saatlikUcret=").append(saatlikUcret);
        sb.append('}');
        return sb.toString();
    }
}
