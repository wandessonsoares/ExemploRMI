import java.rmi.Remote;
import java.rmi.RemoteException;

public interface IIncrementa extends Remote{
	public int incrementar() throws RemoteException;
}
