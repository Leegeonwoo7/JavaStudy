package ch29;

public class BookShelf extends Shelf implements Queue {

	@Override
	public void enQueue(String title) {
		shelf.add(title);
	}

	@Override
	public String deQueue() {
		return shelf.remove(0);  //shelf가 default 생성자인 super()를 해왔기때문에 shelf를 사용할 수 있음
	}

	@Override
	public int getSize() {
		return getCount();
	}
	

}