package practica4AA;

public class recursive {
	public static int f (int x, int y) {
		 if (x==0)
		 return y;
		 else if (y==0)
		 return x;
		 else
		 return f(x,y-1) + f(x-1,y) + f(x-1,y-1);
		} 
		public static int fT (int x, int y) {
		int[][] tabla=new int[x+1][y+1];
		for(int i=0;i<x+1;i++) {
			for(int j=0;j<y+1;j++) {
				tabla[i][j]=-1;
			}
		}
		frecT(x, y, tabla);
		return tabla[x][y];
		} 
	
	public static void frecT (int x, int y, int[][] tabla) {
		if(tabla[x][y]==-1) {
			if (x==0)
				tabla[x][y]=y;
			else if (y==0)
				tabla[x][y]=x;
			else {
				frecT(x,y-1, tabla);
				frecT(x-1,y, tabla);
				frecT(x-1,y-1, tabla);
				tabla[x][y]=tabla[x][y-1]+ tabla[x-1][y] +tabla[x-1][y-1] ;
			}
		} 
	}

}
