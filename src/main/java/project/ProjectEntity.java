package project;

import com.google.inject.Inject;
import com.google.inject.assistedinject.Assisted;

import java.nio.file.Path;

/**
 * Created by mrchebik on 8/29/17.
 */
public class ProjectEntity implements Project {
    private String name;
    private Path path;

    private Path pathOut;

    private Path pathSource;

    @Inject
    public ProjectEntity(@Assisted String name,
                         @Assisted Path path,
                         @Assisted Path pathOut,
                         @Assisted Path pathSource) {
        this.name = name;
        this.path = path;
        this.pathOut = pathOut;
        this.pathSource = pathSource;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public Path getPath() {
        return path;
    }

    @Override
    public void setPath(Path path) {
        this.path = path;
    }

    @Override
    public Path getPathOut() {
        return pathOut;
    }

    @Override
    public void setPathOut(Path pathOut) {
        this.pathOut = pathOut;
    }

    @Override
    public Path getPathSource() {
        return pathSource;
    }

    @Override
    public void setPathSource(Path pathSource) {
        this.pathSource = pathSource;
    }
}