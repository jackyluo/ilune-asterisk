import cn.ilune.asteriskjava.manager.DefaultManagerConnection;
import cn.ilune.asteriskjava.manager.ManagerEventListener;
import cn.ilune.asteriskjava.manager.action.GetVarAction;
import cn.ilune.asteriskjava.manager.event.ManagerEvent;
import cn.ilune.asteriskjava.manager.response.GetVarResponse;
import cn.ilune.asteriskjava.manager.response.ManagerResponse;


public class GetVarActionClient {
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
		/*
		
 ast_serv_a*CLI> dialplan show chanvar SIP/101-00000079
============ ���ñ�����=============		
Variables for channel SIP/101-00000079:
BRIDGEPVTCALLID=ODZiMzFhOWY2MDE1MzYwMWI5N2FkNmM1NDNjZjZmM2Q.
BRIDGEPEER=SIP/801-00000078
DIALEDPEERNUMBER=101
SIPCALLID=6a8263db1c4e868a4ae09e5469e0d7f1@132.97.185.26:5060
 
 ���ñ�����
		ast_serv_a*CLI> core show channel SIP/101-00000089
 -- General --
           Name: SIP/101-00000089
           Type: SIP
       UniqueID: 1389931580.137
       LinkedID: 1389931563.136
      Caller ID: (N/A)
 Caller ID Name: (N/A)
Connected Line ID: 620
Connected Line ID Name: (N/A)
Eff. Connected Line ID: 620
Eff. Connected Line ID Name: (N/A)
    DNID Digits: (N/A)
       Language: en
          State: Up (6)
          Rings: 0
  NativeFormats: (ulaw)
    WriteFormat: ulaw
     ReadFormat: ulaw
 WriteTranscode: No 
  ReadTranscode: No 
1st File Descriptor: 31
      Frames in: 591
     Frames out: 600
 Time to Hangup: 0
   Elapsed Time: 0h0m54s
  Direct Bridge: SIP/132.97.185.21-00000088
Indirect Bridge: SIP/132.97.185.21-00000088
 --   PBX   --
        Context: LocalSets
      Extension: start
       Priority: 1
     Call Group: 0
   Pickup Group: 0
    Application: AppQueue
           Data: (Outgoing Line)
    Blocking in: ast_waitfor_nandfds
 Call Identifer: [C-0000004f]
 ==================================���ñ�����===========================
      Variables:
BRIDGEPVTCALLID=0817dbc423835125262b1d905750f91d@132.97.185.21:5060
BRIDGEPEER=SIP/132.97.185.21-00000088
SIPCALLID=61710d241348b33f15545111227a26a5@132.97.185.26:5060

  CDR Variables:
level 1: dnid=
level 1: clid=620
level 1: src=620
level 1: dst=start
level 1: dcontext=support_menu
level 1: channel=SIP/132.97.185.21-00000088
level 1: dstchannel=SIP/101-00000089
level 1: lastapp=Queue
level 1: lastdata=support
level 1: start=2014-01-17 12:06:20
level 1: duration=54
level 1: billsec=0
level 1: disposition=NO ANSWER
level 1: amaflags=DOCUMENTATION
level 1: uniqueid=1389931580.137
level 1: linkedid=1389931563.136
level 1: sequence=176

		 **/
		 
		String var = "DIALEDPEERNUMBER";
		String channel="SIP/101-0000008b";
		var ="CDR(src)";
		var ="CDR(lastdata)";
//		var = "CHANNEL(Name)";
//		var = "CHANNEL(LinkedID)";
//		var = "CHANNEL(channeltype)";
		
		ManagerResponse resp  = dmc.sendAction(new GetVarAction(channel,var));
		//org.asteriskjava.manager.response.ManagerError  response='Error';
		//response='Success'
		//(GetVarResponse)
		System.out.println("GetVarAction resp="+resp);
		if("Success".equals(resp.getResponse())){
			GetVarResponse vresp = (GetVarResponse)resp;
			System.out.println("GetVarAction resp="+vresp.getValue());
		}
		 
	
		//Thread.sleep(5*1000);
		
		 
		dmc.logoff();
	}
}
