import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CdPlayerTest {
    @Test
    public void testCdPlayerInterceptor() {
        Dispatcher dispatcher = Dispatcher.getInstance();
        dispatcher.registerInterceptor(new PlayInterceptor());
        dispatcher.registerInterceptor(new StopInterceptor());

        ContextObject contextObject = new ContextObject();
        contextObject.setPlaying(true);
        dispatcher.dispatchButtonPushed(contextObject);
        assert(contextObject.getPlayingState());
        contextObject.setPlaying(false);
        dispatcher.dispatchButtonPushed(contextObject);
        assertFalse(contextObject.getPlayingState());
    }
}