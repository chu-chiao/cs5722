public class Client {
    public static void main(String[] args) {
        CdPlayer cdPlayer = new CdPlayer();
        Button playButton = new Button(cdPlayer, new PlayInterceptor());
        Button stopButton = new Button(cdPlayer, new StopInterceptor());
        cdPlayer.setPlayButton(playButton);
        cdPlayer.setStopButton(stopButton);
        playButton.push();
        stopButton.push();
    }
}