package sec06.exam07_array_copy;

public class ArrayCopyExample {

	public static void main(String[] args) {
		String[] oldStrArray = { "java", "array", "copy" };
		String[] newStrArray = new String[5];
		
		System.arraycopy( oldStrArray, 0, newStrArray, 1, oldStrArray.length);
		//System.arraycopy(�����ҹ迭�̸�, �����ҹ迭�����ּ�, �ű�迭�̸�,�ű�迭���۰�,�����ҹ迭����)
		for(int i=0; i<newStrArray.length; i++) {
			System.out.print(newStrArray[i] + ", ");
		}
	}

}
