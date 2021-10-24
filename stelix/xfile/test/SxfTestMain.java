package stelix.xfile.test;

import stelix.xfile.reader.SxfReader;

import java.io.File;


public class Main {

    public static void main(String[] args) {

        SxfReader.readFile(new File("test.sxf"));

    }
}
