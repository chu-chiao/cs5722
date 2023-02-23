public class Client {
    public static void main(String[] args) {
        CdPlayer cdPlayer = new CdPlayer();
        Button putAlbum = new Button(cdPlayer, new PutAlbumInterceptor(), ButtonType.PUT_ALBUM);
        Button playButton = new Button(cdPlayer, new PlayInterceptor(), ButtonType.PLAY);
        Button stopButton = new Button(cdPlayer, new StopInterceptor(), ButtonType.STOP);
        cdPlayer.addButton(putAlbum);
        cdPlayer.addButton(playButton);
        cdPlayer.addButton(stopButton);
        putAlbum.push();
        playButton.push();
        stopButton.push();
    }
}