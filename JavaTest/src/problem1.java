
public class problem1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//	     �Ӿ��̳� �粿ġ ���Դ� 10�κ��� ������ ����� �ϳ��� ���񽺷� �ݴϴ�. 
//			�粿ġ�� 1�κп� 12,000��, ������� 2,000���Դϴ�. 
//			���� n�� k�� �Ű������� �־����� ��, �粿ġ n�κа� ����� k���� �Ծ��ٸ� 
//			�Ѿ󸶸� �����ؾ� �ϴ��� return �ϵ��� solution �Լ��� �ϼ��غ�����.
			int n = 15; // �粿ġ 
			int k = 2; // ����� 
			int answer = n*12000+k*2000-(n/10*2000);
			System.out.println(answer);

	}

}
