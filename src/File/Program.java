package File;

import java.io.File;
import java.nio.file.Files;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a folder path: ");
        String strPath = sc.nextLine();

        File Path = new File(strPath);

        File[] folders = Path.listFiles(File::isDirectory);
        System.out.println("Folders: ");
        for (File folder : folders) {
            System.out.println(folder.getName());
        }

        File[] files = Path.listFiles(File::isFile);
        System.out.println("Files: ");
        for (File file : files) {
            System.out.println(file);
        }
        boolean sucess = new File(strPath + "\\subdir").mkdir();
        System.out.println("Directory created successfully: " + sucess);

            sc.close();
        }
    }

