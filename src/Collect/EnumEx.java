package Collect;

public class EnumEx {

	public enum months {
		JAN,FEB,MAR,APR,MAY,JUN,JUL,AUG,SEP,OCT,NOV,DEC
	}
	
		months monOfYr;
		
	public  EnumEx(months monOfYr) {
		this.monOfYr = monOfYr;
		
	}
	
	public void monthsDetails() {
		switch(monOfYr) {
		
		case JAN:
			System.out.println("The entered month is Janauary");
			break;
		case FEB:
			System.out.println("The entered month is February");
			break;
		case MAR:
			System.out.println("The entered month is March");
			break;
		case APR:
			System.out.println("The entered month is April");
			break;
		case MAY:
			System.out.println("The entered month is May");
			break;
		case JUN:
			System.out.println("The entered month is June");
			break;
		case JUL:
			System.out.println("The entered month is July");
			break;
		case AUG:
			System.out.println("The entered month is August");
			break;
		case SEP:
			System.out.println("The entered month is September");
			break;
		case OCT:
			System.out.println("The entered month is October");
			break;
		case NOV:
			System.out.println("The entered month is November");
			break;
		case DEC:
			System.out.println("The entered month is December");
			break;
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EnumEx jan = new EnumEx(months.JAN);
		jan.monthsDetails();
		EnumEx march = new EnumEx(months.MAR);
		march.monthsDetails();
		EnumEx may = new EnumEx(months.MAY);
		may.monthsDetails();
		EnumEx jul = new EnumEx(months.JUL);
		jul.monthsDetails();
		EnumEx sept = new EnumEx(months.SEP);
		sept.monthsDetails();
		EnumEx december = new EnumEx(months.DEC);
		december.monthsDetails();
	}

}
