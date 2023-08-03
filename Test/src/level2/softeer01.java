package level2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.StringTokenizer;

class Jewelry {
	private int weight;
	private int price;
	
	public Jewelry(int weight, int price) {
		this.weight = weight;
		this.price = price;
	}
	public int getWeight() {
		return weight;
	}
	public int getPrice() {
		return price;
	}
}

public class softeer01 {

	public static void main(String[] args) throws Exception {
		// 금고털이
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(in.readLine());
        int W,rest = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());
		int sum = 0;
		ArrayList<Jewelry> list = new ArrayList<>();
		for (int i=0;i<N;i++) {
			st = new StringTokenizer(in.readLine());
			int weight = Integer.parseInt(st.nextToken());
			int price = Integer.parseInt(st.nextToken());
			Jewelry j = new Jewelry(weight, price);
			list.add(j);
		}
		list.sort((s1, s2) -> Integer.compare(s2.getPrice(), s1.getPrice()));
		int idx = 0;
		while(true) {
			int p = list.get(idx).getPrice();
			int w = list.get(idx).getWeight();
			if (rest-w > 0) {
				sum += w*p;
				rest -= w;
			}else {
				sum += rest*p;
				rest -= rest;
			}
			if (rest==0 || idx==N) {
				break;
			}
			idx++;
		}
		System.out.println(sum);
		
	}
	
}
