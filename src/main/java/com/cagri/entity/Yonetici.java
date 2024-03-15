package com.cagri.entity;

public class Yonetici extends Personel{
    private double yoneticiBonusu;

    public Yonetici(String ad, String soyad, String unvan) {
        super(ad, soyad, unvan);
    }

    public Yonetici(String ad, String soyad, String unvan, String adres, int calismaSaati, double saatlikUcret, double maas, double yoneticiBonusu) {
        super(ad, soyad, unvan, adres, calismaSaati, saatlikUcret, maas);
        this.yoneticiBonusu = yoneticiBonusu;
        if (saatlikUcret<500){
            saatlikUcret=500;
        }
    }

    @Override
    public double maasHesapla() {
        return super.maasHesapla() + yoneticiBonusu;
    }

    @Override
    public String getId() {
        return super.getId();
    }

    @Override
    public String getAd() {
        return super.getAd();
    }

    @Override
    public void setAd(String ad) {
        super.setAd(ad);
    }

    @Override
    public String getSoyad() {
        return super.getSoyad();
    }

    @Override
    public void setSoyad(String soyad) {
        super.setSoyad(soyad);
    }

    @Override
    public String getUnvan() {
        return super.getUnvan();
    }

    @Override
    public void setUnvan(String unvan) {
        super.setUnvan(unvan);
    }

    @Override
    public String getAdres() {
        return super.getAdres();
    }

    @Override
    public void setAdres(String adres) {
        super.setAdres(adres);
    }

    @Override
    public int getCalismaSaati() {
        return super.getCalismaSaati();
    }

    @Override
    public void setCalismaSaati(int calismaSaati) {
        super.setCalismaSaati(calismaSaati);
    }

    @Override
    public double getSaatlikUcret() {
        return super.getSaatlikUcret();
    }

    @Override
    public void setSaatlikUcret(double saatlikUcret) {
        super.setSaatlikUcret(saatlikUcret);
    }

    @Override
    public double getMaas() {
        return super.getMaas();
    }

    @Override
    public void setMaas(double maas) {
        super.setMaas(maas);
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Yonetici{");
        sb.append("yoneticiBonusu=").append(yoneticiBonusu);
        sb.append('}');
        return sb.toString();
    }
}
