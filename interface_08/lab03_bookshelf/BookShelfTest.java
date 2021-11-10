package interface_08.lab03_bookshelf;

public class BookShelfTest {

	public static void main(String[] args) {
		Queue shelfQueue = new BookShelf();
		
		shelfQueue.enQueue("태백산맥 1");			//책장(ArrayList)에 책을 추가
		shelfQueue.enQueue("태백산맥 2");
		shelfQueue.enQueue("태백산맥 3");
		shelfQueue.enQueue("태백산맥 4");
		shelfQueue.enQueue("태백산맥 5");
		System.out.println("책장안 책의 수량 : " + shelfQueue.getSize());
		System.out.println("====================");
		
		
		System.out.println(shelfQueue.deQueue());	//책장에 책을 빼내옴
		System.out.println(shelfQueue.deQueue());
		System.out.println(shelfQueue.deQueue());
		System.out.println(shelfQueue.deQueue());
		System.out.println(shelfQueue.deQueue());
		
		System.out.println("책장안 책의 수량 : " + shelfQueue.getSize());
		
		
	}

}
