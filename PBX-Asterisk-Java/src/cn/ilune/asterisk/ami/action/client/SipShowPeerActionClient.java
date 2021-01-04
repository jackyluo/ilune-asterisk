package cn.ilune.asterisk.ami.action.client;
import cn.ilune.asteriskjava.manager.DefaultManagerConnection;
import cn.ilune.asteriskjava.manager.ManagerConnection;
import cn.ilune.asteriskjava.manager.ManagerConnectionFactory;
import cn.ilune.asteriskjava.manager.ManagerEventListener;
import cn.ilune.asteriskjava.manager.action.SipShowPeerAction;
import cn.ilune.asteriskjava.manager.event.ManagerEvent;
import cn.ilune.asteriskjava.manager.response.ManagerResponse;
import cn.ilune.asteriskjava.manager.response.SipShowPeerResponse;


public class SipShowPeerActionClient {
	public static void main(String[] args) throws Exception {
		String host="168.150.18.247",user="admin",pwd="AMI123456Admin";
		host="192.168.118.233";
		ManagerConnectionFactory factory = new ManagerConnectionFactory(host,user,pwd);
		ManagerConnection conn = factory .createManagerConnection(); 
		conn.addEventListener(new ManagerEventListener() {			
			public void onManagerEvent(ManagerEvent event) {			 
				System.out.println(event);
			}
		});
		conn.login();
		SipShowPeerAction action = new SipShowPeerAction();
		//action.setPeer("810");
		
		ManagerResponse resp = conn.sendAction(action);
		if(resp instanceof SipShowPeerResponse){
			SipShowPeerResponse sipResp =(SipShowPeerResponse)resp;
			System.out.println("status = "+sipResp.getStatus());
			System.out.println(sipResp);
		}else
			System.out.println("SipShowPeerAction resp="+resp);
		
		conn.logoff();
	}
	
public static void main2(String[] args) throws Exception {
		
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
		
		
		ManagerResponse resp1 = dmc.sendAction(new SipShowPeerAction());
		System.out.println("SipShowRegistryAction resp="+resp1);
		
		ManagerResponse resp = dmc.sendAction(new SipShowPeerAction("811"));
		if(resp instanceof SipShowPeerResponse){
			SipShowPeerResponse sipResp =(SipShowPeerResponse)resp;
			System.out.println("status = "+sipResp.getStatus());
			System.out.println(sipResp);
		}else
			System.out.println("SipShowPeerAction resp="+resp);
		 
	
		Thread.sleep(10*1000);
		
		 
		dmc.logoff();
	}
}
