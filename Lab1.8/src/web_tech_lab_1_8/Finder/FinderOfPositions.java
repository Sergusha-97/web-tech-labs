package web_tech_lab_1_8.Finder;

import java.util.*;
/**
 * Created by Сергей on 16.09.2016.
 */
public class FinderOfPositions {
    public ArrayList<Integer> FindPositionsToKeepIncreasing(ArrayList<Double>FirstSequence,ArrayList<Double>SecondSequence){
        ArrayList<Integer> positionToInsertBefore = new ArrayList<Integer>(SecondSequence.size());
        //ArrayList<Double> newSequence = new ArrayList<Double>(FirstSequence);
        int i =0;
        double comparingElement = FirstSequence.get(i);
        for (double element : SecondSequence){

            if (element < comparingElement)
                positionToInsertBefore.add(i);
            else{
                while (element > comparingElement){
                    i++;
                    if (i<FirstSequence.size())
                        comparingElement = FirstSequence.get(i);
                    else
                        break;
                }
                positionToInsertBefore.add(i);
                if (i>=FirstSequence.size())
                    break;
            }

        }


        return  positionToInsertBefore;
    }
}
