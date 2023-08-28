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
    public float kwotaPoKursie(float kurs){
       this.poKursie=this.waluta*kurs;
       return this.poKursie;
    }
    public float getBalance(){
        return this.poKursie;
    }
    public float getKursPotrzebnyDoZostaniaNa0(){
        return this.kurs2;
        }
    public void kwotaPierwsza(float waluta1) {
        this.kurs2=((this.poKursie/waluta1)*prowizja);
        }
        public float getBetterKurs(float waluta1) {
            for (int i = 0; i < 5; i++) {
                this.kurs2 -= 0.001;
                System.out.println("Pomniejszony kurs: " + (this.kurs2) + "\n" + "Otrzymana kwota: " +
                                                           this.poKursie/this.kurs2*prowizja + "nok"  );
            }
            return waluta1;
        }
    }



