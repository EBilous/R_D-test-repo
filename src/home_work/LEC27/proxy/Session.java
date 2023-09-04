package src.home_work.LEC27.proxy;

interface Session {
    void accessResource(String resource);
}

class SessionImpl implements Session {
    private final String username;

    public SessionImpl(String username) {
        this.username = username;
        System.out.println("User " + username + " logged in.");
    }

    public void accessResource(String resource) {
        System.out.println("User " + username + " is accessing resource: " + resource);
    }
}
