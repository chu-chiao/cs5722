public class CdPlayer implements IPushCallBack{
    private Button playButton;
    private Button stopButton;
    private Dispatcher dispatcher = Dispatcher.getInstance();
    private ContextObject context;
    private boolean playingStatus;

    public CdPlayer() {
        dispatcher.registerInterceptor(new PlayInterceptor());
        dispatcher.registerInterceptor(new StopInterceptor());
        context = new ContextObject(this);
    }

    public final void notifyButtonPushed(Button b) {
        // Use playButton or stopButton is pushed to distinguish it is play event or stop event
        context.setPlayEvent(b == playButton);
        dispatcher.dispatchButtonPushed(context);
    }

    public final void setPlayButton(Button b) {
        playButton = b;
    }

    public final void setStopButton(Button b) {
        stopButton = b;
    }

    public boolean getPlayingStatus() {
        return playingStatus;
    }

    public void play() {
        playingStatus = true;
        System.out.println("Play CD");
    }

    public void stop() {
        playingStatus = false;
        System.out.println("Stop playing CD");
    }
}
