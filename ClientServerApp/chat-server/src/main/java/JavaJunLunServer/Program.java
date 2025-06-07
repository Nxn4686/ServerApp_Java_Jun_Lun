package JavaJunLunServer;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.UnknownHostException;

/**
 * ДЗ!
 * Добавить третью конфигурацию (запуск 3-го клиента)
 * но так, чтобы если клиент1 отправил сообщение клиенту2, то клиент3 этого не увидел.
 * Нужно использовать символ @ в начале имени клиента, к которому обращаешься.
 */

public class Program {

    public static void main(String[] args) {
        try
        {
            ServerSocket serverSocket = new ServerSocket(1400);
            Server server = new Server(serverSocket);
            server.runServer();
        }
        catch (UnknownHostException e) {
            e.printStackTrace();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }

}