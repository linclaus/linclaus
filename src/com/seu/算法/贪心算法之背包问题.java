package com.seu.�㷨;

import java.util.Comparator;

public class ̰���㷨֮�������� {
	public static void main(String[] args) {

	}
}

class Article implements Comparable<Article>, Comparator<Article> {

	int weight, price;
	float pricePerWeight;

	public Article(int weight, int price) {
		this.weight = weight;
		this.price = price;
		this.pricePerWeight = price / weight;
	}

	public String toString() {
		return "("+weight+","+price+","+String.format("%5.2f", pricePerWeight)+")";
	}

	@Override
	public int compareTo(Article o) {
		return (int) ((o.pricePerWeight-this.pricePerWeight)*100);
	}

	@Override
	public int compare(Article o1, Article o2) {
		return o1.weight-o2.weight;
	}

}