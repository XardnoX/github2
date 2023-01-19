package cz.oauh;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class Main {
    private static final String SOUBORY = "vystup.txt";
    private static final String VSTUP = "vstup.txt";
    public static void main(String[] args) {

        List<Zakaznik> list = new ArrayList<>();
        list.add(new Zakaznik("Karel Pavel", 1));
        list.add(new Zakaznik("Petr Babiš", 9));
    ulozeniEvidence.scanFromFile(VSTUP);
    writeToFile(list);
        System.out.println(list);
    }


    public static void writeToFile(List<Zakaznik> listy) {

        try (PrintWriter writer = new PrintWriter(new BufferedWriter(new FileWriter(SOUBORY)))) {
            for (Zakaznik zakaznik : listy) {
                writer.println(
                        zakaznik.getJmeno() + ";" +
                                zakaznik.getPocetProdeju()
                );
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}