import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertFalse;

class CdPlayerTest {
    @Test
    public void testCdPlayerInterceptor() {
        CdPlayer cdPlayer = new CdPlayer();
        Button chooseAlbum = new Button(cdPlayer, new PutAlbumInterceptor(), ButtonType.PUT_ALBUM);
        Button playButton = new Button(cdPlayer, new PlayInterceptor(), ButtonType.PLAY);
        Button stopButton = new Button(cdPlayer, new StopInterceptor(), ButtonType.STOP);
        cdPlayer.addButton(chooseAlbum);
        cdPlayer.addButton(playButton);
        cdPlayer.addButton(stopButton);

        // Simulate user typing input
        String input = "Interceptor";
        InputStream stdin = System.in;
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(byteArrayOutputStream);
        PrintStream stdout = System.out;
        System.setOut(ps);

        chooseAlbum.push();

        System.setIn(stdin);
        System.setOut(stdout);

        // test play/stop CD
        playButton.push();
        assert(cdPlayer.getPlayingStatus());
        stopButton.push();
        assertFalse(cdPlayer.getPlayingStatus());
    }
}