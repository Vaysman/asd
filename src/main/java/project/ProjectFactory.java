package project;

import com.google.inject.assistedinject.Assisted;

import java.nio.file.Path;

/**
 * Created by mrchebik on 9/12/17.
 */
public interface ProjectFactory {
    Project create(String name,
                   // указывать идентификатор нужно, так как типы совпадают
                   @Assisted("path") Path path,
                   @Assisted("pathOut") Path pathOut,
                   @Assisted("pathSource") Path pathSource);
}
