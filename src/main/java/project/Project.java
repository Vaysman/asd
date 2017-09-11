package project;

import java.nio.file.Path;

/**
 * Created by mrchebik on 9/11/17.
 */
public interface Project {
    void setName(String name);
    void setPath(Path path);

    String getName();
    Path getPath();
}
