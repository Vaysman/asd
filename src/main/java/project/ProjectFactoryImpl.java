package project;

import java.nio.file.Path;

/**
 * Created by mrchebik on 9/12/17.
 */
public class ProjectFactoryImpl implements ProjectFactory {
    @Override
    public Project create(String name, Path path) {
        return new ProjectEntity(name, path);
    }
}
