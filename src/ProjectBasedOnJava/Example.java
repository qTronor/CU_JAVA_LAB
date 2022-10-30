package ProjectBasedOnJava;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

public class Example {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();

        File file1 = new File("src/ProjectBasedOnJava/res", "File1.txt");

        FileWriter writer = new FileWriter(file1);
        writer.write("ADSAD");

        File file2 = new File("src/ProjectBasedOnJava/res", "File2.txt");

        Path copy = Files.copy(file1.toPath(), file2.toPath());
    }
}
