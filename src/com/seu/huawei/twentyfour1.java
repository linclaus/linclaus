package com.seu.huawei;

import java.util.ArrayList;
import java.util.Scanner;

public class twentyfour1 {
	static int count = 0;
	static int[] pailie = new int[4];
	static int[][] pailiezuhe = new int[24][4];

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			count = 0;
			pailie = new int[4];
			pailiezuhe = new int[24][4];
			
			int array[] = new int[4];
			int flag = 0;
			for (int i = 0; i < 4; i++) {
				array[i] = sc.nextInt();
			}
			ArrayList<Integer> arraylist = new ArrayList<Integer>();
			for (int i = 0; i < 4; i++) {
				arraylist.add(array[i]);
			}
			function(arraylist, 3);
			label: for (int i = 0; i < 24; i++) {
				int flag1, flag2, flag3;

				for (flag1 = 0; flag1 < 4; flag1++) {
					String res1 = "";
					int result1 = 0;
					switch (flag1) {
					case 0:
						res1 = pailiezuhe[i][0] + "+" + pailiezuhe[i][1];
						result1 = pailiezuhe[i][0] + pailiezuhe[i][1];
						break;
					case 1:
						res1 = pailiezuhe[i][0] + "-" + pailiezuhe[i][1];
						result1 = pailiezuhe[i][0] - pailiezuhe[i][1];
						break;
					case 2:
						res1 = pailiezuhe[i][0] + "*" + pailiezuhe[i][1];
						result1 = pailiezuhe[i][0] * pailiezuhe[i][1];
						break;
					case 3:
						res1 = pailiezuhe[i][0] + "/" + pailiezuhe[i][1];
						if (pailiezuhe[i][0] % pailiezuhe[i][1] != 0)
							continue;
						result1 = pailiezuhe[i][0] / pailiezuhe[i][1];
						break;
					default:
						break;
					}
					for (flag2 = 0; flag2 < 4; flag2++) {
						String res2 = res1;
						int result2 = 0;
						switch (flag2) {
						case 0:
							res2 = res2 + "+" + pailiezuhe[i][2];
							result2 = result1 + pailiezuhe[i][2];
							break;
						case 1:
							res2 = res2 + "-" + pailiezuhe[i][2];
							result2 = result1 - pailiezuhe[i][2];
							break;
						case 2:
							res2 = res2 + "*" + pailiezuhe[i][2];
							result2 = result1 * pailiezuhe[i][2];
							break;
						case 3:
							res2 = res2 + "/" + pailiezuhe[i][2];
							if (result1 % pailiezuhe[i][2] != 0)
								continue;
							result2 = result1 / pailiezuhe[i][2];
							break;
						default:
							break;
						}
						for (flag3 = 0; flag3 < 4; flag3++) {
							String res3 = res2;
							int result3 = 0;
							switch (flag3) {
							case 0:
								res3 = res3 + "+" + pailiezuhe[i][3];
								result3 = result2 + pailiezuhe[i][3];
								break;
							case 1:
								res3 = res3 + "-" + pailiezuhe[i][3];
								result3 = result2 - pailiezuhe[i][3];
								break;
							case 2:
								res3 = res3 + "*" + pailiezuhe[i][3];
								result3 = result2 * pailiezuhe[i][3];
								break;
							case 3:
								res3 = res3 + "/" + pailiezuhe[i][3];
								if (result2 % pailiezuhe[i][3] != 0)
									continue;
								result3 = result2 / pailiezuhe[i][3];
								break;
							default:
								break;
							}
							if (result3 == 24) {
								System.out.println("true");
								flag = 1;
								break label;
							}
						}
					}
				}
			}
			if (flag == 0)
				System.out.println("false");
		}
	}

	public static void function(ArrayList<Integer> arraylist, int index) {
		if (index == 0) {
			pailie[index] = arraylist.get(0);
			pailiezuhe[count] = pailie.clone();
			count++;
			return;
		}
		for (int i = 0; i < arraylist.size(); i++) {
			int tmp = arraylist.remove(0);
			pailie[index] = tmp;
			function(arraylist, index - 1);
			arraylist.add(tmp);
		}
	}
}
