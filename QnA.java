import javax.swing.*;
import java.util.*;

public class QnA {
    String defResponse = "Your answer?";
    Random rand = new Random();
    String que = "";
    String ans = "";
    String response;
    List<QnA> Storage = new ArrayList<QnA>();

    QnA(String que, String ans)
    {
        this.que = que;
        this.ans = ans;
    }

    public void setQue(String que2){
        que = que2;
    }
    public void setAns(String ans2){
        ans = ans2;
    }
    public String getResponse(){
        return response;
    }

    public String displayQuestion(){
        response = JOptionPane.showInputDialog(que,defResponse);
        return response;
    }

    public boolean checkAnswer(String response) {
        return response.toUpperCase().trim().equals(ans);
    }

}
