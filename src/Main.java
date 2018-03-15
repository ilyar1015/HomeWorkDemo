
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("用户从控制台输入的数字为："+args[0]);
		String path = "result.txt";
		WriteToFile wtf = new WriteToFile(path);
		System.out.println("Success!");
	}

}
