import java.awt.List;

public class ObserverPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Subject s1 = new Subject();
		Observer o = new OctalObserver(s1);
		s1.addObserver(o);
		s1.setState(1);	
	}

}

abstract class Observer{
		Subject s;
		void Observe(Subject s){
			this.s = s;
		}
		public abstract void update();
}

class OctalObserver extends Observer{
	OctalObserver(Subject s)
	{
		super();
	}
	 public void update(){
		
	}
}

class Subject{
	int state;
	List<Observer> ObserverList = new List();
	
	int getState(){
		return state;
	}
	
	void setState(int state)
	{
		this.state = state;
		notifyAll();
	}
	
	public void notifyAll(){
		for(Observer i: ObserverList)
		{
			i.update();
		}
	}
	
	void addObserver(Observer o)
	{
		ObserverList.add(o);
	}
	
	
	
}