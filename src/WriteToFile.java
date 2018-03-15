import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;


public class WriteToFile {

	public WriteToFile(String path)
	{
		try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(path));
            bw.write("hello");   //Ð´ÈëcharÊý×é
            bw.close();
        } catch (IOException e1) {
            // TODO Auto-generated catch block
            e1.printStackTrace();
        }
	}
}
