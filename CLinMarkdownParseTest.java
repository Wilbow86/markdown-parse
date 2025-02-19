//test file from clingunis for lab
import static org.junit.Assert.*;
import org.junit.*;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;


public class ClinMarkdownParseTest {
    @Test
    public void addition() {
        assertEquals(2, 1 + 1);
    }
    @Test
    public void testGetLinks1() throws IOException{
        String file=Files.readString(Path.of("test-file.md"));
        assertEquals(MarkdownParse.getLinks(file), List.of("https://something.com","some-page.html"));
    }
    @Test
    public void testGetLinks2() throws IOException{
        String file=Files.readString(Path.of("test-file2.md"));
        assertEquals(MarkdownParse.getLinks(file), 
        List.of("https://something.com","some-page.html"));
    }
    @Test
    public void testGetLinks3() throws IOException{
        String file=Files.readString(Path.of("test-file3.md"));
        assertEquals(MarkdownParse.getLinks(file), 
        List.of());
    }
    @Test
    public void testGetLinksBulk() throws IOException{
        String file=Files.readString(Path.of("test-file4.md"));
        assertEquals(MarkdownParse.getLinks(file),List.of());
        file=Files.readString(Path.of("test-file6.md"));
        assertEquals(MarkdownParse.getLinks(file),List.of());
        file=Files.readString(Path.of("test-file7.md"));
        assertEquals(MarkdownParse.getLinks(file),List.of());
        //tests below are bugged
        file=Files.readString(Path.of("test-file8.md"));
        assertEquals(MarkdownParse.getLinks(file),List.of("a link on the first line"));
        file=Files.readString(Path.of("test-file5.md"));
        assertEquals(MarkdownParse.getLinks(file),List.of());
    }
    /*
    public void testGetLinks5() throws IOException{
        String file=Files.readString(Path.of("breakingTest.md"));
        assertEquals(MarkdownParse.getLinks(file), 
        List.of("https://something.com", "some-page.html", "", "www.google.com/test"));
    }*/
}
