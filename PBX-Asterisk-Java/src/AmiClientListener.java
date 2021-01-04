

import java.sql.Timestamp;

import cn.ilune.asteriskjava.manager.DefaultManagerConnection;
import cn.ilune.asteriskjava.manager.ManagerEventListener;
import cn.ilune.asteriskjava.manager.event.ManagerEvent;

public class AmiClientListener  {
	 
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
		
		
		//100seconds
		//SendActionThread thread = new SendActionThread(dmc);
		//thread.start();
		// wait for 3 seconds to receive events
		//only run 3000 seconds
		boolean b = true;
		while(b)
		{
			System.out.println(new Timestamp(System.currentTimeMillis()).toString()+": AmiClientListener...");
			Thread.sleep(20*1000);
			
		}
		//Thread.sleep(60*1000 * 60*24);
		dmc.logoff();
	}
}
