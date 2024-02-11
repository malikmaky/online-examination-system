package sinav;

public class Soru{
 
public String soruMetni ; 
public String[] cevaplar = new String[4];
public char cevapSikki ;


public Soru(String soruMetni, String[] cevaplar, char cevapSikki){
    this.soruMetni = soruMetni;
    this.cevaplar = cevaplar;
    this.cevapSikki = cevapSikki;
}
    
}
