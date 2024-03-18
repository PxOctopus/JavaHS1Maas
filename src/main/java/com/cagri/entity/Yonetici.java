package com.cagri.entity;

public class Yonetici extends Personel{
    private double yoneticiBonusu;

    public Yonetici(String ad, String soyad, String unvan) {
        super(ad, soyad, unvan);
    }

    public Yonetici(String ad, String soyad, String adres, int calismaSaati, double saatlikUcret, double yoneticiBonusu) {
        super(ad, soyad, adres, calismaSaati, saatlikUcret);
        this.yoneticiBonusu = yoneticiBonusu;
    }

    @Override
    public double maasHesapla() {
        return super.maasHesapla() + yoneticiBonusu;
    }

    public double getYoneticiBonusu() {
        return yoneticiBonusu;
    }

    public void setYoneticiBonusu(double yoneticiBonusu) {
        this.yoneticiBonusu = yoneticiBonusu;
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

    public String toString() {
        final StringBuffer sb = new StringBuffer("Yonetici{");
        sb.append("id='").append(getId()).append('\'');
        sb.append(", ad='").append(getAd()).append('\'');
        sb.append(", soyad='").append(getSoyad()).append('\'');
        sb.append(", unvan='").append(getUnvan()).append('\'');
        sb.append(", adres='").append(getAdres()).append('\'');
        sb.append(", calismaSaati=").append(getCalismaSaati());
        sb.append(", saatlikUcret=").append(getSaatlikUcret());
        sb.append('}');
        return sb.toString();
    }
}
