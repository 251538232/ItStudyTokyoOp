package com.it.study.tokyo.tian.y2020.d0208;

/**
 * 人生 需求 式样
 */
public class TestJinsei {

    // 分支语句
    // 条件语句
    // 循环语句
    // 中断
    // 异常
    // 变量定义

    /**
     * @param args
     */
    public static void main(String[] args) {
        // 1. 出生(吃饭睡觉)
        // 2. 走路
        // 3. 学习
        // 4. 上学
        // 5. 上班
        // 6. 结婚生娃
        // 7. 还是工作养娃
        // 8. 退休
        // 9. 死亡
        // xinlizhuangtai 1：积极 2：消极
        int xinlizhuangtai = 1;

        // 1. 老李出生
        Person laoli = Person.getInstance();
        laoli.setName("xiaoli");
        // 2. 走路
        laoli.canWalk();
        // 3. 学习
        laoli.study();
        // 4. 上学 6-26岁每天都干啥
        // 每100天休息30天
        // 当数字最后一位为2的时候休息
        // 当数字最后一位为4的时候休息
        for (int i = 0; i < 365 * 20; i++) {
            // 放假
            if (!String.valueOf(i).endsWith("2")
                    || !String.valueOf(i).endsWith("4")) {
                // take rest
                continue;
            }
            laoli.goSchool();
        }

        int workingStatus = 1;
        try {
            for (int i = 0; i < 365 * 20; i++) {
                // 放假
                if (!String.valueOf(i).endsWith("6")
                        || !String.valueOf(i).endsWith("7")) {
                    // take rest
                    continue;
                }
                // laoli.上班 throw 被辞退或者是跳槽
                laoli.goWork();
                if (i == 365 * 10) {
                    WorkException exception = new WorkException();
                    exception.setName("被开除");
                    laoli.setWorkStatus(0);
                    throw exception;
                }

                switch (xinlizhuangtai) {
                    case 1:// 积极状态心理
                        // 1:
//                    找工作
                        laoli.goNewWork();
                        break;
                    case 2:// 消极状态心理
                        // 宅
                        laoli.home();
                        break;
                    default:
//                    找工作
                        break;
                }
                // 结婚
                if (i == 365 * 5) {
                    if (laoli.getWorkStatus() == 0) {
                        // 非工作状态
                        // 不结婚
                        // 也不会有孩子了
                    } else {
                        // 工作状态
                        laoli.wedding();
                    }
                }
            }

            if (laoli.getWorkStatus() == 1) {
                // 非工作状态
                // 不结婚
                // 也不会有孩子了
                laoli.retire();
            }

        } catch (Exception e) {
            // 辞退异常，跳槽异常
            e.printStackTrace();
        } finally {
            laoli.gotoHell();
        }

    }


}
