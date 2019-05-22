package Team4_Assignment01;
  

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainClass {
	public static void main(String[] args) throws InterruptedException {
		
		ApplicationContext context = new AnnotationConfigApplicationContext(ConfigContext.class);
		
		BitCamp lecture = (BitCamp) context.getBean("lecture");

		
		lecture.LectureStart();
		Thread.sleep(3000);
		lecture.LectureMiddle();
		Thread.sleep(3000);
		lecture.LectureEnd();
		
	}
}
