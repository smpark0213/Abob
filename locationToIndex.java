
/*Index �� ��� ����(column)
 * 0: IT����
 * 1: ��õ��(�Ĵ�)
 * 2: �۷ι�����
 * 3: ����Ÿ��(�н�)
 * 4: ��������1
 * 5: ����Ÿ��(�Ĵ簡)
 * 6: ��������2
 * 7: �������п�(�н�)
 * 8: �߾ӵ�����
 * 9: ��������1(�н�)
 * 10: ��������������
 * 11: ��������2
 * 12: ���̿��������
 * 13: ���̿����뿬����
 * 14: ������
 * 15: �л�ȸ��
 * 16: �����
 */   // �Ĵ� �ִ� �� 1, 3, 5, 7, 9

public class locationToIndex {
	String Convert(String cur_loc, String des_loc) {
		String result="";
	if(cur_loc.startsWith("IT"))
		result +="0";
	if(cur_loc.startsWith("��õ��"))
		result +="1";
	if(cur_loc.startsWith("�۷ι�����"))
		result +="2";
	if(cur_loc.startsWith("����Ÿ��(��"))
		result +="3";
	if(cur_loc.startsWith("��������1"))
		result +="4";
	if(cur_loc.startsWith("����Ÿ��(��"))
		result +="5";
	if(cur_loc.startsWith("��������2"))
		result +="6";
	if(cur_loc.startsWith("��������"))
		result +="7";
	if(cur_loc.startsWith("�߾ӵ�����"))
		result +="8";
	if(cur_loc.startsWith("��������1"))
		result +="9";
	if(cur_loc.startsWith("��������"))
		result +="10";
	if(cur_loc.startsWith("��������2"))
		result +="11";
	if(cur_loc.startsWith("���̿��������"))
		result +="12";
	if(cur_loc.startsWith("���̿����뿬��"))
		result +="13";
	if(cur_loc.startsWith("����"))
		result +="14";
	if(cur_loc.startsWith("�л�ȸ"))
		result +="15";
	if(cur_loc.startsWith("�����"))
		result +="16";
	
	if(des_loc.startsWith("IT"))
		result +=",0";
	if(des_loc.startsWith("��õ��"))
		result +=",1";
	if(des_loc.startsWith("�۷ι�����"))
		result +=",2";
	if(des_loc.startsWith("����Ÿ��(��"))
		result +=",3";
	if(des_loc.startsWith("��������1"))
		result +=",4";
	if(des_loc.startsWith("����Ÿ��(��"))
		result +=",5";
	if(des_loc.startsWith("��������2"))
		result +=",6";
	if(des_loc.startsWith("��������"))
		result +=",7";
	if(des_loc.startsWith("�߾ӵ�����"))
		result +=",8";
	if(des_loc.startsWith("��������1"))
		result +=",9";
	if(des_loc.startsWith("��������"))
		result +=",10";
	if(des_loc.startsWith("��������2"))
		result +=",11";
	if(des_loc.startsWith("���̿��������"))
		result +=",12";
	if(des_loc.startsWith("���̿����뿬��"))
		result +=",13";
	if(des_loc.startsWith("����"))
		result +=",14";
	if(des_loc.startsWith("�л�ȸ"))
		result +=",15";
	if(des_loc.startsWith("�����"))
		result +=",16";
	
	return result; 
	}
}
