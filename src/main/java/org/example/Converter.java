package org.example;

class Converter {
    Converter() {
    }

    public void converter(String pathSource, Extension format, String pathSave) {
        switch (format) {
            case JPEG:
                ToJpeg ToJpeg = new ToJpeg();
                ToJpeg.ToJpeg(pathSource);
                ToJpeg.saveJpeg(pathSave);
                break;
            case PNG:
                ToPng pngConvert = new ToPng();
                pngConvert.ToPng(pathSource);
                pngConvert.savePng(pathSave);
        }

    }
}
