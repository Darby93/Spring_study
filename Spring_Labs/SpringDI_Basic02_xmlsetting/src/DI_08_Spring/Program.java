package DI_08_Spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Program {

	public static void main(String[] args) {
		/*
		JobExecute jobexecute = new JobExecute("hong", 100L);
		//생성자 주입
		
		ArticleDao articledao = new ArticleDao();
		jobexecute.setArticledao(articledao); //setter 주입 (참조값)
		
		jobexecute.setData(500); //setter 주입 (값)
		*/

		
		ApplicationContext context = 
				new GenericXmlApplicationContext("classpath:DI_08_Spring/DI_08.xml");
		
		
	}

}
