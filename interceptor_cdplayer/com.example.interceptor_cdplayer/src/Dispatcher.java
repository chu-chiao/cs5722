import java.util.ArrayList;
import java.util.List;

public class Dispatcher {
    private List<Interceptor> interceptors;

    public Dispatcher() {
        this.interceptors = new ArrayList<>();
    }

    public void registerInterceptor(Interceptor interceptor) {
        this.interceptors.add(interceptor);
    }

    public void removeInterceptor(Interceptor interceptor) {
        this.interceptors.add(interceptor);
    }

    public void dispatchButtonPushed(ContextObject context) {
        for (Interceptor interceptor : interceptors) {
            interceptor.buttonPushed(context);
        }
    }
}
