public class PlayInterceptor implements IInterceptor {
    @Override
    public void buttonPushed(ContextObject context) {
        if (context.getPlayEvent()) {
            context.playTrack();
        }
    }
}
