public class ContextObject {
    private CdPlayer target;
    private boolean play;

    public ContextObject(CdPlayer target) {
        this.target = target;
    }

    public CdPlayer getTarget() {
        return target;
    }

    public void setTarget(CdPlayer target) {
        this.target = target;
    }

    public boolean getPlay() {
        return play;
    }

    public void setPlay(boolean play) {
        this.play = play;
    }

}
