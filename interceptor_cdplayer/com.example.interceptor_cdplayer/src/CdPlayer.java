public class CdPlayer implements IPushCallBack{
    private Button playButton;
    private Button stopButton;
    private Dispatcher dispatcher = Dispatcher.getInstance();
    private ContextObject context;
    private boolean status;

    public CdPlayer() {
        dispatcher.registerInterceptor(new PlayInterceptor());
        dispatcher.registerInterceptor(new StopInterceptor());
        context = new ContextObject(this);
    }

    public final void notifyButtonPushed(Button b) {
        context.setPlay(b == playButton);
        dispatcher.dispatchButtonPushed(context);
    }

    public final void setPlayButton(Button b) {
        playButton = b;
    }

    public final void setStopButton(Button b) {
        stopButton = b;
    }

    public boolean getStatus() {
        return status;
    }

    public void play() {
        status = true;
        System.out.println("Play CD");
    }

    public void stop() {
        status = false;
        System.out.println("Stop playing CD");
    }
}
