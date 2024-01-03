package com.example;


//write your class implementation here
// 10000歩歩けばactiveDays()に１加算。
// 何らかの方法ですべての日のデータを保存する。
// それらを日数で割って平均を求める。averageSteps()
// addDailyStepsを使って日ごとのデータを保存もしくは加算
public class StepTracker{
        private final int minStepsActive;
        private int activeDays;
        private int days;
        private int totalSteps;
    
        public StepTracker(int minStepsActive)
        {
            this.minStepsActive = minStepsActive;
            activeDays = 0;
            days = 0;
            totalSteps = 0;
        }
    
        public void addDailySteps(int steps)
        {
            if(steps >= minStepsActive)
                activeDays++;
    
            days++;
            totalSteps += steps;
        }
    
        public int activeDays()
        {
            return activeDays;
        }
    
        public double averageSteps()
        {
            if(days == 0)
                return 0;
    
            return totalSteps / (double) days;
        }
    }