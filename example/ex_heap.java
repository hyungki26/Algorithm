/*
https://kingpodo.tistory.com/30
힙은 각 노드의 키 값이 그 자식의 키값보다 작지 않은 완전 이진 트리이다. 이것을 최대 힙이라고 한다. 
또한 힙를 각 노드의 키 값이 그 자식의 키값보다 크지 않은 완전 이진 트리로 정의 하기도 하는데 이것을 최소 힙이라고 한다.  
이 정의에 따라 최소 힙의 루트는 그 트리에서 가작 작은 키 값을 가지고 있고 최대 힙의 루트는 그 트리에서 가장 큰 키 값을 가지고 있다.


*/
package example;

public class ex_heap {
   
    public static void insertHeap(int[] heap, int size, int item) { // heap의 배열과, size는 현 heap의 원소의 개수, item은 삽입 원소
         if(size == heap.length-1) {  // 힙이 만원이 상태라면 종료
            System.out.println("heep size 초과"); 
            return; 
        } 
        
        int i = ++size; // 다음 item이 들어갈 원소 위치 
        
        while(true) { 
            if(i == 1) {break;} // 힙의 원소가 하나도 없었다면 반복문 탈출 
            if(item < heap[i/2]) {break;} // 아이템이 부모 노드보다 작다면 반복문 탈출 
            heap[i] = heap[i/2]; // 부모노드의 키값을 자식노드로 이동 
            i /= 2; // i의 위치를 즉 원소가 들어갈 자리를 부모노드로 변경 
        } 
        
        heap[i] = item; // 정해진 i위치에 item 삽입 
    }

}
