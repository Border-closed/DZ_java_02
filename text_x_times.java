////С помощью Java создать файл file.txt, и записать в него слово TEST 100 раз.
// Если уже файл создан, то перезаписываем его.

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
public class text_x_times {
    public static void main(String[] args) {
        
        try(FileWriter writer = new FileWriter("x.txt", false))
        {
           // запись всей строки
           String text = "TEXT";
           for (int i = 0; i < 100; i++) {
            writer.write(text);
            writer.append('\n');
           } 
            writer.flush();
        }
        catch(IOException ex){
             
            System.out.println(ex.getMessage());
        } 
    } 
}
