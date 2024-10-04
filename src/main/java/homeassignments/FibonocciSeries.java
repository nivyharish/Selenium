package homeassignments;

public class FibonocciSeries {
	public static void main(String[] args) {
		int num=8;
		int fn=1;
		int sn=1;
		int tn;
		System.out.println(fn);
		System.out.println(sn);
		for(int i=3;i<=num;i++)
		{
			tn=fn+sn;
			System.out.println(tn);
		fn=sn;
		sn=tn;
		}
		}
	}


