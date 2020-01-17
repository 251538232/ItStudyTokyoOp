package com.it.study.tokyo.tian.y2020.d0111;

import java.util.*;

// 人名排序
public class TestArea {
    // 【需求】
    // 快速选定一个想要的国家/地区名称  客户5元  5000实现

    // 1. 分大洲 排序
    // 2. 不分直接拼音排序

    // 【基础设计】
    // input:全部国家 地区名字   unit states
    // （中文+拼音排序）  unit states 英文拼音排序
    // 地区化差异
    // 按照26个英文字母进行排序
    // 获取地理位置（坐标）
    // 美工，世界地图，VR，3D

    // out:  排序分组好的国家地区 （首字母索引） 列表


    /**
     * 【详细】功能 算法
     * 1.拿到所有的国家名称汉字信息，拼音信息
     * 1.1 拉取全球国家汉字，拼音信息
     * 1.2 存储到数据库（数据库设计）>
     * <p>
     * 2.拿到以后->分组（首字母分组）  排序
     * 2.1 从数据库里查询
     * 2.2 结果集 ->
     * Area{
     * String pinyin;
     * String name;
     * }
     * 未排序的List<Area>
     * 2.3 对结果集进行处理（先分组再排序）
     * zhongguo 中国
     * meiguo    美国
     * andaoer   安道尔
     * aerjiliya 阿尔及利亚
     * riben     日本
     * <p>
     * 返回值： List<AreaData>
     * AreaData{
     * String firstA;
     * List<Area> areas;// 拼音列表排序后的
     * }
     * <p>
     * 3.分组打印展示  frontend
     *
     * @param args
     */
    public static void main(String[] args) {
        // dummy data
        // 初始化
        ArrayList<Area> areas = new ArrayList<Area>() {
            {
                add(new Area("andaoer", "安道尔"));
                add(new Area("yilang", "伊朗"));
                add(new Area("ruidian", "瑞典"));
                add(new Area("aodaliya", "澳大利亚"));
                add(new Area("riben", "日本"));
                add(new Area("yilake", "伊拉克"));
                add(new Area("aerjiliya", "阿尔及利亚"));
            }
        };

        /**
         *
         * alt+shift+R
         *对获取的结果集进行排序
         */
        List<String> pinyins = new ArrayList<>();
        for (int i = 0; i < areas.size(); i++) {
            pinyins.add(areas.get(i).getPinyin());
        }
        // 1. 排序
        Collections.sort(pinyins);

        // 2.分组
        // 分组的逻辑 首字母进行分组
        // key : 首字母 , value 首字母为a的排好序的area列表
        Map<String, List<Area>> result = new HashMap<>();
        for (int i = 0; i < pinyins.size(); i++) {
            // now py
            String py = pinyins.get(i);
            // get pinyin first al
            String firstA = py.substring(0, 1);
            // map不包含firsta
            if (!result.containsKey(firstA)) {
                List<Area> areaList = new ArrayList<>();
                areaList.add(getByPinyin(py, areas));
                result.put(firstA, areaList);
            } else {
                // 获取既有的国家列表列表
                List<Area> areaList = result.get(firstA);
                areaList.add(getByPinyin(py, areas));
            }
        }

        for (Map.Entry<String, List<Area>> entry : result.entrySet()) {
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
            System.out.println("================================================================");
        }
    }

    /**
     * 通过拼音查找Area对象
     *
     * @param paramPinyin 输入拼音参数
     * @param areaList    地区列表
     * @return 对应的地区列表，找不到的情况下返回null
     */
    private static Area getByPinyin(String paramPinyin, List<Area> areaList) {
        for (int i = 0; i < areaList.size(); i++) {
            if (areaList.get(i).getPinyin().equals(paramPinyin)) {
                return areaList.get(i);
            }
        }
        return null;
    }
}
