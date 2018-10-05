package bao.dev;


import java.sql.Connection;

import javax.servlet.ServletRequest;

public class MyUtils1 {

   public static final String ATT_NAME = "MY_CONNECTION_ATTRIBUTE";

  
   public static void storeConnection(ServletRequest request, Connection conn) {
       request.setAttribute(ATT_NAME, conn);
   }

   public static Connection getStoredConnection(ServletRequest request) {
       Connection conn = (Connection) request.getAttribute(ATT_NAME);
       return conn;
   }
}