import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CdPlayerTest {
    @Test
    public void testCdPlayerInterceptor() {
        Dispatcher dispatcher = Dispatcher.getInstance();
        dispatcher.registerInterceptor(new PlayInterceptor());
        dispatcher.registerInterceptor(new StopInterceptor());

        ContextObject contextObject = new ContextObject();
        dispatcher.dispatchButtonPushed(contextObject);
        assertFalse(contextObject.getPlayingState());
    }
}