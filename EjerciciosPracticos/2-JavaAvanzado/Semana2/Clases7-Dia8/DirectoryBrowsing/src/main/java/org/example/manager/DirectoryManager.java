package org.example.manager;

import org.example.model.Directory;

import java.util.*;

import org.example.utils.Node;

public class DirectoryManager {
    public void init() {
        Directory mainDirectory = new Directory("Main Directory");
        Directory subDirectory1 = new Directory("Illuminaty");
        Directory subDirectory2 = new Directory("UFO");

        mainDirectory.addSubdirectory(subDirectory1);
        mainDirectory.addSubdirectory(subDirectory2);

        mainDirectory.addArchive("3eye.doc");
        subDirectory1.addArchive("...___...");
        subDirectory2.addArchive("shadowGovernment.doc");


        Node<String> mainNode;
        mainNode = new Node<>(mainDirectory.getName());
        mainNode.next = new Node<>(mainDirectory.getSubdirectory().toString());

        System.out.println("                                               \n" +
                "                                  ,-----. ,--. \n" +
                " ,--,--.,--.--. ,---.  ,--,--.    |  .--'/   | \n" +
                "' ,-.  ||  .--'| .-. :' ,-.  |    '--. `\\`|  | \n" +
                "\\ '-'  ||  |   \\   --.\\ '-'  |    .--'  / |  | \n" +
                " `--`--'`--'    `----' `--`--'    `----'  `--'");
        directoryBrowsing(mainNode);
    }

    private void directoryBrowsing(Node<?> node) {
        if (node == null) {
            return;
        }
        System.out.println(node.getData() + " ");
        directoryBrowsing(node.getNext());
    }
}

