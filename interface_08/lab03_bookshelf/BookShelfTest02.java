package interface_08.lab03_bookshelf;

public class BookShelfTest02 {

	public static void main(String[] args) {
		Queue shelfQueue2 = new BookShelf();
		
		for(int i = 0; i<100; i++) {		// 책 100권을 책장에 넣음
			shelfQueue2.enQueue("태백산맥" + (i+1) + "권");
		}
		System.out.println("책장안 책의 수량 : " + shelfQueue2.getSize());
		System.out.println("====================");
	
		for(int i = 0; i<30; i++) {			// 책 30권을 책장에서 빼내옴
			System.out.println(shelfQueue2.deQueue());
		}
		System.out.println("====================");
		System.out.println("책장안 책의 수량 : " + shelfQueue2.getSize());

	}
}
