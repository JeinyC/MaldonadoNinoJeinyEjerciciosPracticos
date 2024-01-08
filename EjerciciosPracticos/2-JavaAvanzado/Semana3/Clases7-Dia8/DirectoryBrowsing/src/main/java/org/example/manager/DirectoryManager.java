package org.example.manager;

import org.example.model.Directory;

import java.util.*;

import org.example.utils.Node;

public class DirectoryManager {
    public void init() {
        List<Directory> subdirectories = new ArrayList<>();
        List<Directory> subdirectories2 = new ArrayList<>();
        List<String> archives;
        List<String> archives2;

        archives = new ArrayList<>(List.of("3eye.doc", "shadowGovernment.doc", "EndOfTheWorld.exe"));
        archives2 = new ArrayList<>(List.of("UFO08HJ97.PNG", "UFO43JH07.PNG", "X.exe"));

        subdirectories.add(new Directory("Illuminaty", null, archives));
        subdirectories2.add(new Directory("UFO", null, archives2));

        Directory mainDirectory = new Directory("Main Directory", subdirectories, archives);


        Node<Directory> headNode = new Node<>(mainDirectory);
        for (int i = 0; i < mainDirectory.getSubdirectory().size() ; i++) {
            headNode.next = new Node<>(mainDirectory.getSubdirectory().get(i));
            headNode.next.next = new Node<>(mainDirectory.getSubdirectory().get(i));
        }



        System.out.println("                                               \n" +
                "                                  ,-----. ,--. \n" +
                " ,--,--.,--.--. ,---.  ,--,--.    |  .--'/   | \n" +
                "' ,-.  ||  .--'| .-. :' ,-.  |    '--. `\\`|  | \n" +
                "\\ '-'  ||  |   \\   --.\\ '-'  |    .--'  / |  | \n" +
                " `--`--'`--'    `----' `--`--'    `----'  `--'");
        directoryBrowsing(headNode);
    }

    private void directoryBrowsing(Node<Directory> node) {
        int count = 1;
        if (node == null) {
            return;
        }
        System.out.println(node.data + " ");
        directoryBrowsing(node.next);
    }
}

