import java.util.*;
public class Go{
	public static void main(String[] arg){
		Laiend tapeet1=new Laiend("sinine tapeet", 5, 0.53, 10);
		List<Pohi> katted=new ArrayList<Pohi>();
		katted.add(tapeet1);
		katted.add(new Laiend2("valge värv", 3, 10));
		katted.add(new Laiend2("kollane värv", 5, 10));
		for(Pohi k: katted){
			System.out.println(k.varvKatab());
		}
	}
}
