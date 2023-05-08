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
<<<<<<< HEAD
        // Thread - Read data from the user
        Runnable r1=()->{
            System.out.println("Reader Started...");
            try {
                while(true){
                    String msg=br.readLine();
                    if(msg.equals("exit")){
                        System.out.println("Client terminated the chat");
                        socket.close();
                        break;
                    }
                    System.out.println("Client : "+msg);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        };
        new Thread(r1).start();
    }

    public void startWriting(){
        // Thread - Take data from user and send to client
        Runnable r2=()->{
            System.out.println("Writer Started..");
            while(true){
                try {
                    BufferedReader br1=new BufferedReader(new InputStreamReader(System.in));
                    String content=br1.readLine();
                    out.println(content);
                    out.flush();
                } catch (Exception e) {
                    // TODO: handle exception
                    e.printStackTrace();
                }
            }
        };
        new Thread(r2).start();
=======
     //Thread 1
    }

    public void startWriting(){
     //Thread 2
>>>>>>> a235691f0c4e6e5cdebf9009053c6326ccbb672b
    }
    
    public static void main(String[] args) {
        System.out.println("This is ther server.....Going to start");
        new Server();
    }
}
//8/5/23
