import com.google.inject.Guice;

/**
 * Created by mrchebik on 9/12/17.
 */
public class Main {
    public static void main(String[] args) {
        Guice.createInjector(new GuiceModule());
    }
}
