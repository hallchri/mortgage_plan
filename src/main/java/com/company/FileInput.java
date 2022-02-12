package com.company;

import java.io.*;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class FileInput {
    public static List<String> readFile(String path) {
        List<String> list = new ArrayList<>();
        String rePattern = "(?<=\")([^\"]+?),([^\"]+?)(?=\")";

        try {
            BufferedReader br = new BufferedReader(new FileReader(path));
            br.readLine(); // read first line as to skip it
            String st;

            while ((st = br.readLine()) != null)
                list.add(st);

            for(int i = 0; i < list.size(); i++) {
                list.set(i, list.get(i).replaceAll(rePattern, "$1 $2"));
                list.set(i, list.get(i).replaceAll("\"", ""));
            }

        } catch (IOException | NullPointerException e) {
            e.printStackTrace();
        }

        return list;
    }
}
