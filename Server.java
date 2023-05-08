import java.net.*;
import java.io.*;

public class Server {
    
    ServerSocket server;
    Socket socket;
    BufferedReader br;
    PrintWriter out;


    public Server(){
        try {
            server=new ServerSocket(7777);
            System.out.println("Server is ready to accept connections....");
            System.out.println("Waiting...");
            socket=server.accept(); 

            br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            out = new PrintWriter(socket.getOutputStream());

            startReading();
            startWriting();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void startReading(){
     //Thread 1
    }

    public void startWriting(){
     //Thread 2
    }
    
    public static void main(String[] args) {
        System.out.println("This is ther server.....Going to start");
        new Server();
    }
}
