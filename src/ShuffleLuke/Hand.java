package ShuffleLuke;

import java.util.ArrayList;
import javax.swing.ImageIcon;

public class Hand {

    ArrayList<Integer> alnShuffle = new ArrayList<Integer>();
    ArrayList<Integer> alnCards = new ArrayList<Integer>();
    ArrayList<Integer> alnHand1 = new ArrayList<Integer>();
    ArrayList<Integer> alnHand2 = new ArrayList<Integer>();
public void Cards(){
    for(int i=0;i<52;i++){
       int  nRand = (int) (Math.random() * 52);
        alnCards.add(nRand);
//        System.out.println(alnCards.get(i));
    }
}


  public ArrayList<Integer> Hand1(){
      for(int i=0;i<26;i++){
          alnHand1.add(alnCards.get(i));
      }
      return alnHand1;
  }
  public ArrayList<Integer> Hand2(){
      for(int i=26;i<52;i++){
          alnHand2.add(alnCards.get(i));
      }
      return alnHand1;
  }
}
