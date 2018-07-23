
package Controller;

import com.mysql.jdbc.StringUtils;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.api.representation.Form;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import static java.lang.System.out;
import java.net.HttpURLConnection;
import java.net.URL;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.websocket.Session;
import com.api.Userapi;
import com.sun.jersey.core.util.MultivaluedMapImpl;
import java.net.MalformedURLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ws.rs.core.MultivaluedMap;

@WebServlet(name = "UserServlet", urlPatterns = {"/UserServlet"})
public class UserServlet extends HttpServlet {

    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
           
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
       /*Client client = Client.create();
       String email = request.getParameter("email");
       String password = request.getParameter("password");
       
       Form form = new Form();
       form.add("email", email);
       form.add("password", password);
       
       WebResource webresource = client.resource("http://localhost:8084/weboard/ws/user/login");
       ClientResponse clientresponce = webresource.accept("text/html").post(ClientResponse.class,form);
       
       String respon = " ";
       respon = clientresponce.toString();
        
        
        
        
        
        if(!respon.equals("false")){
            PrintWriter pw=response.getWriter();
            String user=respon;
            pw.println("<h1>Welcome "+user+"</h1>");
            /*RequestDispatcher requestdis;
            request.setAttribute("email", respon);
            requestdis = request.getRequestDispatcher("Home.jsp");
            requestdis.forward(request,response);
        }  
        else{
            PrintWriter pw=response.getWriter();
            String user=respon;
            pw.println("<h1>Welcome "+user+"</h1>");
        }
*/      
        String email = request.getParameter("email");
        String password = request.getParameter("password");
        Client c = Client.create();
        WebResource resource = c.resource("http://localhost:8084/weboard/ws/user/login");
        MultivaluedMap queryParams = new MultivaluedMapImpl();
        queryParams.add("email", email);
        queryParams.add("password", password);
        //String x = resource.queryParams(queryParams).
        String x = resource.queryParams(queryParams).post(String.class);
        //String responces = resource.post(String.class);
        PrintWriter pw=response.getWriter();
        
        pw.println("<h1>Welcome "+x+"</h1>");
    
    /*InputStream crunchifyInputStream = new FileInputStream("/Users/<username>/Documents/CrunchifyJSON.txt");
			InputStreamReader crunchifyReader = new InputStreamReader(crunchifyInputStream);
			BufferedReader br = new BufferedReader(crunchifyReader);
			String line;
			while ((line = br.readLine()) != null) {
				string += line + "\n";
			}
 
			JSONObject jsonObject = new JSONObject(string);
			System.out.println(jsonObject);
 
			// Step2: Now pass JSON File Data to REST Service
			try {
				URL url = new URL("http://localhost:8080/CrunchifyTutorials/api/crunchifyService");
				URLConnection connection = url.openConnection();
				connection.setDoOutput(true);
				connection.setRequestProperty("Content-Type", "application/json");
				connection.setConnectTimeout(5000);
				connection.setReadTimeout(5000);
				OutputStreamWriter out = new OutputStreamWriter(connection.getOutputStream());
				out.write(jsonObject.toString());
				out.close();
 
				BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
 
				while (in.readLine() != null) {
				}
				System.out.println("\nCrunchify REST Service Invoked Successfully..");
				in.close();
			} catch (Exception e) {
				System.out.println("\nError while calling Crunchify REST Service");
				System.out.println(e);
			}
 
			br.close();*/
    
    
    
    
  }
    
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
