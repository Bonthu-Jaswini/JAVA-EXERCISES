package arrays;
public class mergingtwoarrays {
	public static void main(String[] args) {
		String a[]=new String[] {"chai","coffee"};
		String b[]=new String[] {"milk","water","coke"};
		String c[]=new String[a.length + b.length];
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
}
			for(int j=0;j<b.length;j++) {
				System.out.print(b[j]+" ");
					}
		
	}
}
