package framework;

import toolmanager.Client;

import java.util.Queue;

/**
 * Created by Артем on 12.11.2017.
 */
public class Tool extends Thread {
    private ProcessBuilder prBuilder;
    private Queue<Client> clients;
    boolean work;

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
        Process
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
