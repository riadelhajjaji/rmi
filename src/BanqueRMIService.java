import java.rmi.RemoteException;
import java.rmi.server.RMIClientSocketFactory;
import java.rmi.server.RMIServerSocketFactory;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;

public class BanqueRMIService extends UnicastRemoteObject implements IBanqueRemote {
    protected BanqueRMIService() throws RemoteException {
    }

    protected BanqueRMIService(int port) throws RemoteException {
        super(port);
    }

    protected BanqueRMIService(int port, RMIClientSocketFactory csf, RMIServerSocketFactory ssf) throws RemoteException {
        super(port, csf, ssf);
    }

    @Override
    public double conversion(double montant) throws RemoteException {
        return 5;
    }

    @Override
    public Compte consulterCompte(int code) throws RemoteException {
        return null;
    }

    @Override
    public List<Compte> ListComptes() throws RemoteException {
        return null;
    }
}
