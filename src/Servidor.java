import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Servidor {
	final static String HOST_URL = "localhost/Incrementa";
	
	public static void main(String[] args) {
		try {
			LocateRegistry.createRegistry(Registry.REGISTRY_PORT);
			Incrementa i = new Incrementa();
			Naming.rebind(HOST_URL, i);
			System.out.println("servidor ok");
		} catch (Exception e) {
			System.out.println("Erro:" + e);
		}
	}
}
