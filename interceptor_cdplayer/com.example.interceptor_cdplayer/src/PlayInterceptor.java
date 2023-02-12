public class PlayInterceptor implements Interceptor{
    @Override
    public void buttonPushed(ContextObject context) {
        System.out.println("Playing CD");
        context.setPlaying(true);
    }
}
