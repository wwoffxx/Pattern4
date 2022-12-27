package org.example;

public class ToJpeg {
    ToJpeg() {
    }

    void ToJpeg(String pathSource) {
        System.out.println("File: " + pathSource);
        System.out.println("Converted to Jpeg");
    }

    void saveJpeg(String pathSave) {
        System.out.println("Saved into " + pathSave + "\n");
    }
}
