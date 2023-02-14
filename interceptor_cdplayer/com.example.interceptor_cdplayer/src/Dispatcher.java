import java.util.ArrayList;
import java.util.List;

public class Dispatcher {
    private List<Interceptor> interceptors;
    private static Dispatcher dispatcher;

    public Dispatcher() {
        this.interceptors = new ArrayList<>();
    }

    public static Dispatcher getInstance() {
        if (dispatcher == null) {
            dispatcher = new Dispatcher();
        }
        return dispatcher;
    }

    public void registerInterceptor(Interceptor interceptor) {
        this.interceptors.add(interceptor);
    }

    public void removeInterceptor(Interceptor interceptor) {
        this.interceptors.add(interceptor);
    }

    public void dispatchButtonPushed(ContextObject context) {
        for (Interceptor interceptor : interceptors) {
            if (context.getPlayingState()) {
                if (interceptor instanceof PlayInterceptor) interceptor.buttonPushed(context);
            } else {
                if (interceptor instanceof StopInterceptor) interceptor.buttonPushed(context);
            }
        }
    }
}
