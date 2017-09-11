package project;

import project.Project;

import java.nio.file.Path;

/**
 * Created by mrchebik on 9/12/17.
 */
public interface ProjectFactory {
    Project create(String name, Path path, Path pathOut, Path pathSource);
}
