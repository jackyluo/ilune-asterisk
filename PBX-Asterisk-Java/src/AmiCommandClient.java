import cn.ilune.asteriskjava.manager.DefaultManagerConnection;
import cn.ilune.asteriskjava.manager.ManagerEventListener;
import cn.ilune.asteriskjava.manager.action.CommandAction;
import cn.ilune.asteriskjava.manager.action.PingAction;
import cn.ilune.asteriskjava.manager.event.ManagerEvent;
import cn.ilune.asteriskjava.manager.response.ManagerResponse;

public class AmiCommandClient {

	public static void main(String[] args)throws Exception {
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
		
		DefaultManagerConnection dmc;

		dmc = new DefaultManagerConnection();
		
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
		
		String command = "!ls";
		//command = "sip show peers";
		//command = "core show hints";
		//command = "Command";
		command = "manager show command";
		
		ManagerResponse resp = dmc.sendAction(new CommandAction(command));
		System.out.println("StatusAction resp="+resp);
		 
		 resp = dmc.sendAction(new PingAction());
		System.out.println("StatusAction resp="+resp);
	
		Thread.sleep(3*1000);
		
		 
		dmc.logoff();
	}

}
