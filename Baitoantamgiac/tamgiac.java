package Baitoantangiac;

public class tamgiac {
	private int a,b,c;
	tamgiac(int a,int b,int c){
		this.a=a;this.b=b;this.c=c;
	}
	public boolean laTamgiac(){
		if(a+b>c && a+c>b && b+c>a) return true;
		else return false;
	}
	public boolean TamgiacVuong(){
		if(a*a+b*b==c*c || a*a+c*c==b*b || b*b+c*c==a*a) return true;
		else return false;	
	}
	public boolean TamgiacCan(){
		if(a==b || b==c ||a==c) return true;
		else return false;
	}
	public boolean TamgiacDeu(){
		if(a==b && b==c && a==c) return true;
		else return false;
	}
	public String LoaiTamGiac(){
		String result;
		if(this.laTamgiac()==false) result="Khong la tam giac";
		else {
			if(this.TamgiacDeu()==true) result="Tam giac deu";
			else if(this.TamgiacCan()==true) result="Tam giac can";
			else if(this.TamgiacVuong()==true) result="Tam giac vuong";
			else result="Tam giac thuong";
		}
		return result;
	}
}
