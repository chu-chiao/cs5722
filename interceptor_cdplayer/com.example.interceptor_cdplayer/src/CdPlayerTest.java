import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

class CdPlayerTest {
    @Test
    public void testCdPlayerInterceptor() {
        CdPlayer cdPlayer = new CdPlayer();
        Button chooseAlbum = new Button(cdPlayer, new PutAlbumInterceptor(), ButtonType.PUT_ALBUM);
        cdPlayer.addButton(chooseAlbum);

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
        Assertions.assertEquals(input, cdPlayer.getAlbum());
    }
}