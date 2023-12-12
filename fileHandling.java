import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class fileHandling {
    public static void main(String[] args) {
        String foldername = "src\test", filename = "filename.txt",
                directory = "\\Users/Administrator/Documents/NetBeansProjects/prog/Prog/src";

        System.out.println();

        createFile(filename);
        System.out.println();
        writeToFile(filename);
        System.out.println();
        readFile(filename);
        System.out.println();
        getFileInfo(filename);
        System.out.println();
        // deleteFile(filename);
        // System.out.println();
        deleteFolder(foldername);
        System.out.println();
        readDirectory(directory);
        System.out.println();
        appendDataToFiles(filename);
        System.out.println();
        readFile(filename);
        System.out.println();

    }

    public static void createFile(String filename) {
        try {
            File myObj = new File(filename);
            if (myObj.createNewFile()) {
                System.out.println("File created: " + myObj.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    public static void writeToFile(String filename) {
        try {
            FileWriter myWriter = new FileWriter(filename);
            myWriter.write("Files in Java might be tricky, but it is fun enough!");
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    public static void readFile(String filename) {
        try {
            File myObj = new File(filename);
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                System.out.println(data);
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    public static void getFileInfo(String filename) {
        File myObj = new File(filename);
        if (myObj.exists()) {
            System.out.println("File name: " + myObj.getName());
            System.out.println("Absolute path: " + myObj.getAbsolutePath());
            System.out.println("Writeable: " + myObj.canWrite());
            System.out.println("Readable " + myObj.canRead());
            System.out.println("File size in bytes " + myObj.length());
        } else {
            System.out.println("The file does not exist.");
        }
    }

    public static void deleteFile(String filename) {
        File myObj = new File(filename);
        if (myObj.delete()) {
            System.out.println("Deleted the file: " + myObj.getName());
        } else {
            System.out.println("Failed to delete the file.");
        }
    }

    public static void deleteFolder(String foldername) {
        File myObj = new File(foldername);
        if (myObj.delete()) {
            System.out.println("Deleted the folder: " + myObj.getName());
        } else {
            System.out.println("Failed to delete the folder.");
        }
    }

    public static void readDirectory(String directory) {
        File file = null;
        String[] paths;

        try {
            file = new File(directory);
            paths = file.list();
            for (String path : paths) {
                System.out.println(path);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void appendDataToFiles(String filename) {
        try (FileWriter fw = new FileWriter(filename, true);
                BufferedWriter bw = new BufferedWriter(fw);
                PrintWriter out = new PrintWriter(bw)) {
            out.println("\nAppended text");
            out.println("more text");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

}