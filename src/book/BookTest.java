package book;

import java.util.Scanner;

public class BookTest {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
			BookManager bm=new BookManager();
			
			int num=0;
			
			do {
				System.out.println("**************");
				System.out.println("1. 책 등록");
				System.out.println("2. 책 삭제");
				System.out.println("3. 책 리스트");
				System.out.println("4. 책 검색");
				System.out.println("0. 종료");
				System.out.println("**************");
				
				num=sc.nextInt();
				
				if(num==1) {
					System.out.println("아래 사항을 입력해주세요.");
					
					System.out.print("책 제목 : ");
					String title=sc.next();
					System.out.print("책 저자 : ");
					String author=sc.next();
					
					bm.add(title, author);
				}else if(num==2) {
					System.out.print("삭제할 책 제목을 입력하세요 : ");
					String title=sc.next();
					bm.remove(title);
				}else if(num==3) {
					bm.getList();
				}else if(num==4) {
					System.out.print("검색할 책 제목을 입력하세요 : ");
					String title=sc.next();
					bm.searchByTitle(title);
				}
			}while(num!=0);

	}
}
