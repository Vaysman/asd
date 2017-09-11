import com.google.inject.AbstractModule;
import com.google.inject.assistedinject.FactoryModuleBuilder;
import project.Project;
import project.ProjectEntity;
import project.ProjectFactory;
import project.ProjectFactoryImpl;

/**
 * Created by mrchebik on 9/11/17.
 */
public class GuiceModule extends AbstractModule {
    @Override
    protected void configure() {
        bind(Project.class).to(ProjectEntity.class);
        bind(ProjectFactory.class).to(ProjectFactoryImpl.class);

        install(new FactoryModuleBuilder()
                .implement(Project.class, ProjectEntity.class)
                .build(ProjectFactory.class));
    }
}
