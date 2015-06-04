import java.rmi.Naming;


public class Cliente {
	public static void main(String[] args) {
		try {
			IIncrementa i = (IIncrementa) Naming.lookup("localhost/Incrementa");
			System.out.println(i.incrementar());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
