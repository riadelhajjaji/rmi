import java.net.MalformedURLException;
import java.rmi.registry.LocateRegistry;
import java.rmi.*;
public class ServeurRMI{
    public static void main(String[] args)throws RemoteException, MalformedURLException {
        LocateRegistry.createRegistry(1099);
        BanqueRMIService banqueRMIService=new BanqueRMIService();
        Naming.rebind("riad",banqueRMIService);
        System.out.println(banqueRMIService);


    }
}
