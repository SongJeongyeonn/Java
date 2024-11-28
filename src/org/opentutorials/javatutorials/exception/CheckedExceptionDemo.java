package org.opentutorials.javatutorials.exception;
import java.io.*;
public class CheckedExceptionDemo {
    public static void main(String[] args) throws IOException {
        BufferedReader bReader = new BufferedReader(new FileReader("out.txt"));
        String input = bReader.readLine();
        System.out.println(input);
    }
}