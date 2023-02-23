public class PlayInterceptor implements IInterceptor {
    @Override
    public void buttonPushed(ContextObject context) {
        if (context.getButtonType() == ButtonType.PLAY) {
            context.playTrack();
        }
    }
}
