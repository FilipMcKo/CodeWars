package CodeWars;

import java.util.ArrayList;
import java.util.List;

public class LoopInspector {
    public int loopSize(Node node) {
        boolean loopClosed = false;
        int indexOfLoopStart = 1;
        Node currentNode = node;
        List<Node> nodeList = new ArrayList<>();
        nodeList.add(currentNode);
        while (!loopClosed) {
            currentNode = currentNode.getNext();
            for (int i = 0; i < nodeList.size(); i++) {
                if (currentNode.equals(nodeList.get(i))) {
                    indexOfLoopStart = i;
                    loopClosed = true;
                }
            }
            nodeList.add(currentNode);
        }
        return nodeList.size() - indexOfLoopStart;
    }

}
