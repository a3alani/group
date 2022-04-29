import static org.junit.Assert.*;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import org.junit.*;

public class MarkdownParseTest {
    @Test
    public void addition() {
    assertEquals(2, 1 + 1);
    }

    // @Test
    // public void getLinkstest-file(){
    //     String[] ans = new String
    // }
    @Test
    public void test1() throws IOException{
        String file1 = Files.readString(Path.of("test-file1.md"));
        ArrayList<String> links2 = MarkdownParse.getLinks(file1);
        assertEquals(List.of("some-thing.html"),links2);
    }
    @Test
    public void test2() throws IOException{
        String file = Files.readString(Path.of("test-file.md"));
        ArrayList<String> links1 = MarkdownParse.getLinks(file);
        assertEquals(List.of("https://something.com","some-thing.html"),
        links1);
    }
}