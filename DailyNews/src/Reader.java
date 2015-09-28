public class Reader implements ISubscriber
{
	private Newspaper _newspaper;
	private String _name;

	public Reader(Newspaper newspaper, String name)
	{
		_newspaper = newspaper;
		_name = name;
	}
	
	@Override
	public void Update()
	{
		System.out.println(_name + ": I just heard some great news... " + _newspaper.GetNews());
	}
}
