package com.imooc.practice_14_17_9;

public class AvgScores {
    //成员变量
    private float chineseAvgScore;//语文平均成绩
    private float mathAvgScore;//数学平均成绩
    private float englishAvgScore;//英语平均成绩

    //setter、getter方法
    public float getChineseAvgScore() {
        return chineseAvgScore;
    }
    public void setChineseAvgScore(float chineseAvgScore) {
        this.chineseAvgScore = chineseAvgScore;
    }
    public float getMathAvgScore() {
        return mathAvgScore;
    }
    public void setMathAvgScore(float mathAvgScore) {
        this.mathAvgScore = mathAvgScore;
    }
    public float getEnglishAvgScore() {
        return englishAvgScore;
    }
    public void setEnglishAvgScore(float englishAvgScore) {
        this.englishAvgScore = englishAvgScore;
    }

    //构造方法
    public AvgScores() {
    }
    public AvgScores(float chineseAvgScore, float mathAvgScore, float englishAvgScore) {
        this.chineseAvgScore = chineseAvgScore;
        this.mathAvgScore = mathAvgScore;
        this.englishAvgScore = englishAvgScore;
    }
}
