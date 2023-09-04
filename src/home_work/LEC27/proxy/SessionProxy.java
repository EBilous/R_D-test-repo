package src.home_work.LEC27.proxy;

class SessionProxy implements Session {
    private final String username;
    private SessionImpl realSession;

    public SessionProxy(String username) {
        this.username = username;
    }

    public void accessResource(String resource) {
        if (realSession == null) {
            realSession = new SessionImpl(username);
        }
        realSession.accessResource(resource);
    }
}
