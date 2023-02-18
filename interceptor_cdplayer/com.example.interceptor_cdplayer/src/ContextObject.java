public class ContextObject {
    private CdPlayer target;
    private boolean isPlayEvent;

    public ContextObject(CdPlayer target) {
        this.target = target;
    }

    public boolean getPlayEvent() {
        return isPlayEvent;
    }

    public void setPlayEvent(boolean playEvent) {
        this.isPlayEvent = playEvent;
    }

    public void playTrack() {
        if (!this.target.getPlayingStatus())
            this.target.play();
    }

    public void stopTrack() {
        if (this.target.getPlayingStatus())
            this.target.stop();
    }

}
