package com.cagri.entity;

public class Memur extends Personel {
    private double mesaiUcret;
    private int memurDerece;

    public Memur(String ad, String soyad, String unvan) {
        super(ad, soyad, unvan);
    }

    public Memur(String ad, String soyad, String unvan, String adres, int calismaSaati, double saatlikUcret, double maas, double mesaiUcret, int memurDerece) {
        super(ad, soyad, unvan, adres, calismaSaati, saatlikUcret, maas);
        this.mesaiUcret = mesaiUcret;
        this.memurDerece = memurDerece;
        if (memurDerece == 3) {
            saatlikUcret = 500;
        } else if (memurDerece == 2) {
            saatlikUcret = 520;
        } else if (memurDerece == 1) {
            saatlikUcret = 540;
        }

        if (calismaSaati > 180) {
            mesaiUcret = (calismaSaati - 180) * (saatlikUcret * 1.5d);
        } else {
            mesaiUcret = 0;
        }
    }

    @Override
    public double maasHesapla() {
        return super.maasHesapla() + mesaiUcret;
    }

    public double getMesaiUcret() {
        return mesaiUcret;
    }

    public void setMesaiUcret(double mesaiUcret) {
        this.mesaiUcret = mesaiUcret;
    }

    public int getMemurDerece() {
        return memurDerece;
    }

    public void setMemurDerece(int memurDerece) {
        this.memurDerece = memurDerece;
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
        final StringBuffer sb = new StringBuffer("Memur{");
        sb.append("mesaiUcret=").append(mesaiUcret);
        sb.append(", memurDerece=").append(memurDerece);
        sb.append('}');
        return sb.toString();
    }
}
