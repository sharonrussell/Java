public interface IObserver
{
	void AddSubscriber(ISubscriber subscriber);
	
	void RemoveSubscriber(ISubscriber subscriber);
	
	void Notify();
}
