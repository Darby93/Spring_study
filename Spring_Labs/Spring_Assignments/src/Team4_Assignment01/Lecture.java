package Team4_Assignment01;

public class Lecture implements BitCamp{
	private String name;
	
	
	public Lecture(String name) {
		this.name = name;
	}


	@Override
	public void LectureStart() {
		String startLecture = name + "아 수업시작했다 앉아라!\n";
		System.out.println(startLecture);
	}


	@Override
	public void LectureMiddle() {
		String middleLecture = name + "아 수업중이다 졸지마라!\n";
		System.out.println(middleLecture);
	}


	@Override
	public void LectureEnd() {
		String EndLecture = name + "아 수업 끝났다 담배피러가자!";
		System.out.println(EndLecture);
		  
	}

	
	
}
