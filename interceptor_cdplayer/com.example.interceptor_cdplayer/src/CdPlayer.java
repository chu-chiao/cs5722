import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CdPlayer implements IPushCallBack{
    private Dispatcher dispatcher = Dispatcher.getInstance();
    private ContextObject context;
    private boolean playingStatus;
    private List<Button> buttons;
    private String album;

    public CdPlayer() {
        context = new ContextObject(this);
        buttons = new ArrayList<>();
    }

    public final void notifyButtonPushed(Button b) {
        // Use playButton or stopButton is pushed to distinguish it is play event or stop event
        context.setButtonType(b.getButtonType());
        dispatcher.dispatchButtonPushed(context);
    }

    public final void addButton(Button b) {
        buttons.add(b);
        dispatcher.registerInterceptor(b.getInterceptor());
    }

    public boolean getPlayingStatus() {
        return playingStatus;
    }

    public void play() {
        if (album == null) {
            System.out.println("Please choose an album to play.");
            return;
        }
        playingStatus = true;
        System.out.println("Play CD: " + album);
    }

    public void stop() {
        playingStatus = false;
        System.out.println("Stop playing CD");
    }

    public void setAlbum() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter album");

        String albumName = scanner.nextLine();
        System.out.println("The album is: " + albumName);
        this.album = albumName;
    }

    public String getAlbum() {
        return this.album;
    }
}
