package internship;

import java.io.BufferedReader;
import java.io.FileReader;
import javax.swing.JOptionPane;


public class WordCounter 
{
    public static void main(String[] args) throws Exception
	{
		String line;
		int count =0;
                
		FileReader fr= new FileReader("D:/PECE8/Intern/File2.txt");
	        BufferedReader br= new BufferedReader(fr);

		while((line=br.readLine()) != null)
		{
			String words[] =line.split(" ");
			count= count+words.length;
		}
                JOptionPane.showMessageDialog(null, "Number of words present in given file : "+count);

		br.close();
	}
}
