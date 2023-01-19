package cz.oauh;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ulozeniEvidence {
    static void scanFromFile(String soubor) {
        try (Scanner scanner = new Scanner(new BufferedReader(new FileReader(soubor)))) {
            List<Zakaznik> list = new ArrayList<>();
           // int index = list.size() - 1;

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] slovo = line.split(";");
                int x = Integer.parseInt(slovo[1].trim());
                list.add(new Zakaznik(slovo[0].trim(), x));
            }
         //   list.remove(index);
            Main.writeToFile(list);

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
