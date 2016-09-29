/* 
** This program serves as the server of DNS query.
** Written in Java.
*/

import java.io.*;
import java.net.*;
import java.util.*;

class DNSServer {
	public static void main(String[] args) throws Exception {
		//Create a socket object called sSock, of type ServerSocket for TCP.
		ServerSocket sSock = null;
		try {
			// Try to open server socket 5001.
			sSock =  new ServerSocket(5001);
		} catch (Exception e) {
			System.out.println("Could not listen on port: 5001.");
			System.exit(1); // Handle exceptions.
		}

		System.out.println("Server is listening...");
		new monitorQuit().start(); // Start a new thread to monitor exit signal.

		while (true) {
			//If there is a pending client connection, start new query thread.
			new dnsQuery(sSock.accept()).start();
		}
	}
}
