package ec.edu.lexus.appdependencyinyectionexample;

import android.content.Context;

import javax.inject.Named;

import dagger.Module;
import dagger.Provides;

/**
 * Creamos el modulo que ayudar'a a crear la DI de lo que necesitmos, en nuestro caso el contexto y sus respectivas
 * Strings de actividad
 * Created by Alexis on 10/10/2017.
 */
@Module
public class MainModule {

    private Context context;

    public MainModule(Context context ) {
        this.context = context;
    }

    @Provides
    Context provideContext() {
        return context;
    }

    @Named("hi")
    @Provides
    String provideHi() {
        return "Hello!";
    }

    @Named("bye")
    @Provides
    String provideDye() {
        return "Good bye!!";
    }

    @Named("question")
    @Provides
    String provideQuestion() {
        return "What's your name???";
    }
}