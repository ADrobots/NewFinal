import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class FileForPromoMessage implements WorkWithFile {

    @Override
    public List<String> readFile(Path path) {

        try {
            return  Files.readAllLines(path);

        } catch (IOException e) {
            e.printStackTrace();
            return new ArrayList<>();
        }
    }

    @Override
    public boolean writeFile(Map<String,String> text, String path) {
        try {

            for(Map.Entry entry: text.entrySet()) {
                Files.write(Paths.get(path + "/"+entry.getKey()+".txt"), entry.getValue().toString().getBytes());

            }
            return true;
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }

}
