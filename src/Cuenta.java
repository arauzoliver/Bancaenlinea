/**
 * Created by user on 09/14/2016.
 */
public class Cuenta {
    String Nom;
    String Num;
    float Sal;

    public Cuenta (String A, String B, float C){
            this.Nom = A;
            this.Num = B;
            this.Sal = C;
    }

    public String getNom() {
        return Nom;
    }

    public void setNom(String nom) {
        Nom = nom;
    }

    public String getNum() {
        return Num;
    }

    public void setNum(String num) {
        Num = num;
    }

    public float getSal() {
        return Sal;
    }

    public void setSal(float sal) {
        Sal = sal;
    }

@Override
public String toString()  {
    return this.Nom  + "\nSaldo: " + this.Sal + "\nNumero de Cuenta: " + this.Num;
}


}
