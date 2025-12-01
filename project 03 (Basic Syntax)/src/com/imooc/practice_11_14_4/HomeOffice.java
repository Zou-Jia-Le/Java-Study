package com.imooc.practice_11_14_4;

public class HomeOffice {
    //成员变量
    protected String name;//员工姓名
    protected char levelPerformance;//绩效等级
    protected float monthlyWages;//月工资
    protected float gratuities;//奖金

    //setter 、 getter方法
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public char getLevelPerformance() {
        return levelPerformance;
    }
    public void setLevelPerformance(char levelPerformance) {
        this.levelPerformance = levelPerformance;
    }
    public float getMonthlyWages() {
        return monthlyWages;
    }
    public void setMonthlyWages(float monthlyWages) {
        this.monthlyWages = monthlyWages;
    }
    public float getGratuities() {
        return gratuities;
    }
    public void setGratuities(float gratuities) {
        this.gratuities = gratuities;
    }

    //构造方法
    public HomeOffice(String name, char levelPerformance, float monthlyWages) {
        this.name = name;
        this.levelPerformance = levelPerformance;
        this.monthlyWages = monthlyWages ;
    }

    //成员方法
    final protected void gratuitiesCal() {
        switch (this.levelPerformance) {
            case 'a':
                this.gratuities = this.monthlyWages * 0.9F * 3;
                System.out.println(this.name + " -> 绩效等级：" + this.levelPerformance + "， 奖金：" + this.gratuities + "元");
            case 'A':
                this.gratuities = this.monthlyWages * 0.9F * 3;
                System.out.println(this.name + " -> 绩效等级：" + this.levelPerformance + "， 奖金：" + this.gratuities + "元");
                break;
            case 'b':
                this.gratuities = this.monthlyWages * 0.9F * 2;
                System.out.println(this.name + " -> 绩效等级：" + this.levelPerformance + "， 奖金：" + this.gratuities + "元");
            case 'B':
                this.gratuities = this.monthlyWages * 0.9F * 2;
                System.out.println(this.name + " -> 绩效等级：" + this.levelPerformance + "， 奖金：" + this.gratuities + "元");
                break;
            case 'c':
                this.gratuities = this.monthlyWages * 0.9F;
                System.out.println(this.name + " -> 绩效等级：" + this.levelPerformance + "， 奖金：" + this.gratuities + "元");
            case 'C':
                this.gratuities = this.monthlyWages * 0.9F;
                System.out.println(this.name + " -> 绩效等级：" + this.levelPerformance + "， 奖金：" + this.gratuities + "元");
                break;
            case 'd':
                this.gratuities = this.monthlyWages * 0.9F * 0.5F;
                System.out.println(this.name + " -> 绩效等级：" + this.levelPerformance + "， 奖金：" + this.gratuities + "元");
            case 'D':
                this.gratuities = this.monthlyWages * 0.9F * 0.5F;
                System.out.println(this.name + " -> 绩效等级：" + this.levelPerformance + "， 奖金：" + this.gratuities + "元");
            default:
                System.out.println("没有奖金");
        }
    }
}
