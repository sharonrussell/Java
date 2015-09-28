public class Main
{
	public static void main(String[] args)
	{
		Newspaper newspaper = new Newspaper();
		newspaper.AddSubscriber(new Reader(newspaper, "Mrs Russell"));
		newspaper.AddSubscriber(new Reader(newspaper, "Mr Russell"));
		
		newspaper.PrintNews("The sky is blue!");
	}
}
