package com.it.study.tokyo.tian.y2020.d0201;

public class TestTry {
    // 1. catch 类型 先本身x 后父类x 后父类的父类x 以此类推x
    // 2. try 包裹的代码块进行异常捕捉
    // 3. 不管throw return, finally 一定会执行的
    public static void main(String[] args) throws Exception {
//        Student student = null;
        try {
            System.out.println("xxx");
            ZhanghuiException zhanghuiException = new ZhanghuiException();
            zhanghuiException.setName("zh");
            throw zhanghuiException;
        } catch (NullPointerException e) {
            ((ZhanghuiException) e).getName();
            System.out.println(e);
        } finally {
            System.out.println("end");
        }
    }

    static class Student {
        String name;

        public void setName(String name) {
            this.name = name;
        }
    }

    static class ZhanghuiException extends NullPointerException {
        String name;
        String lunch;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getLunch() {
            return lunch;
        }

        public void setLunch(String lunch) {
            this.lunch = lunch;
        }
    }
}
