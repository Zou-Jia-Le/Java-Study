package com.imooc.assembly.myset;

public class Family {
    //成员变量
    private String familyNumber;//家庭申请编码
    private float familyScore;//家庭积分
    private String regTime;

    //getter、setter方法
    public String getFamilyNumber() {
        return familyNumber;
    }
    public void setFamilyNumber(String familyNumber) {
        this.familyNumber = familyNumber;
    }
    public float getFamilyScore() {
        return familyScore;
    }
    public void setFamilyScore(float familyScore) {
        this.familyScore = familyScore;
    }
    public String getRegTime() {
        return regTime;
    }
    public void setRegTime(String regTime) {
        this.regTime = regTime;
    }

    //构造方法
    public Family() {
    }
    public Family(String familyNumber, float familyScore, String regTime) {
        this.familyNumber = familyNumber;
        this.familyScore = familyScore;
        this.regTime = regTime;
    }

    //成员方法
    @Override
    public String toString() {
        return "com.imooc.assembly.myset.Family{" +
                "familyNumber='" + familyNumber + '\'' +
                ", familyScore=" + familyScore +
                ", regTime='" + regTime + '\'' +
                '}';
    }
}
