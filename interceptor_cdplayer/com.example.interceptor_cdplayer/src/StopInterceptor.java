public class StopInterceptor implements Interceptor{
    @Override
    public void buttonPushed(ContextObject context) {
        System.out.println("Stop playing CD");
    }
}
