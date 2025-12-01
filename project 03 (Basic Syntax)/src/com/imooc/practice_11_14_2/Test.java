package com.imooc.practice_11_14_2;

public class Test {
    public static void main(String[] args) {
        Applicant applicant = new Applicant("小慕","boy",18);
        applicant.interview();
        System.out.println("=====================");
        Recruiter recruiter = new Recruiter("大毛","boy","慕课网教育有限公司");
        recruiter.interview();
    }
}
