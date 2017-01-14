package projectEuler;

public class problem3 {

	
	public static void main(String[] args) {
		int sayi = 18;
		int adet = asalSayilarAdet(sayi);
		asalSayilar(sayi,adet);

	}
	public static int asalSayilarAdet(int sayi)
	{
		int adet=0;
		for(int i=2;i<sayi;i++)
		{
			for(int j=i-1;j>=1;j--)
			{
				if(j == 1)adet++;
				if(i%j == 0) break;
			}
		}
		return adet;
	}
	public static int[] asalSayilar(int sayi,int adet)
	{
		int[]  asalDizi = new int[adet];
		
		return asalDizi[];
	}

}
