import java.util.*;
import java.io.*;
public class main {

	public static void main(String[] args) {
		// Variable
		Scanner scan = new Scanner(System.in);
		int a_time = 0; //���� �ð�
		int[] c_r_time = new int[5];
		int[] r_d_time = new int[5];
		int[] m_time = new int[5]; //�̵��ϴµ� �� �ɸ��� �ð�
		int cur_index = 0;
		int des_index = 0;
		int cnt=0;
		String cur_loc = null; // ���� ��ġ
		String des_loc = null; // ���� ��ġ
		String store_loc = null; // ���� ��ġ
		String temp;
		floydwarshall floyd = new floydwarshall();
		//locationToIndex lti = new locationToIndex();
		//DB jdbc = new DB();
		//GUI GUI = new GUI();

		GUI frame = new GUI();			
		frame.setVisible(true);
	}


}


