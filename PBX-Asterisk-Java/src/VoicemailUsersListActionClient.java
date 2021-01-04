import cn.ilune.asteriskjava.manager.DefaultManagerConnection;
import cn.ilune.asteriskjava.manager.ManagerEventListener;
import cn.ilune.asteriskjava.manager.action.VoicemailUsersListAction;
import cn.ilune.asteriskjava.manager.event.ManagerEvent;
import cn.ilune.asteriskjava.manager.response.ManagerResponse;

/**
 *
 * E-MICE SOLUTIONS (GZ) LTD. Copyright c 2003-2014. All rights reserved.
 * 
 * This source code is the property of E-MICE SOLUTIONS (GZ) LTD. It is intended 
 * only for the use of E-MICE application development. Reengineering, reproduction
 * arose from modification of the original source, or other redistribution of this source 
 * is not permitted without written permission of the E-MICE SOLUTIONS (GZ) LTD.
 * 
 */
/** 
 * Project Name : AsteriskJava<br>
 * Package Name : <br>
 * File Name    : VoicemailUsersListActionClient.java<br>
 * Type Name    : VoicemailUsersListActionClient<br>
 * Created on   : 2014-1-7 ����6:11:52<br>
 * Created by   : JackyLuo <br>
 * Note:<br>
 *
 * 
 */
public class VoicemailUsersListActionClient {

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
		
		 
		ManagerResponse resp = dmc.sendAction(new VoicemailUsersListAction());		
		System.out.println("VoicemailUsersListAction resp="+resp);
		 
	
	//	Thread.sleep(30*1000);
		
		 
		dmc.logoff();
	}

}
