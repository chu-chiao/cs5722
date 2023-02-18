public class StopInterceptor implements IInterceptor {
    @Override
    public void buttonPushed(ContextObject context) {
        if (!context.getPlayEvent()) {
            context.stopTrack();
        }

    }
}
