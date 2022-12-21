import java.util.Scanner;

/**
 * App0, check readme for what this does
 * 
 * @author Patric Pintescul
 * @version 1.0 21/12/2022
 */
public class App0 {

    public static String getMonthNameByIndex(int index) throws Exception {
        switch (index) {
            case 1:return "GENNAIO";
            case 2:return "FEBBRAIO";
            case 3:return "MARZO";
            case 4:return "APRILE";
            case 5:return "MAGGIO";
            case 6:return "GIUGNO";
            case 7:return "LUGLIO";
            case 8:return "AGOSTO";
            case 9:return "SETTEMBRE";
            case 10:return "OTTOBRE";
            case 11:return "NOVEMBRE";
            case 12:return "DICEMBRE";
            default:throw new Exception("Il numero non corrisponde ad alcun mese");
        }
    }
    //Array method
    public static String MonthByIndex(int index) throws Exception {
        String months[]={
            "GENNAIO",
            "FEBBRAIO",
            "MARZO",
            "APRILE",
            "MAGGIO",
            "GIUGNO",
            "LUGLIO",
            "AGOSTO",
            "SETTEMBRE",
            "OTTOBRE",
            "NOVEMBRE",
            "DICEMBRE",
        };
        if(index>months.length||index<1)
            throw new Exception("!!!Il numero non corrisponde ad alcun mese!!!");
        return months[index];
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Programma per prendere il nome di un mese dato il numero, premere CTRL+C oppure digitare -1 per uscire");
        int scelta=0;
        do {
            try {
                System.out.print("Inserire un numero tra 1 e 12 (estremi inclusi):");
                scelta=Integer.parseInt(sc.nextLine());
                System.out.println(getMonthNameByIndex(scelta));
            } catch (Exception e) {
                System.err.println(e.getMessage());
            }
        } while (scelta!=-1);
        sc.close();
    }
}