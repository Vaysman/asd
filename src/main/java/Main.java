import com.google.inject.Guice;
import com.google.inject.Injector;

/**
 * Created by mrchebik on 9/12/17.
 */
public class Main {
    public static void main(String[] args) {
        final Injector injector = Guice.createInjector(new GuiceModule());
        DoWork main = injector.getInstance(DoWork.class);
        main.doIt();
    }
}
