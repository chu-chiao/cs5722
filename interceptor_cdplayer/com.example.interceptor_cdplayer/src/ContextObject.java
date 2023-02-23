public class ContextObject {
    private CdPlayer target;
    private ButtonType buttonType;

    public ContextObject(CdPlayer target) {
        this.target = target;
    }

    public ButtonType getButtonType() {
        return buttonType;
    }

    public void setButtonType(ButtonType buttonType) {
        this.buttonType = buttonType;
    }

    public void playTrack() {
        if (!this.target.getPlayingStatus())
            this.target.play();
    }

    public void stopTrack() {
        if (this.target.getPlayingStatus())
            this.target.stop();
    }

    public void setAlbum() {
        this.target.setAlbum();
    }

}
