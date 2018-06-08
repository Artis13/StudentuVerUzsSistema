package Aplikacija;
import java.util.Scanner;

public class Aplikacija {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Funkcijas f = new Funkcijas();
        String at;

        while (true) {
            System.out.println();
            System.out.println("Izvēlieties kādu darbību vēlaties veikt?");
            f.Izvelne();
            at = scanner.next();
            if(at.equals("0")) break;
            switch (at) {
                case "1":
                    f.PievienotStudentu();
                    break;
                case "2":
                    f.DzestStudentu();
                    break;
                case "3":
                    f.AtjaunotStudentaDatus();
                    break;
                case "4":
                    f.KartotPecNumura();
                    f.drukatSarakstu();
                    break;
                case "5":
                    f.KartotPecGalaAtzimes();
                    f.drukatSarakstu();
                    break;
                case "6":
                    f.KartotPecGalaVertejums();
                    f.drukatSarakstu();
                    break;
                case "7":
                    f.LabakaisStudents();
                    break;
                case "8":
                    f.SliktakaisStudents();
                    break;
                case "9":
                    f.Atraststudentu();
                    break;
                default:
                    System.out.println("Neatpazīta darbība ");
                    break;
            }
        }
    }
}
