package DI_Annotation_02;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;



public class MonitorViewer {
	
	
	//Setter 통한 자동 주입
	private Recorder recorder;
	
	public Recorder getRecorder() {
		return recorder;
	}
	
	@Autowired //타입 기반 ( IOC 컨테이너 안에 Recorder 타입을 가지는 객체가 있으면 자동으로 주소값을 주입
	@Qualifier("corder1")  //<qualifier value = "corder1"></qualifier>
	public void setRecorder(Recorder recorder) {
		this.recorder = recorder;
		System.out.println("setter 주입 성공 ! : " + recorder);
	}
	
	//일반 함수 !
	@Autowired
	@Qualifier("corder2")  //<qualifier value = "corder2"></qualifier>
	public void Gmethod(Recorder recorder) {
		System.out.println("G method(ref) : " +  recorder);
	}
}
