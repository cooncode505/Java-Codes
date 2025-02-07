class Population 
{
	public static void main(String[] args) 
	{
		long currentpopulation= 312032486;
		final long seconds = (365*24*60*60)*5;
		long birth = seconds/7;
		long death = seconds/13;
		long immigrants = seconds/45;
		long newpop = currentpopulation+birth-death+immigrants;
		System.out.print("Current Population is : " +currentpopulation);
		System.out.print("New Population is : " +newpop);
	}
}
