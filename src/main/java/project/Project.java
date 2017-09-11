package project;

import java.nio.file.Path;

/**
 * Created by mrchebik on 9/11/17.
 */
public interface Project {
    void setName(String name);
    void setPath(Path path);
    void setPathOut(Path path);
    void setPathSource(Path path);

    String getName();
    Path getPath();
    Path getPathOut();
    Path getPathSource();
}