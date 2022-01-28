import static org.junit.Assert.*;
import org.junit.*;

import java.nio.file.Files;
import java.nio.file.Path;

import java.io.IOException;
import java.util.ArrayList;

public class MarkdownParseTest {
    @Test
    public void addition() {
        assertEquals(2, 1 + 1);
    }
    @Test
    public void testTest2() throws IOException{
        
        Path fileName = Path.of("C:\\Users\\ethrw\\OneDrive\\Documents\\GitHub\\markdown-parse\\test2.md");
	    String contents = Files.readString(fileName);
        ArrayList<String> ls = new ArrayList<String>();
        ls.add("https://1");
        ls.add("https://2");
        assertEquals(ls, MarkdownParse.getLinks(contents));
    }
}