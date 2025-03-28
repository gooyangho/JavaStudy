package skillup.project06;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

import skillup.project01.MyFriendInfoBook;

public class FriendInfoHandler {
	
	//Friend 인스턴스를 저장할 수 있는 List 계열의 컬렉션 생성.	 
	private ArrayList<Friend> myFriends;
	
	public FriendInfoHandler(int num) {
		//List 인스턴스 생성
		myFriends =new ArrayList<Friend>();
	}	
	//연락처 정보 추가를 위한 메서드 
	public void addFriend(int choice) {
		//System.out.println("addFriend 호출됨");
		Scanner scan = new Scanner(System.in);
		//공통정보 3가지를 먼저 입력받는다.
		String iName,iphone,iAddr,iNickname,iMajor;
		System.out.print("이름:");iName = scan.nextLine();
		System.out.print("전화번호:");iphone = scan.nextLine();
		System.out.print("주소:");iAddr =scan.nextLine();
		
		/*
		1,2번을 구분해서 각 인스턴스를 생성한 후 저장은 부모 타입인
		Friend 배열에 저장한다. 즉 상속을 통해 탕비이 다른 자식
		인스턴스를 통합적으로 관리할 수 있다. */
		if(choice==1) {		
			System.out.print("별명:"); iNickname = scan.nextLine();
			HighFriend high = new HighFriend(iName, iphone, iAddr, iNickname);
			myFriends.add(high);
		}	
		else if(choice==2) {	
			System.out.print("전공:"); iMajor = scan.nextLine();
			myFriends.add(new UnivFriend(iName, iphone, iAddr, iMajor));
					
		}
		/*
		High , Univ타입의 인스턴스를 Friend타입의 배열에 추가할때에는
		자동형변환이 일어난다. 정수를 실수타입의 변수에 저장할때
		자동형변환이 되는것과 동일한 현상이라 생각하면된다.
		즉 High, Univ 인스턴스는 Friend 타입의 인스턴스로 자동
		형변환되어 저장된다. */
		System.out.println("##친구정보 입력이 완료되었습니다##");		
	}
	
	//저장된 연락처 전체정보 출력
	public void showAllData() {
		//System.out.println("showAllDate 호출됨");
		//배열에 저장된 정보의 갯수만큼 반복
		for(int i=0 ; i<myFriends.size() ; i++)	{
			myFriends.get(i). showAllData();	
		}
		System.out.println("##전체정보가 출력되었습니다##");
	}
	//간략 정보 출력
	public void showSimpleData() {
		
		//저장된 인스턴스의 갯수만큼 반복해서 각 인스턴스가 원래 어떤
		//타입이었는지 확인한 후 원래의 타입으로 형변환한다.
		 
		//System.out.println("showSimpleData 호출됨");
		for(Friend friend : myFriends) {
			friend.showBasicInfo();
		}
		System.out.println("##간략정보가 출력되었습니다##");
	}
		public void searchInfo() {
		boolean isFind = false;
		Scanner scan = new Scanner(System.in);
		System.out.print("검색할 이름을 입력하세요:");
		String searchName = scan.nextLine();
		//이터레이터 인스턴스 생성
		Iterator<Friend> itr =myFriends.iterator()	;
		//인출할 인스턴스가 있는지 확인
		while(itr.hasNext()) {
			//인출
			Friend friend = itr.next()	;
			//인출된 인스턴스와 이름을 통해 비교
			if(searchName.compareTo(friend.name)==0) {
				friend.showAllData();		
				//일치하는 경우 정보 출력
			System.out.println("##귀하가 요청하는 정보를 찾았습니다.##");
			//정보를 찾았다면 true로 변경
			isFind = true;
		}
	}
	if(isFind==false)
	System.out.println("##찾는 정보가 없습니다.##");
	}
				
		//연락처 정보 삭제
	public void deleteInfo() {
		//System.out.println(" deleteInfo 호출됨 ");
		Scanner scan = new Scanner(System.in);
		System.out.print("삭제할 이름을 입력하세요:");
		String deleteName =scan.nextLine();
		//삭제 여부 판단		
		int deleteIndex = -1;
		//확장 For문으로 반복
		for(Friend friend : myFriends) {
			//삭제할 이름이 있는지 검색
			if(deleteName.equals(friend.name)) {
				//참조값을 통해 삭제
				myFriends.remove(friend);
				//삭제되었다면 0으로 변경
				deleteIndex = 0;
			
				break;
			}					
		}			
		
		/*
		자동 인덱싱이 지원되므로 삭제후 데이터를 앞으로 이동하는
		것을 하지않아도 된다.*/
		if(deleteIndex==-1) {
			System.out.println("##삭제된 데이터가 없습니다##");
		}
		else {
				System.out.println("##삭제되었습니다##");
		}
	}
}
		