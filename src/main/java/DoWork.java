import com.google.inject.Inject;
import project.Project;
import project.ProjectFactory;

import java.io.File;

public class DoWork {
    @Inject
    private ProjectFactory factory;

    public void doIt() {
        Project project = factory.create("name",
                new File("path").toPath(),
                new File("pathOut").toPath(),
                new File("pathSource").toPath());
        System.out.println(project.getName());
    }
}
