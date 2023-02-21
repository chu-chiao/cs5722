public class Button {
    private IPushCallBack iPushCallBack;
    private IInterceptor iInterceptor;
    public Button(IPushCallBack ipcb, IInterceptor iInterceptor) {
        this.iPushCallBack = ipcb;
        this.iInterceptor = iInterceptor;
    }
    public final void push() {
        this.iPushCallBack.notifyButtonPushed(this);
    }
    public IInterceptor getInterceptor() {
        return this.iInterceptor;
    }
}
