package com.example.sexyguy.motivation.changeGoalOpt;

import android.content.Context;

public interface ChangeGoalContract {

    interface view{
        Context getContext();
    }

    interface presenterForView{
        void updateChangedGoalString(String changedGoal, String changedImg, String changedDate);
    }

    interface presenterForModel{
        Context getContext();
    }

    interface model{
        void updateChangedGoalString(String changedGoal, String changedImg, String changedDate);
    }

}
