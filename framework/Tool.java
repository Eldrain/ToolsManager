package framework;

import toolmanager.Client;

import java.io.File;
import java.util.Queue;

/**
 * Created by Артем on 12.11.2017.
 */
public class Tool extends Thread {
    private ProcessBuilder prBuilder;
    private String nameTool;
    private Queue<Client> clients;
    boolean work;

    public Tool(String path, String nameTool) {
        this.nameTool = nameTool;
        prBuilder = new ProcessBuilder();
        prBuilder.directory(new File(path));
    }

    @Override
    public void run() {
        work = true;

        while(work) {
            Client cl = clients.poll();
            if(cl != null) {
                String res = runTool(cl.getArgs());
                returnResults(res, cl);
            }
        }
    }

    private String runTool(String[] args) {
        prBuilder.command();
        Process p =
    }

    private void returnResults(String res, Client client) {
        client.setOutput(res);
    }

    public void addClient(Client client) {
        synchronized (clients) {
            clients.add(client);
        }
    }
}
