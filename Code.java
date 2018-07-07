public class FakeCBServer extends Plugin implements Listener {

    private ServerPing.Protocol protocol;

    public void onEnable() {
        this.protocol = new ServerPing.Protocol("CheatBreaker", -1332);
        this.getProxy().getPluginManager().registerListener((Plugin)this, (Listener)this);
    }
    
    @EventHandler
    public void onProxyPing(final ProxyPingEvent event) {
        event.getResponse().setVersion(this.protocol);
    }
    
}
