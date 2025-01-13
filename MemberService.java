
//15문제 
//구:login(), logout(),
//조: login 메서드는 id, password만 제공 logout은 id만 제공
package ch13;
// 

public class MemberService {
	//필드값 설정.
   String id ;
   String password;
   
   
   //클래스에 대한 메서드 설정
   boolean login(String id, String password) {
	    String id= d;  // 여기서 생성자를 생각을 했었는데 그렇게 생각을 하면 안됨/
	    String password = p; //
	  }
   
   void logout(String id) {
	   System.out.println(id+"님이 로그아웃 되었습니다.");
   }
   
   //println()
   void println(int a,boolean b,double c,String d) {
	  return a, b, c ,d ;
	   
   }

   
   
	
	MemberService memberService = new MemberService();//인스턴스로 이걸 생성했기 때문에 인스턴스 매서드로 처리를 해야하는 건가...?
	
	boolean result = memberService.login("hong","12345");
    if (result) {
    	System.out.println("로그인 되었습니다람쥐~");
    	memberService.logout("hong");
    	else {
    		System.out.println("id 또는 password가 올바르지 않다?");
    	}
    }
       
    
    
    
    
    
    
}
//int login(String n ,String d) {
//String name =	 n;
//String id = d ; //id를 출력.
//return login(n,d);
//}
//
//int logout(String n) {
//String name = n;
//return logout(n);
//
//}
//


