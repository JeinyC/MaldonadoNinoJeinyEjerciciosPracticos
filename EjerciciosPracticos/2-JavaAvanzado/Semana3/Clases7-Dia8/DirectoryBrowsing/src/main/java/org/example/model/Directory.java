package org.example.model;
import java.util.*;

public class Directory {

    String name;
    List<Directory> subdirectory;
    List<String> archive;

    public Directory(String name, List<Directory> subdirectory, List<String> archive) {
        this.name = name;
        this.subdirectory = subdirectory;
        this.archive = archive;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Directory> getSubdirectory() {
        return subdirectory;
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
        return "Directory{" +
                "name='" + name + '\'' +
                ", subdirectory=" + subdirectory +
                ", archive=" + archive +
                '}';
    }
}
