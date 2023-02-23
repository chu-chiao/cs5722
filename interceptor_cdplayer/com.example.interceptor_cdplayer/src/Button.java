public class Button {
    private IPushCallBack iPushCallBack;
    private IInterceptor iInterceptor;
    private ButtonType buttonType;
    public Button(IPushCallBack ipcb, IInterceptor iInterceptor, ButtonType buttonType) {
        this.iPushCallBack = ipcb;
        this.iInterceptor = iInterceptor;
        this.buttonType = buttonType;
    }
    public final void push() {
        this.iPushCallBack.notifyButtonPushed(this);
    }
    public IInterceptor getInterceptor() {
        return this.iInterceptor;
    }
    public ButtonType getButtonType() {
        return this.buttonType;
    }
}
