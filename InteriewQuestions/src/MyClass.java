public class MyClass {
	public static void main(String args[]) {
		String ip = "babcadaefhef";
		int z = 0, t;
		
		char arr[] = ip.toCharArray();
		
		for (int i = 0; i < arr.length; i++) {
			t = 1;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					t++;
				}
			}
			if (t > 1) {
				System.out.println(arr[i]);
				z++;
			}
		}
		System.out.println(z);
	}
}
