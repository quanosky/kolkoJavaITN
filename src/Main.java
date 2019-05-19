import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException, FileNotFoundException {

        MyFiles[] files = {
                new MyFiles(new File("memes/cereal.txt")),
                new MyFiles(new File("memes/derp.txt")),
                new MyFiles(new File("memes/facepalm.txt")),
                new MyFiles(new File("memes/nyan.txt")),
                new MyFiles(new File("memes/ohgod.txt")),
                new MyFiles(new File("memes/ohyeah.txt")),
                new MyFiles(new File("memes/sir.txt")),
                new MyFiles(new File("memes/takemymoney.txt")),
                new MyFiles(new File("memes/troll.txt"))
        };




        for(int i=0; i<files.length; i++){
            FileReader fileReader = new FileReader(files[i].file);
            BufferedReader buffReader = new BufferedReader(fileReader);
            String line;
            line = buffReader.readLine();
            String[] splitedTags = line.split(" ");
            for(int j=0; j<splitedTags.length; j++){
                ArrayList<String> tags = new ArrayList<>();
                tags.add(splitedTags[j]);
                files[i].setTags(tags);
            }
        }



        System.out.println("Tagi: ");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        System.out.println(input);
        String[] splitedInputTags = input.split(" ");

        for (int i = 0; i < files.length ; i++){
            int matches = 0;
            for (int j = 0; j < splitedInputTags.length ; j++) {
                if (files[i].tags.contains(splitedInputTags[j])){
                    matches++;
                }
            }

        }

//        ArrayList<String> inputTags = new ArrayList<>();
//
//        for(int i=0; i<splitedInputTags.length; i++) {
//            inputTags.add(splitedInputTags[i]);
//        }

    }
}