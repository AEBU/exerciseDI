package ec.edu.lexus.appdependencyinyectionexample;

import dagger.Component;

/**
 * Created by Alexis on 10/10/2017.
 */
@Component (modules={MainModule.class})
public interface MainComponent {
    void inject(MainActivity mainActivity);
}
