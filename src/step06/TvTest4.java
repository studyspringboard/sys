package step06;

 class Tv{
	//tv�� �Ӽ�(��� ����)
	String color;	//����
	boolean power;	//���� ����(on/ off)
	int channel;	//ä��
	
	//tv�� ���(�޼���)
	void power() { power = ! power;} //tv�� �Ѱų� ���� ����� �ϴ� �޼���
	void channelUp() { ++channel; } //tv�� ä���� ���̴� ����� �ϴ� �޼���
	void channelDown() { --channel; } //tv�� ä���� ���ߴ� ����� �ϴ� �޼���
}

  class TvTest4 {

	public static void main(String[] args) {
		Tv[] tvArr = new Tv [3]; //���̰� 3�� tv��ü �迭
		
		//tv��ü�� �����ؼ� tv��ü �迭�� �� ��ҿ� ����
		for(int i=0; i < tvArr.length; i++) {
			tvArr[i] = new Tv();
			tvArr[i].channel = i + 10; //tvArr[i]�� channel�� i + 10�� ����
		}
		for(int i=0; i < tvArr.length; i++) {
			tvArr[i].channelUp(); //tvArr[i]�� �޼��带 ȣ��. ä���� 1����
			System.out.printf("tvArr[%d}.channel= %d%n",i ,tvArr[i].channel);
		}
	}
}
