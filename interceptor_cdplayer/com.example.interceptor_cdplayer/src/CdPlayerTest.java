import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CdPlayerTest {
    @Test
    public void testCdPlayerInterceptor() {
        CdPlayer cdPlayer = new CdPlayer();
        Button playButton = new Button(cdPlayer, new PlayInterceptor());
        Button stopButton = new Button(cdPlayer, new StopInterceptor());
        cdPlayer.setPlayButton(playButton);
        cdPlayer.setStopButton(stopButton);
        playButton.push();
        assert(cdPlayer.getPlayingStatus());
        stopButton.push();
        assertFalse(cdPlayer.getPlayingStatus());
    }
}