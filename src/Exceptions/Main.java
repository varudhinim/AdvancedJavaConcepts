package Exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        doSomthing();


    }
    public static void doSomthing(){
        try{
            File f = new File("abc.txt");
            FileReader fr = new FileReader(f);
            fr.read();
            Scanner sc = new Scanner(System.in);
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = a/b;
            System.out.println(c);
        } catch (FileNotFoundException e) {
            System.out.println("File not found Exception");
            // throw new RuntimeException(e);
        } catch (IOException e) {
            System.out.println("I/O Error exception called ");
            //throw new RuntimeException(e);
        }catch (InputMismatchException e) {
            System.out.println("Input Mismatch exception called");
        }catch (ArithmeticException e) {
            System.out.println("Arithmetic Error exception called ");
        }catch(Exception e){
            System.out.println("Exception block called");
        }finally {
            System.out.println("Finally block called ");
        }
        System.out.println("After Try catch block");
    }
}
