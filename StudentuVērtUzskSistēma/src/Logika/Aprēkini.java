package Logika;
import Dati.Ipasibas;
import Dati.Studenti;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Aprēkini {

    public static int GalaVērtējums(int[] atzimes, int galaAtzime) {
        int galaVertejums = galaAtzime;
        for (int i = 0; i < atzimes.length; i++) {
            galaVertejums = galaVertejums + atzimes[i];
        }
        galaVertejums = galaVertejums / (atzimes.length + 1);
        if (galaAtzime == galaVertejums + 1) {
            return galaAtzime;
        }
        return galaVertejums;
    }
    public static void KartotPecGalaVertejums() {
        for (int j = Studenti.saraksts.size() - 1; j > 0; j--) {
            for (int i = 1; i < Studenti.saraksts.size(); i++) {
                if (Studenti.saraksts.get(i - 1).galaVertejums < Studenti.saraksts.get(i).galaVertejums) {
                    Collections.swap(Studenti.saraksts, i - 1, i);
                }
            }
        }
    }
    public static void KartotPecGalaAtzimes() {
        for (int j = Studenti.saraksts.size() - 1; j > 0; j--) {
            for (int i = 1; i < Studenti.saraksts.size(); i++) {
                if (Studenti.saraksts.get(i - 1).galaAtzime < Studenti.saraksts.get(i).galaAtzime) {
                    Collections.swap(Studenti.saraksts, i - 1, i);
                }
            }
        }
    }
    public static void KartotPecNumura() {
        for (int j = Studenti.saraksts.size() - 1; j > 0; j--) {
            for (int i = 1; i < Studenti.saraksts.size(); i++) {
                if (Studenti.saraksts.get(i - 1).ID > Studenti.saraksts.get(i).ID) {
                    Collections.swap(Studenti.saraksts, i - 1, i);
                }
            }
        }
    }
    public static List<Ipasibas> LabakaisStudents(){
        List Labakie = new ArrayList<Ipasibas>();
        KartotPecGalaVertejums();
        Labakie.add(Studenti.saraksts.get(0));
        for(int i = 1;i<Studenti.saraksts.size();i++){
            if (Studenti.saraksts.get(i-1).galaVertejums == Studenti.saraksts.get(i).galaVertejums) {
                Labakie.add(Studenti.saraksts.get(i));
            }
            else {
                break;
            }
        }
        return Labakie;
    }
    public static List<Ipasibas> SliktakaisStudent(){
        List Sliktakie = new ArrayList<Ipasibas>();
        KartotPecGalaVertejums();
        Sliktakie.add(Studenti.saraksts.get(Studenti.saraksts.size()-1));
        for(int i = Studenti.saraksts.size()-1;i>=0;i--){
            if (Studenti.saraksts.get(i).galaVertejums == Studenti.saraksts.get(i-1).galaVertejums) {
                Sliktakie.add(Studenti.saraksts.get(i-1));
            }
            else {
                break;
            }
        }
        return Sliktakie;
    }
}