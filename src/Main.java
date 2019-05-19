import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException, IOException {

        //czytanie tagów
        System.out.println("Podaj tagi");
        Scanner scan = new Scanner(System.in);
        String tagsInput  = scan.nextLine();
        System.out.println("Tag: "+ tagsInput);

        // obsluga pliku
        File[] files = {
                new File("memes/cereal.txt"),
                new File("memes/derp.txt"),
                new File("memes/facepalm.txt"),
                new File("memes/nyan.txt"),
                new File("memes/ohgod.txt"),
                new File("memes/ohyeah.txt"),
                new File("memes/sir.txt"),
                new File("memes/takemymoney.txt"),
                new File("memes/troll.txt")
        };
        //String[] tagiZPlikow = new String[files.length];


        ArrayList<String>[] tags = new ArrayList[files.length];
        for (int i = 0 ; i < files.length ; i++){
            String text;
            FileReader fileReader = new FileReader (files[i]);
            BufferedReader buffreader = new BufferedReader(fileReader);
            text = buffreader.readLine();
            String[] splittedTags = text.split(" ");
            for (int j=0; j<splittedTags.length; j++){
                tags[i] = new ArrayList<>();
                tags[i].add(splittedTags[j]);
            }
        }
    }
}