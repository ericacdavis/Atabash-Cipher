
import javax.swing.JOptionPane;
public class Atbash {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String cipher ="";
		char [] array1 = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
		String code= JOptionPane.showInputDialog("Input a secret Message (all lowercase)");
		char[] cArray = code.toCharArray();
		int length1 = cArray.length;
		int length2 = array1.length;
		
		for(int i=0; i < length1; i++) {
			char b= cArray[i];
			for(int j=0; j<length2; j++) {
                char c=array1[j];
                if(c == b ){
                int position=(length2-1)-(new String(array1).indexOf(c));
                cipher+= array1[position];
                break;
                	}
			}
		}
		System.out.println(cipher);
	}
}
