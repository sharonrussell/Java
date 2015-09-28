import java.util.ArrayList;

public class Newspaper implements IObserver
{
	private ArrayList<ISubscriber> _readers = new ArrayList<ISubscriber>();
	
	private String _news;
	
	@Override
	public void AddSubscriber(ISubscriber subscriber)
	{
		_readers.add(subscriber);
	}

	@Override
	public void RemoveSubscriber(ISubscriber subscriber)
	{
		_readers.remove(subscriber);
	}

	@Override
	public void Notify()
	{
		for (ISubscriber reader : _readers)
		{
			reader.Update();
		}
	}
	
	public void PrintNews(String news)
	{
		_news = news;
		Notify();
	}
	
	public String GetNews()
	{
		return _news;
	}
}
