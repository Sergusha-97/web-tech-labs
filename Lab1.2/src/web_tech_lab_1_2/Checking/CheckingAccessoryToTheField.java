package web_tech_lab_1_2.Checking;

import web_tech_lab_1_2.Data.DataForChecking;

/**
 * Created by Сергей on 16.09.2016.
 */
public class CheckingAccessoryToTheField {
    private boolean CheckFirstArea(DataForChecking coordinates) {
        if (coordinates.GetY()<=5 && coordinates.GetY()>=0){
            if (coordinates.GetX()<=4 && coordinates.GetX()>=-4)
                return true;
        }
        return false;

    }
        private boolean CheckSecondArea(DataForChecking coordinates) {
            if (coordinates.GetY()<=0 && coordinates.GetY()>=-3){
                if (coordinates.GetX()<=6 && coordinates.GetX()>=-6)
                    return true;
            }
            return false;

        }
        public boolean Check (DataForChecking coordinates){
            if (CheckFirstArea(coordinates) || CheckSecondArea(coordinates))
                return true;
            else
                return false;
        }
}
