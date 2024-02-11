package sinav;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import static sinav.logInMenu.getPath;

public class Ogrenci{

    public void setPuan(double puan) {
        this.puan = puan;
    }
    
    
private String kullaniciAdi ;
private String ogrenciNo ;
private String adi ;
private String soyAdi ;
private String sifre ;
private double puan ;

public Ogrenci(String kullaniciAdi, String ogrenciNo, String adi, String soyAdi, String sifre){
    this.kullaniciAdi = kullaniciAdi;
    if(numaraMı(ogrenciNo)){
    this.ogrenciNo = ogrenciNo;
    }else{
        System.out.println("HATA ÇIKTI");
        return ;
    }
    this.adi = adi;
    this.soyAdi = soyAdi;
    this.sifre = sifre ; 
    this.puan = -1 ;
}

public Ogrenci(String kullaniciAdi, String ogrenciNo, String adi, String soyAdi, String sifre, double puan){
    this.kullaniciAdi = kullaniciAdi;
    if(numaraMı(ogrenciNo)){
    this.ogrenciNo = ogrenciNo;
    }else{
        System.out.println("HATA ÇIKTI");
        return ;
    }
    this.adi = adi;
    this.soyAdi = soyAdi;
    this.sifre = sifre ; 
    this.puan = puan ;
}

private static boolean numaraMı(String x){
    
    for(int i = 0 ; i < x.length(); i++ ){
        if(x.charAt(i) >= 48 && x.charAt(i)<= 57){
        }else{
            return false;
        }
    }
    return true;
}

public void ogrenciEkle() throws IOException{
     File ogrenciler = new File(getPath()+"\\FÜUSS\\OgrenciKayıtları.txt");
     
     FileWriter fr = new FileWriter(ogrenciler,true);
    fr.write(this.getKullaniciAdi()+"\n");
    fr.write(this.getOgrenciNo()+"\n");
    fr.write(this.getAdi()+"\n");
    fr.write(this.getSoyAdi()+"\n");
    fr.write(this.getSifre()+"\n");
    fr.write(this.getPuan()+"\n");
    
    fr.close();
}
    
    /**
     * @param kullaniciAdi the kullaniciAdi to set
     */
    public void setKullaniciAdi(String kullaniciAdi) {
        this.kullaniciAdi = kullaniciAdi;
    }

    public void setOgrenciNo(String ogrenciNo) {
        this.ogrenciNo = ogrenciNo;
    }

    public void setAdi(String adi) {
        this.adi = adi;
    }

    public void setSoyAdi(String soyAdi) {
        this.soyAdi = soyAdi;
    }

    public void setSifre(String sifre) {
        this.sifre = sifre;
    }

    public String getKullaniciAdi() {
        return kullaniciAdi;
    }

    public String getOgrenciNo() {
        return ogrenciNo;
    }

    public String getAdi() {
        return adi;
    }

    public String getSoyAdi() {
        return soyAdi;
    }
    public String getSifre() {
        return sifre;
    }
    public double getPuan() {
        return puan;
    }
}




