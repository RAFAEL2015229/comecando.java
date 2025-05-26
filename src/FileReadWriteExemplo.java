
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileReadWriteExemplo {
    public static void main (String [] args){
        try (BufferedWriter writer = new BufferedWriter(
            new FileWriter("arquivo.txt"))) {

                writer.write("Ola, mundo!");
                writer.newLine();
                writer.write("Segunda linha.");
                writer.newLine();
                writer.write("O Rafael e lindo demaisze");

            }   catch (IOException e){
                        e.printStackTrace();
                }

            }


    }
