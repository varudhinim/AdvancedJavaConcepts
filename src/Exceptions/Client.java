package Exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Client {
    public static void main(String[] args) throws IOException {
        System.out.println("Hello World");
        System.out.println("Hello ");
        File f = new File("abc.txt");
        System.out.println("gyughiu");
        FileReader fr = new FileReader(f);
        System.out.println("Hi");
        System.out.println(fr.read());
        fr.read();
    }
}
