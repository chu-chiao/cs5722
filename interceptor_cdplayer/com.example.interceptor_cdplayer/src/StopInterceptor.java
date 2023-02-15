public class StopInterceptor implements IInterceptor {
    @Override
    public void buttonPushed(ContextObject context) {
        CdPlayer cdPlayer = (CdPlayer) context.getTarget();
        if (cdPlayer.getStatus() && !context.getPlay()) {
            cdPlayer.stop();
        }

    }
}
