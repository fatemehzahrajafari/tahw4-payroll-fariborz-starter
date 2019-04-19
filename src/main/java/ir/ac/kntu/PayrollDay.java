    enum PayrollDay {
	SUNDAY, MONDAY, TUESDAY, WEDNESDAY, 
    THURSDAY, FRIDAY, SATURDAY; 

	public pay(PayrollDay payrollday){
		this.payrollday=payrollday;
	}

    private static final int MINS_PER_SHIFT = 8 * 60;

    int pay(int minutesWorked, int payRate) {
	Scanner scanner=new scanner(System.in);
	
	int minutesWorked=scanner.nextInt();
	int payRate=scanner.nextInt();
	int overtime=scanner.nextInt();
        switch(PayrollDay)
	{
	case SATURDAY:
	PayRate=MINS-PER-SHIFT*minutesWorked;
	System.out.println(payRate);
	break;
	case SUNDAY:
	
	PayRate=MINS-PER-SHIFT*minutesWorked;
	System.out.println(payRate);
	
	break;
	case MONDAY:
	
	PayRate=MINS-PER-SHIFT*minutesWorked;
	System.out.println(payRate);
	break;
	case TUESDAY:
	
	PayRate=MINS-PER-SHIFT*minutesWorked;
	System.out.println(payRate);
	break;
	case WEDNESDAY:
	
	PayRate=MINS-PER-SHIFT*minutesWorked;
	System.out.println(payRate);
	break;
	case THURSDAY:
	payRate=(1.5*overtime+MINS-PER-SHIFT)*minutesWorked;
	System.out.println(payRate);
	break;
	case FRIDAY:
	payRate=(1.5*overtime+MINS-PER-SHIFT)*minutesWorked;
	System.out.println(payRate);
	break;

    }
} 
