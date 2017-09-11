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

    @Inject
    public ProjectEntity(@Assisted String name, @Assisted Path path) {
        this.name = name;
        this.path = path;
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
}
