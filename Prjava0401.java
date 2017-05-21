/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prjava0401;

import java.net.*;

/**
* This program implements a silly application that simply displays
* "Hello World!" to the <b>standard</b> output
* 
* @author Xavi
* @version 0.3
* @since 2017-01-01
*/
public class Prjava0401 {

    /**
     * 
     * @param numA First number
     * @param numB Second number
     * @return int Addition
     */
    public static int AddNum(int numA, int numB) {
        return numA+numB;
    }
    /**
     * 
     * @param args Not used
     */
    public static void main(String[] args) {
        System.out.println("Hello World!");
        System.out.println("Project Prjava0401 Version 0.2");
        try {
            InetAddress addr = InetAddress.getLocalHost();
            String ipAddr = addr.getHostAddress();
            String hostname = addr.getHostName();
            System.out.println("Hostname = "+hostname);
            System.out.println("IP Address = "+ipAddr);
            System.out.println("Username = "+System.getProperty("user.name"));
            System.out.println("Personal folder = "+System.getProperty("user.home"));
            System.out.println("Operating System = "+System.getProperty("os.name"));
            System.out.println("OS Version = "+System.getProperty("os.version"));
 
            System.out.println("5 + 2 = "+ AddNum(5,2));
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
    }
    
}
