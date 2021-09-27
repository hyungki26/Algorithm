package example;

import java.util.Stack;

public class ex_stack {

    public static void main(String[] args){
        Stack<Integer> st = new Stack<>();

        //stack에 값 추가
        st.push(1);
        st.push(2);
        st.push(3);

        //stack 사이즈
        System.out.println(st.size());

        //stack 값 삭제
        st.pop();
        st.peek();  // 가장 상단의 값 출력
        

        System.out.println(st.toString());

        
        st.empty();     // stack이 비어있는제 check (비어있다면 true)
        st.contains(1);  // stack에 1이 있는지 check (있다면 true)

        st.clear(); // 전체 값 제거  
    }
    
}
