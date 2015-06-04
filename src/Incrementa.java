import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class Incrementa extends UnicastRemoteObject implements IIncrementa{

	private static final long serialVersionUID = 1L;
	private int x = 10;
	
	public Incrementa() throws RemoteException{}
	
	@Override
	public int incrementar() throws RemoteException {
		x = x + 1;
		return x;
	}

}
