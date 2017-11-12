package toolmanager;

/**
 * Created by Артем on 12.11.2017.
 */
public class Client {
    private String toolName;
    private String[] args;
    private String output;

    public Client(String toolName) {
        this.toolName = toolName;
        output = null;
    }

    public void setOutput(String output) {
        this.output = output;
    }

    public String getToolName() {
        return toolName;
    }

    public String[] getArgs() {
        return args;
    }
}
