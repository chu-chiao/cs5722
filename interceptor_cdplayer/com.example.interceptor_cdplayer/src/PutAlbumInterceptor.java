public class PutAlbumInterceptor implements IInterceptor{
    @Override
    public void buttonPushed(ContextObject context) {
        if (context.getButtonType() == ButtonType.PUT_ALBUM)
            context.setAlbum();
    }
}

