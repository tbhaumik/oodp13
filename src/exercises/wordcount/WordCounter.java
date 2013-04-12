package exercises.wordcount;

import javax.swing.JFileChooser;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class WordCounter {
    public WordCounter(){

    }

    public WordCounter(List<String> stop, List<String> text){

    }

    public String getWord(int i, boolean includeStopWords){
        return null;
    }

    public int getWordCount(){
        return 0;
    }

    public int getRank(String word, boolean includeStopWords){
        return 0;
    }

    public static ArrayList<String> loadFile(String message) throws IOException {
        BufferedReader reader = null;
        ArrayList lines = null;
        JFileChooser chooser = new JFileChooser();

        chooser.setDialogTitle(message);
        int result = chooser.showOpenDialog(null);
        if (result == JFileChooser.APPROVE_OPTION) {
            File file = chooser.getSelectedFile();
            if (file != null) {
                String fileName = file.getCanonicalPath();
                reader = new BufferedReader(new FileReader(fileName));
                lines = new ArrayList<String>();
                String line = reader.readLine();
                while (line != null) {
                    lines.add(line);
                    line = reader.readLine();
                }
            }
        }
        return lines;
    }
}
