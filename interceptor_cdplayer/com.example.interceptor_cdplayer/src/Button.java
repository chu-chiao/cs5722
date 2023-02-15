public class Button {
    private IPushCallBack iPushCallBack;
    public Button(IPushCallBack ipcb) {
        iPushCallBack = ipcb;
    }
    public final void push() {
        iPushCallBack.notifyButtonPushed(this);
    }
}
