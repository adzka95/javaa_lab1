package app;

import java.io.File;
import java.io.IOException;
import java.io.Serializable;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.util.*;

public class DiskFile implements Comparable<DiskFile>, Serializable {

    private Set<DiskFile> files;
    private String fileName;
    private Date modifiedTime;
    private String path;
    private Type type;

    public DiskFile(boolean sorted, Path path) throws IOException {
        String pomocnik;
        files = new TreeSet<>();
        this.fileName = path.getFileName().toString();
    try (DirectoryStream<Path> stream = Files.newDirectoryStream(path)) {
        for (Path entry : stream) {
                System.out.println(entry);
            if (Files.isDirectory(entry)) {
                   DiskFile nazwa= new DiskFile(sorted, entry);
                 
            }
            //files.add(entry);
        }
    }  
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final DiskFile other = (DiskFile) obj;
        return this.path.equals(other.path);
    }

    @Override
    public int hashCode() {
        return this.path.hashCode();
    }

    
    @Override
    public int compareTo(DiskFile o) {  
        return this.fileName.compareTo(o.fileName);
    }

    public void printFile() {
        this.printFile("-");
    }

    private void printFile(String pre) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String formattedDate = sdf.format(this.modifiedTime);

        System.out.printf("%-60s  %s%n", pre+this.fileName, this.type + " " + formattedDate);
        for (DiskFile df : this.files){
            df.printFile(pre+"-");
        }
    }
}
