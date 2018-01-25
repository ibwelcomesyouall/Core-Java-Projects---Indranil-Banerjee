package org.indranil.learning.topicwise.ipaddress;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class IPAddress {

	public static void main(String[] args) {

	  InetAddress ip;
          InetAddress loopbackip;
          InetAddress googleip[];
	  try {

		ip = InetAddress.getLocalHost();
                InetAddress ipadip = InetAddress.getByAddress(new byte[] {(byte)192,(byte)168,(byte)0,(byte)1});
                loopbackip=InetAddress.getLoopbackAddress();
                //googleip=InetAddress.getAllByName("www.google.com");
		System.out.println("Current IP address : " + ip.getHostAddress());
                System.out.println("LoopBack IP address : " + loopbackip.getHostAddress());
                System.out.println(ip.isSiteLocalAddress());
                System.out.println(ip.getCanonicalHostName());
                System.out.println(ip.getHostAddress());
                System.out.println(ip.getHostName());
                System.out.println("My Tab IP is:"+ipadip.getHostName());
                /*for (InetAddress google: googleip)
                {
                    System.out.println(google);
                }*/
                

	  } catch (UnknownHostException e) {

		e.printStackTrace();

	  }

	}

}
