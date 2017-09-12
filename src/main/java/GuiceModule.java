import com.google.inject.AbstractModule;
import com.google.inject.assistedinject.FactoryModuleBuilder;
import project.*;

/**
 * Created by mrchebik on 9/11/17.
 */
public class GuiceModule extends AbstractModule {
    @Override
    protected void configure() {
        // этот бинд не нужен так как используется фабрика
        // bind(Project.class).to(ProjectEntity.class);

        // это добавил, что бы показать как отличаются Inject и Assisted
        bind(Dummy.class).to(DummyImpl.class);

        install(new FactoryModuleBuilder()
                .implement(Project.class, ProjectEntity.class)
                .build(ProjectFactory.class));
    }
}
