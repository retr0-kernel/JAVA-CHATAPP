public class Client {
    
    Socket socket;
    
    public Client(){
    
        try {
            socket=new Socket("127.0.0.1",7777);
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        System.out.println("This is the client.....Going to start");
    }
}
