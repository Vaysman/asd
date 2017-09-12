package project;

import java.nio.file.Path;

/**
 * Created by mrchebik on 9/11/17.
 */
public interface Project {
    String getName();
    void setName(String name);

    Path getPath();
    void setPath(Path path);

    Path getPathOut();
    void setPathOut(Path path);

    Path getPathSource();
    void setPathSource(Path path);
}
