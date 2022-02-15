import static org.junit.Assert.*;
import org.junit.*;

import java.nio.file.Files;
import java.nio.file.Path;

import java.io.IOException;
import java.util.ArrayList;

public class CLinMarkdownParseTest {
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
    @Test
    public void testTest1() throws IOException{
        
        Path fileName = Path.of("C:\\Users\\ethrw\\OneDrive\\Documents\\GitHub\\markdown-parse\\test1.md");
	    String contents = Files.readString(fileName);
        ArrayList<String> ls = new ArrayList<String>();
        ls.add("https://aaaaaaaa");
        assertEquals(ls, MarkdownParse.getLinks(contents));
    }
    @Test
    public void testTest3() throws IOException{
        
        Path fileName = Path.of("C:\\Users\\ethrw\\OneDrive\\Documents\\GitHub\\markdown-parse\\test3.md");
	    String contents = Files.readString(fileName);
        ArrayList<String> ls = new ArrayList<String>();
        ls.add("https://aaaaaaaabbb");
        ls.add("https://aaaaaaaabbc");
        ls.add("https://aaaaaaaa");
        assertEquals(ls, MarkdownParse.getLinks(contents));
    }
    @Test
    public void testTestFile2() throws IOException{
        
        Path fileName = Path.of("C:\\Users\\ethrw\\OneDrive\\Documents\\GitHub\\markdown-parse\\test-file2.md");
	    String contents = Files.readString(fileName);
        ArrayList<String> ls = new ArrayList<String>();
        ls.add("https://something.com");
        ls.add("some-page.html");
        assertEquals(ls, MarkdownParse.getLinks(contents));
    }
    @Test
    public void testTestFile3() throws IOException{
        
        Path fileName = Path.of("C:\\Users\\ethrw\\OneDrive\\Documents\\GitHub\\markdown-parse\\test-file3.md");
	    String contents = Files.readString(fileName);
        ArrayList<String> ls = new ArrayList<String>();

        assertEquals(ls, MarkdownParse.getLinks(contents));
    }
    @Test
    public void testTestFile4() throws IOException{
        
        Path fileName = Path.of("C:\\Users\\ethrw\\OneDrive\\Documents\\GitHub\\markdown-parse\\test-file4.md");
	    String contents = Files.readString(fileName);
        ArrayList<String> ls = new ArrayList<String>();
        
        assertEquals(ls, MarkdownParse.getLinks(contents));
    }
    @Test
    public void testTestFile5() throws IOException{
        
        Path fileName = Path.of("C:\\Users\\ethrw\\OneDrive\\Documents\\GitHub\\markdown-parse\\test-file5.md");
	    String contents = Files.readString(fileName);
        ArrayList<String> ls = new ArrayList<String>();
        
        assertEquals(ls, MarkdownParse.getLinks(contents));
    }
    @Test
    public void testTestFile6() throws IOException{
        
        Path fileName = Path.of("C:\\Users\\ethrw\\OneDrive\\Documents\\GitHub\\markdown-parse\\test-file6.md");
	    String contents = Files.readString(fileName);
        ArrayList<String> ls = new ArrayList<String>();
        
        assertEquals(ls, MarkdownParse.getLinks(contents));
    }
    @Test
    public void testTestFile7() throws IOException{
        
        Path fileName = Path.of("C:\\Users\\ethrw\\OneDrive\\Documents\\GitHub\\markdown-parse\\test-file7.md");
	    String contents = Files.readString(fileName);
        ArrayList<String> ls = new ArrayList<String>();
        
        assertEquals(ls, MarkdownParse.getLinks(contents));
    }
    @Test
    public void testTestFile8() throws IOException{
        
        Path fileName = Path.of("C:\\Users\\ethrw\\OneDrive\\Documents\\GitHub\\markdown-parse\\test-file8.md");
	    String contents = Files.readString(fileName);
        ArrayList<String> ls = new ArrayList<String>();
        ls.add("a link on the first line");
        
        assertEquals(ls, MarkdownParse.getLinks(contents));
    }
}
