package com.seu.zuochengyun;

public class 位图法 {
	public static void main(String[] args) {
		new 位图法().duplicateSelect();
		System.out.println();
		new 位图法().duplicateDelete();
		System.out.println();
		new 位图法().duplicateDeleteandSort();
	}

	int WordOffset(int b) {
		return b / 32;
	}

	int BitOffset(int b) {
		return b % 32;
	}

	void SetBit(int[] words, int b) {
		words[WordOffset(b)] |= 1 << BitOffset(b);
	}

	boolean GetBit(int[] words, int b) {
		return (words[WordOffset(b)] & (1 << BitOffset(b))) != 0;
	}

	void ClearBit(int[] words, int b) {
		words[WordOffset(b)] &= (~(1 << BitOffset(b)));
	}

	public void duplicateSelect() {
		int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 2, 3, 5 };
		int[] words = new int[1];
		for (int i = 0; i < array.length; i++) {
			if(GetBit(words,array[i])){
				System.out.print(array[i]+" ");
			}else{
				SetBit(words,array[i]);
			}
		}
	}

	public void duplicateDelete() {
		int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 2, 3, 5 };
		int[] words = new int[1];
		for (int i = 0; i < array.length; i++) {
			if(GetBit(words,array[i])){
				array[i]=-1;
			}else{
				SetBit(words,array[i]);
			}
		}
		int index=0;
		for(int i=0;i<array.length;i++){
			if(array[i]!=-1){
				array[index++]=array[i];
				System.out.print(array[i]+" ");
			}
		}
	}
	public void duplicateDeleteandSort(){
		int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 2, 3, 5 };
		int[] words = new int[1];
		for (int i = 0; i < array.length; i++) {
			if(GetBit(words,array[i])){
				array[i]=-1;
			}else{
				SetBit(words,array[i]);
			}
		}
		System.out.print(Integer.toBinaryString(words[0]));
		System.out.println();
		for(int i=0;i<words.length*32;i++){
			if(GetBit(words,i)){
				System.out.print(i+" ");
			}
		}
	}
}
