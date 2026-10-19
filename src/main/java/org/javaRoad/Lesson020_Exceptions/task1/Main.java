package org.javaRoad.Lesson020_Exceptions.task1;

import org.javaRoad.Lesson020_Exceptions.task1.model.File;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        File[] files = File.createTestDataset();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the file name: ");
        String input = sc.nextLine();

        System.out.println("\nOption 1:");
        try {
            File file1 = findFile(files, input);
            System.out.println(file1);
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Option 2");
        File file2;
        file2 = findFile(files, input);
        System.out.println(file2);
    }

    public static File findFile(File[] files, String fileName) throws FileNotFoundException {
        for (File file : files) {
            if (file.getName().equals(fileName)) {
                return file;
            }
        }
        throw new FileNotFoundException("Искомый файл не найден");
    }
}
