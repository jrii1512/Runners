import java.io.IOException;
import java.util.Scanner;

public class Runner {

    public static void main(String[] args){
        Runtime runtime = Runtime.getRuntime();
        Process process = null;
        Scanner scan = new Scanner(System.in);
        System.out.println("Anna ajettava tiedosto");
        String tiedosto = scan.nextLine();
        try{
            process = Runtime.getRuntime().exec("java -jar " + tiedosto + ".jar");
        }
        catch(IOException e){
            e.printStackTrace();
        }

    }
}