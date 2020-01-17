package com.it.study.tokyo.tian.y2020.d0111;

/**
 * 地区类
 * @author tian
 * @date 2020/1/11
 */
public class Area {

    /**
     * 地区汉语拼音
     */
    private String pinyin;
    /**
     * 地区汉语名
     */
    private String name;

    public Area(String pinyin, String name) {
        this.pinyin = pinyin;
        this.name = name;
    }

    public String getPinyin() {
        return pinyin;
    }

    public void setPinyin(String pinyin) {
        this.pinyin = pinyin;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Area{" +
                "pinyin='" + pinyin + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
