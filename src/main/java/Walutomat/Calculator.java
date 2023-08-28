package Walutomat;
public class Calculator {
    float prowizja = 0.998F;
    float waluta;
    float kurs2;
    float poKursie;

    Calculator(){
    }
    public Calculator(float waluta,float kurs,float kurs2, float poKursie) {
        this.waluta = waluta;
        this.kurs2 = kurs2;

    }
    public void kwotaPoProwizji(float waluta1){
        this.waluta=prowizja*waluta1;

    }
    public void kwotaPoKursie(float kurs){
       this.poKursie=this.waluta*kurs;

    }
    public float getBalance(){
        return this.poKursie;
    }

    public void kwotaPierwsza(float waluta1) {
        this.kurs2=((this.poKursie/waluta1)*prowizja);
    }
    public float getKursPotrzebnyDoZostaniaNa0(){
        return this.kurs2;
    }


}


