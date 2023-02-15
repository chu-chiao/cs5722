import java.util.ArrayList;
import java.util.List;

public class Dispatcher {
    private List<IInterceptor> interceptors;
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

    public void registerInterceptor(IInterceptor interceptor) {
        this.interceptors.add(interceptor);
    }

    public void removeInterceptor(IInterceptor interceptor) {
        this.interceptors.add(interceptor);
    }

    public void dispatchButtonPushed(ContextObject context) {
        for (IInterceptor interceptor : interceptors) {
            interceptor.buttonPushed(context);
        }
    }
}
