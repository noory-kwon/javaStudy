
public class Exam01_StudentMain {

	public static void main(String[] args) {
		Student st1 = new Student();
		
//		st1.name = "ȫ�浿";
//		st1.number = "20150675";
//		st1.age = 22;
//		st1.scoreJava = 50;
//		st1.scoreWeb = 89;
//		st1.scoreAndroid = 77;
//		
//		Student st2 = new Student();
//		
//		st2.name = "�迵��";
//		st2.number = "20090541";
//		st2.age = 29;
//		st2.scoreJava = 90;
//		st2.scoreWeb = 25;
//		st2.scoreAndroid = 30;
//		
//		st1.show()
//		st2.show()
//      ��ü�� �ּ� : cntr + /
		
		st1.setName("�Ǵ���");
		System.out.println(st1.getName());
		st1.setAge(29);
		st1.setNumber("201602927");
		st1.setScoreAndroid(100);
		st1.setScoreJava(100);
		st1.setScoreWeb(100);
		st1.show();
	}

}
