package src.home_work.LEC27.proxy;

public class ProxyUsage {
    public static void main(String[] args) {
        Session session = new SessionProxy("john_doe");

        // Доступ до ресурсів через проксі
        session.accessResource("document1");
        session.accessResource("document2");
    }
}
