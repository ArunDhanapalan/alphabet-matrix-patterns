public class AlphabetPatterns {
	public static void printA(int n) {
		int count = (n + 1) / 2 + 1;
		for (int i = 1; i <= n; i++) {
			if (i <= (n + 1) / 2)
				count--;
			for (int j = 1; j <= n; j++) {
				if (i == (n + 1) / 2 || i > (n + 1) / 2 && (j == 1 || j == n)
						|| i <= (n + 1) / 2 && (j == count || j == n - count + 1))
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}

	}

	public static void printB(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if (j == 1 || (i == 1 && j != n) || (i == (n + 1) / 2 && j != n) || (i == n && j != n)
						|| (i != 1 && i != n && i != (n + 1) / 2 && j == n)) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}

			}
			System.out.println();
		}
	}

	public static void printC(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if (i == 1 && j != 1 && j != n || i == n && j != 1 && j != n || j == 1 && i != 1 && i != n
						|| (i == 2 || i == n - 1) && j == n) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}

			}
			System.out.println();
		}
	}

	public static void printD(int n) {
		int count = n / 2, flag = 0;
		for (int i = 1; i <= n; i++) {
			if (count == n)
				flag++;
			if (flag == 0)
				count++;
			else
				count--;
			for (int j = 1; j <= n; j++) {
				if (i == 1 && (j <= n / 2 + 1) || i == n && (j <= n / 2 + 1) || j == 1 && i != 1 && i != n
						|| i == (n + 1) / 2 && j == n || j == count) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}

			}
			System.out.println();
		}
	}

	public static void printE(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if (i == 1 || i == (n + 2) / 2 || i == n || j == 1)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}

	public static void printF(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if (i == 1 || i == (n + 2) / 2 && j <= (n + 2) / 2 + 1 || j == 1)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}

	public static void printG(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if ((i == 1 && j != 1) || (i == n && j != 1) || i == (n + 2) / 2 && j >= (n + 2) / 2
						|| (i != 1 && i != n && j == 1) || i >= (n + 2) / 2 && j == n)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}

	public static void printH(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if (j == 1 || j == n || i == (n + 1) / 2)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}

	public static void printI(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if (i == 1 || i == n || j == (n + 1) / 2)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}

	public static void printJ(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if (i == 1 || i == n && j < (n + 1) / 2 || j == (n + 1) / 2 || i == n - 1 && j == 1)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}

	public static void printK(int n) {
		int count = n + 1, flag = 0;
		for (int i = 1; i <= n; i++) {
			if (count == (n + 1) / 2)
				flag = 1;
			if (flag == 0)
				count--;
			else
				count++;

			for (int j = 1; j <= n; j++) {
				if (j == 1 || j == count)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}

	public static void printL(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if (j == 1 || i == n)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}

	public static void printM(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if (j == 1 || j == n || (j == i || j == n - i + 1) && i <= (n + 1) / 2)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}

	public static void printN(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if (j == 1 || j == n || j == i)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}

	public static void printO(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if (i == 1 && j != 1 && j != n || i == n && j != 1 && j != n || j == 1 && i != 1 && i != n
						|| j == n && i != 1 && i != n)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}

	public static void printP(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if (j == 1 || i == 1 && j != 1 && j != n || i == (n + 1) / 2 && j != n
						|| i < (n + 1) / 2 && i != 1 && j == n)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}

	public static void printQ(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if (i == 1 && j != 1 && j != n || j == 1 && i != 1 && i != n || j == n && i != 1 && i != n
						|| i == n && j != 1 && j < n - 2 || j == i - 1 && i > (n + 1) / 2)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}

	public static void printR(int n) {
		int count = -(n + 1) / 2 + 3;
		for (int i = 1; i <= n; i++) {
			count++;
			for (int j = 1; j <= n; j++) {
				if (j == 1 || i == 1 && j != 1 && j != n || i == (n + 1) / 2 && j != n
						|| i < (n + 1) / 2 && i != 1 && j == n || i > (n + 1) / 2 && j == count)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}

	public static void printS(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if (i == 1 && j != 1 && j != n || j == n && i == 2 || j == 1 && i == n - 1
						|| j == 1 && i != 1 && i < (n + 1) / 2 || i == (n + 1) / 2 && j != 1 && j != n
						|| j == n && i != n && i > (n + 1) / 2 || i == n && j != n && j != 1)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}

	public static void printT(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if (i == 1 || j == (n + 1) / 2)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}

	public static void printU(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if (j == 1 && i != n || j == n && i != n || i == n && j != n && j != 1)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}

	public static void printV(int n) {
		int count = -(n + 1) / 2 + 1;
		for (int i = 1; i <= n; i++) {
			count++;
			for (int j = 1; j <= n; j++) {
				if (j == 1 && i <= (n + 1) / 2 || j == n && i <= (n + 1) / 2 || i > (n + 1) / 2 && j == count
						|| i > (n + 1) / 2 && j == n - count + 1)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}

	public static void printW(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if (j == 1 || j == n || (j == i || j == n - i + 1) && i >= (n + 1) / 2)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}

	public static void printX(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if (j == i || j == n - i + 1)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}

	public static void printY(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if ((j == i || j == n - i + 1) && i <= (n + 1) / 2 || j == (n + 1) / 2 && i > (n + 1) / 2)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}

	public static void printZ(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if (i == 1 || i == n || j == n - i + 1)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		printA(7);
		System.out.println();
		printB(7);
		System.out.println();
		printC(7);
		System.out.println();
		printD(7);
		System.out.println();
		printE(7);
		System.out.println();
		printF(7);
		System.out.println();
		printG(7);
		System.out.println();
		printH(7);
		System.out.println();
		printI(7);
		System.out.println();
		printJ(7);
		System.out.println();
		printK(7);
		System.out.println();
		printL(7);
		System.out.println();
		printM(7);
		System.out.println();
		printN(7);
		System.out.println();
		printO(7);
		System.out.println();
		printP(7);
		System.out.println();
		printQ(7);
		System.out.println();
		printR(7);
		System.out.println();
		printS(7);
		System.out.println();
		printT(7);
		System.out.println();
		printU(7);
		System.out.println();
		printV(7);
		System.out.println();
		printW(7);
		System.out.println();
		printX(7);
		System.out.println();
		printY(7);
		System.out.println();
		printZ(7);
		System.out.println();
	}
}
