
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("�û��ӿ���̨���������Ϊ��"+args[0]);
		String path = "result.txt";
		WriteToFile wtf = new WriteToFile(path);
		System.out.println("Success!");
	}

}
