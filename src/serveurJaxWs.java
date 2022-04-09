import ws.BanqueService;

import javax.xml.ws.Endpoint;

public class serveurJaxWs {
    public static void main(String[] args) {
        String url = "http://localhost:9090/";
        Endpoint.publish(url,new BanqueService());
        System.out.println("web service deploye sur: "+url);
    }
}
