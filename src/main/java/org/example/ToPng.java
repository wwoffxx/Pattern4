package org.example;

public class ToPng {
    ToPng() {
    }

    void ToPng(String pathSource) {
        System.out.println("File: " + pathSource);
        System.out.println("Converted to PNG");
    }

    void savePng(String pathSave) {
        System.out.println("Saved into " + pathSave + "\n");
    }
}
