
public class CommandLineArguments {

	public static void main(String[] args) { // Arguments will be passed from run configurations

		int len = args.length;
		if (len == 0) {
			System.out.println("No Arguments passed");
		} else {
			for (int i = 0; i < len; i++) {
				System.out.println(args[i]);
			}
		}
	}

}
