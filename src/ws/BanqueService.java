package ws;

import metier.compte;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@WebService(serviceName = "banqueWs")
public class BanqueService {
    @WebMethod(operationName = "ConversionEuroDhs")
    public double convertion(@WebParam(name = "montant") double mt){
        double v = mt * 10;
        return v;
    }
    @WebMethod(operationName = "getCompte")
    public compte getCompte (@WebParam(name = "Code") long code){
        return new compte(code,Math.random()*10000,new Date());
    }
    @WebMethod
    public List<compte> listeComptes(){
        List<compte> comptes = new ArrayList<>();
        comptes.add(new compte(1L,Math.random()*10000,new Date()));
        comptes.add(new compte(2L,Math.random()*10000,new Date()));
        comptes.add(new compte(3L,Math.random()*10000,new Date()));
        return comptes;
    }
}
