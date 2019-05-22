package DI_Annotation_04;

import javax.annotation.Resource;



public class MonitorViewer {
	
	
	//Setter 통한 자동 주입
	private Recorder recorder;
	
	public Recorder getRecorder() {
		return recorder;
	}
	
	@Resource(name="dd") //by name (같은 타입이 여러개 있더라도 name 하나 선택)
	public void setRecorder(Recorder recorder) {
		this.recorder = recorder;
		System.out.println("setter 주입 성공 ! : " + recorder);
	}

}
