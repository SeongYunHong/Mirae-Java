package mirae.com;

public class a_16_string_sort {

	public static void main(String[] args) {
//-----------------------------------------------------------
		/*
		String str11="Hello";
		String str21="Hello";
		String str31="World";
		System.out.println("str1.compareTo(str2)? "+str11.compareTo(str21)); //compare To : 문자열 비교 함수(똑같으면 0출력)
		System.out.println("str3.compareTo(str1)? "+str31.compareTo(str11)); //(괄호 안에 있는 것이 작으면 양수 출력)
		System.out.println("str1.compareTo(str3)? "+str11.compareTo(str31)); //(괄호 안에 있는 것이 크면 음수 출력)
		*/
//-----------------------------------------------------------	
		
		String []strarray= {"대한","민국","만세","한국","대전"};
		
		for(int i=0; i<strarray.length;i++) {
			boolean changed=false;
			for(int j=0;j<strarray.length-i-1;j++) { // -i하는 이유 : 진행될 때마다 자리가 하나씩 정해지니까 의미없는 반복을 줄이기 위해 
				if(strarray[j].compareTo(strarray[j+1])>0) {
					String temp=strarray[j];
					strarray[j]=strarray[j+1];
					strarray[j+1]=temp;
					changed=true;
				}			
			}
			if(!changed) break; //변경하지 않았으면 종료(정렬이 완료됐기 때문)
		}
		for(int i=0;i<strarray.length;i++) {
			System.out.print(strarray[i]+" ");
		}		
	}
}