public class StopInterceptor implements IInterceptor {
    @Override
    public void buttonPushed(ContextObject context) {
        if (context.getButtonType() == ButtonType.STOP) {
            context.stopTrack();
        }

    }
}
