package File;


import java.io.BufferedWriter;
import java.io.FileWriter;

public class Program {

    public static void main(String[] args)  {

        String[] Lines = new String[] {"Good Morning, Good Afternoon, Good Night"};
        String path = "C:\\Windows\\Temp\\out.txt";

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))) {
            for (String line : Lines) {
                bw.write(line);
                bw.newLine();
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());

        }
            }
        }
