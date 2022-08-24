package lv1;

public class 신규아이디추천 {

	public static void main(String[] args) {

		String ne_id = "=.=";
		System.out.println(solution(ne_id));

	}

	public static String solution(String new_id) {
		String answer = "";

		// id길이 3~15
		// 소문자,숫자,-, _ , . 사용 가능
		// . 는 처음 끝 사용 x,연속 사용 x

		// 1
		new_id = new_id.toLowerCase();
		System.out.println(new_id);
		// 2
		String match = "[^0-9a-z-_.]";
		new_id = new_id.replaceAll(match, "");
		System.out.println(new_id);

		// 3
		String match2 = "\\.{2,}";
		new_id = new_id.replaceAll(match2, ".");
		System.out.println(new_id);

		// 4
		if(new_id.length()>0) {
			if(new_id.charAt(0)=='.') {
				new_id = new_id.substring(1,new_id.length());
			}
		}
		if(new_id.length()>0) {
			if(new_id.charAt(new_id.length()-1)=='.') {
				new_id=new_id.substring(0,new_id.length()-1);
			}
		}
		
	
		// 5
		if (new_id.equals(""))new_id += "a";

		// 6
		if (new_id.length() >= 16) {
			new_id = new_id.substring(0, 15);
			new_id = new_id.replaceAll("[.]$", "");
		}
		System.out.println(new_id);

		// 7
		if (new_id.length() <= 2) {
			while (new_id.length() < 3) {
				new_id += new_id.charAt(new_id.length()-1);

			}
		}
		System.out.println(new_id);

		return new_id;
	}

}
