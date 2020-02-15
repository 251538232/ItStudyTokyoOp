package com.it.study.tokyo.tian.y2020.d0208;

/**
 * 单例模式类
 */
public class Person implements Walk, Study {

    private static Person test = new Person();
    private String name;
    private Integer workStatus;

    public static Person getTest() {
        return test;
    }

    public static void setTest(Person test) {
        Person.test = test;
    }

    public Integer getWorkStatus() {
        return workStatus;
    }

    public void setWorkStatus(Integer workStatus) {
        this.workStatus = workStatus;
    }

    private Person() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static Person getInstance() {
        return test;
    }

    public void goSchool() {
        System.out.println("go school");
    }

    // 退休
    public void retire() {
        System.out.println("go retire");
    }

    // 上班
    public void goWork() {
        workStatus = 1;
        System.out.println("go work");
    }

    // wedding
    public void wedding() {
        System.out.println("go wedding");
    }

    // 宅
    public int home() {
        workStatus = 0;
        System.out.println("go home");
        return 2;
    }

    public int goNewWork() {
        workStatus = 1;
        System.out.println("go new Work");
        return 1;
    }

    public void gotoHell() {
        System.out.println(" gotoHell");
    }

    @Override
    public void canWalk() {
        System.out.println("i can walk");
    }

    @Override
    public void study() {
        System.out.println("study ing");
    }


}
