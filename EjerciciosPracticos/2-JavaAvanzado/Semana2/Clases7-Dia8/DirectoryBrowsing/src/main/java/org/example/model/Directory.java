package org.example.model;
import java.util.*;

public class Directory {

    String name;
    List<Directory> subdirectory;
    List<String> archive;

    public Directory(String name) {
        this.name = name;
        this.subdirectory = new ArrayList<>();
        this.archive = new ArrayList<>();
    }

    public void addSubdirectory(Directory subDirectory) {
        this.subdirectory.add(subDirectory);
    }

    public void addArchive(String archive) {
        this.archive.add(archive);
    }

    public String getName() {
        return name;
    }

    public List<Directory> getSubdirectory() {
        return subdirectory;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSubdirectory(List<Directory> subdirectory) {
        this.subdirectory = subdirectory;
    }

    public List<String> getArchive() {
        return archive;
    }

    public void setArchive(List<String> archive) {
        this.archive = archive;
    }

    @Override
    public String toString() {
        return "|____ " +name + '\n' +
                "|________ " + archive + '\n' ;
    }
}
