import cn.ilune.asteriskjava.manager.DefaultManagerConnection;
import cn.ilune.asteriskjava.manager.ManagerEventListener;
import cn.ilune.asteriskjava.manager.action.QueueStatusAction;
import cn.ilune.asteriskjava.manager.event.ManagerEvent;
import cn.ilune.asteriskjava.manager.response.ManagerResponse;


public class QueueStatusActionClient {



public static void main(String[] args) throws Exception {
		
		String ip="132.97.185.26",username="admin",pwd="123456";
		
		if(args!=null ){
			if(args.length==1)
				ip = args[0];
			if(args.length==2){
				ip = args[0];
				username = args[1];
			}
			if(args.length>=3){
				ip = args[0];
				username = args[1];
				pwd = args[2];
			}
		}			
		
		DefaultManagerConnection dmc = new DefaultManagerConnection();
		
		dmc.setUsername(username);			
		dmc.setHostname(ip);
		dmc.setPassword(pwd);
				 
		//dmc = getDefaultManagerConnection();
		dmc.login();
		
		dmc.addEventListener(new ManagerEventListener() {			
			public void onManagerEvent(ManagerEvent event) {			 
				System.out.println(event);
			}
		});
		
		
		
		String queue = null;
		queue = "sales";
		//queue = "support";
		queue = "Test1";
		QueueStatusAction qa = new QueueStatusAction(queue);
		qa.setActionId("QueueStatusAction-0001");
		ManagerResponse resp = dmc.sendAction(qa);		
		System.out.println("QueueStatusAction resp="+resp);
		//QueueParamsEvent - generated 
		//QueueMemberEvent - mapping to queue member
		//QueueEntryEvent - mapping to queue caller
		//QueueStatusCompleteEvent - complete
		//Thread.sleep(3*1000);
		
		 
		dmc.logoff();
	}


}
