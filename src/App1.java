import java.util.Scanner;

/**
 * App1
 */
public class App1 {
    public static boolean isBisestile(int yr) {
        return ((yr % 400 == 0) || ((yr % 4 ==0) && (yr % 100 != 0)));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Programma per determinare se un anno è bisestile o meno, CTRL+C per uscire oppure digitare -1");
        int anno=0;
        do {
            try {
                System.out.print("Inserire un anno:");
                anno=Integer.parseInt(sc.nextLine());
                if(anno>0)
                    System.out.printf("%s bisestile:%10b\n",anno,isBisestile(anno));
            } catch (Exception e) {
                System.err.println(e.getMessage());
            }
        } while (anno!=-1);
        sc.close();
    }
}