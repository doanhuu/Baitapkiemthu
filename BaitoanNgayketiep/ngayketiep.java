package BaitoanNgayketiep;

public class ngayketiep {
	private int year,month,day;
	private int nextyear,nextmonth,nextday;
	public ngayketiep(){};
	public ngayketiep(int y,int m,int d){
		this.year=y;this.month=m;this.day=d;
	}
	public boolean namnhuan(){
		if(year % 100==0){
			if (year % 400==0) return true;
			else return false;
		}
		else{
			if (year % 4==0) return true;
			else return false;
		}
	}
	public String nextday(){
		switch(month){
			case 1:case 3:case 5: case 7:case 8: case 10:case 12:
				if(day <=30) {
						this.nextday=this.day+1;
						this.nextmonth=this.month;
						this.nextyear=this.year;
				}
				if(day==31){
					if(month==12){
						this.nextday=1;
						this.nextmonth=1;
						this.nextyear=this.year+1;
					}
					else{
						this.nextday=1;
						this.nextmonth=month;
						this.nextyear=this.year;
					}
				}
				break;
			case 4:case 6 :case 9 :case 11:
				if(day<=29){
					this.nextday=day+1;
					this.nextmonth=month;
					this.nextyear=year;
				}
				else{
					this.nextday=1;
					this.nextmonth=month+1;
					this.nextyear=year;
				}
				break;
			case 2:
				if(this.namnhuan()==true){
					if(day<29){
						this.nextday=day+1;
						this.nextmonth=month;
						this.nextyear=year;
					}
					else{
						this.nextday=1;
						this.nextmonth=month+1;
						this.nextyear=year;
					}
				}
				else{
					if(day<28){
						this.nextday=day+1;
						this.nextmonth=month;
						this.nextyear=year;
					}
					else{
						this.nextday=1;
						this.nextmonth=month+1;
						this.nextyear=year;
					}
				}
				break;
				
				
		}
		String result="Ngay ke tiep la ngay:"+this.nextday+"/"+this.nextmonth+"/"+this.nextyear;
		return result;
	}
}
