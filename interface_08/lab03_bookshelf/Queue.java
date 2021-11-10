package interface_08.lab03_bookshelf;

public interface Queue {	// Queue : 책장(ArrayList)

	void enQueue (String title);	// 책장에 책이 저장됨
	String deQueue();				// 책장에 책을 빼냄
	int getSize();					// 책장 안 책의 갯수
}
