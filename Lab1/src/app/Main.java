package app;

import java.io.*;
import java.nio.*;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {

    public static void main(String[] args) throws IOException {
        String filePath="D:\\lol";
           Path path = Paths.get("D:\\lol");
           DiskFile disk = new DiskFile(true, path);

        
//       DiskFile fileToSerialize = new DiskFile(true, new File(filePath));
//       serializeDiskFile(fileToSerialize,new File("save"));
//       
//       DiskFile deserializedFile = deserializeDiskFile(new File("save"));
//       deserializedFile.printFile();
       
    }

    public static void serializeDiskFile(DiskFile diskFile, File file) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file))) {
            oos.writeObject(diskFile);
        } catch (IOException ex) {
            System.err.println("Nie udało się zapisać!");
            System.err.println(ex.getMessage());
        }
    }

    public static DiskFile deserializeDiskFile(File file) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))) {
            DiskFile diskFile = (DiskFile) ois.readObject();
            return diskFile;
        } catch (IOException | ClassNotFoundException ex) {
            System.err.println("Nie udało się odczytać!");
            System.err.println(ex.getMessage());
        }
        return null;
    }
}
