package net.codejava.io;
 
import java.io.FileReader;
import java.io.IOException;
 
/**
 * This program demonstrates how to read characters from a text file.
 * @author www.codejava.net
 *
 */
public class TextFileReadingExample1 {
 
    public static void main(String[] args) {
        try {
            FileReader reader = new FileReader("Fashion.txt");
            int character;
 
            while ((character = reader.read()) != -1) {
              //  System.out.print((char) character);
            }
         System.out.print("Hi");
            reader.close();
 System.out.println("Object has been deserialized 
                    System.out.println("Object has been eserialized ");
            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
 
}
