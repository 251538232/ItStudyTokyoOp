package com.it.study.tokyo.tian.y2020.d0201;

public class TestFactory {

    // 工厂模式
    // 抽象工厂模式
    // 单例模式（有且只有一个实例）
    public static void main(String[] args) {
        Test2 test2 = new Test2();
        Test3 test3 = new Test3();

        Factory factory = new Factory();
        test2 = factory.getTest2();
        test3 = factory.getTest3();
    }

    static class Factory {
        Test2 test2;
        Test3 test3;

        public Factory() {
            test2 = new Test2();
            test3 = new Test3();
        }

        public Test2 getTest2() {
            return test2;
        }

        public void setTest2(Test2 test2) {
            this.test2 = test2;
        }

        public Test3 getTest3() {
            return test3;
        }

        public void setTest3(Test3 test3) {
            this.test3 = test3;
        }
    }

    static class Test2 {
    }

    static class Test3 {
    }
}
