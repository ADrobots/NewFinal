import java.nio.file.Path;
import java.util.List;
import java.util.Map;

public interface WorkWithFile {

    List<String> readFile(Path path);
    boolean writeFile(Map<String, String> text, String path);

}
