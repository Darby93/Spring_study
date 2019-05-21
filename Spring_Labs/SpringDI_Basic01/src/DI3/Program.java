package DI3;

import Spring_DI4.NewRecord;
import Spring_DI4.NewRecordView;

public class Program {
	public static void main(String[] args) {
		
		
		//NewRecordView view = new NewRecordView(100, 70, 80);
		
				NewRecord record = new NewRecord();
				NewRecordView view = new NewRecordView();
				
				
				view.setRecord(record);
				view.input();
				view.print();
		
		
	}
}
