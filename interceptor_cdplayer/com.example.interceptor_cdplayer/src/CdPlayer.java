public class CdPlayer {
    private Dispatcher dispatcher = Dispatcher.getInstance();
    private ContextObject context = new ContextObject();

    public CdPlayer() {
        dispatcher.registerInterceptor(new PlayInterceptor());
        dispatcher.registerInterceptor(new StopInterceptor());
    }

    public void play() {
        context.setPlaying(true);
        dispatcher.dispatchButtonPushed(context);
    }

    public void stop() {
        context.setPlaying(false);
        dispatcher.dispatchButtonPushed(context);
    }

}
