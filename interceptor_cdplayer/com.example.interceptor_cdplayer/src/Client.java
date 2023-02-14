public class Client {
    public static void main(String[] args) {
        Dispatcher dispatcher = Dispatcher.getInstance();
        dispatcher.registerInterceptor(new PlayInterceptor());
        dispatcher.registerInterceptor(new StopInterceptor());

        ContextObject contextObject = new ContextObject();
        dispatcher.dispatchButtonPushed(contextObject);
        System.out.println("status: " + contextObject.getPlayingState());
    }
}