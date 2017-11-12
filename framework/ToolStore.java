package framework;

/**
 * Created by Артем on 12.11.2017.
 */
public interface ToolStore {

    String[] getToolsList();

    void addTool(String toolName);

    void removeTool(String toolName);
}
