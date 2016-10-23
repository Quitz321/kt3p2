import java.util.*;
public class Go{
	public static void main(String[] arg){
		Laiend s1=new Laiend(10, 3);
		System.out.println(s1.ruumala());
		List<Pohi> kujundid=new ArrayList<Pohi>();
		kujundid.add(s1);
		kujundid.add(new Laiend2(3, 4, 5));
		for(Pohi k: kujundid){
			System.out.println(k.ruumala());
		}
	}
}
