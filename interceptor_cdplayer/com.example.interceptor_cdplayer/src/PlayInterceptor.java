public class PlayInterceptor implements Interceptor{
    @Override
    public void buttonPushed(ContextObject context) {
        System.out.println("Play CD");
        context.setPlaying(true);
    }
}
