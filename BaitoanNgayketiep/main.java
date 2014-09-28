package BaitoanNgayketiep;
import java.io.*;
public class main {
	public static void main(String[] args) throws Exception {
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Nhap nam:");int a=Integer.parseInt(in.readLine());
		System.out.println("Nhap thang:");int b=Integer.parseInt(in.readLine());
		System.out.println("Nhap ngay:");int c=Integer.parseInt(in.readLine());
		ngayketiep nextday=new ngayketiep(a,b,c);
		System.out.println(nextday.nextday());
	}
}
