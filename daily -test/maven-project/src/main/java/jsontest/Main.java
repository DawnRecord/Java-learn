package jsontest;

import com.alibaba.fastjson.JSONObject;

/**
 * @program: daily -test
 * @author: Dawn
 * @create: 2020-12-03 15:57
 */
public class Main {
    public static void main(String[] args) {
        String path = "D:\\Dawn\\company\\inspur\\mec\\upf\\中兴文件\\v1\\naf\\gr\\cm\\files\\syncvim\\NFV-RP-GDZJBG-00C-ZX-01\\20201203\\VIM-NFV-RP-GDZJBG-00C-ZX-01-RES-20201203020159-20201203144559-20201203144600-001";

        String jsonStr = FileUtil.ReadFile(path);
        System.out.println(jsonStr);
        JSONObject jsonObject = JSONObject.parseObject(jsonStr);
        System.out.println(jsonObject.toJSONString());
        String createAt = jsonObject.getString("CreateAt");
        System.out.println(createAt);

        /**
         * 1. 物理资源没有
         * 2. 文件需要的是哪一个部分，内容比较多。vnf存在多种类型文件，都要解析吗
         * 3. 资源 json文件数据 csv文件数据 性能 json文件 解析没问题；性能ems是txt文件，这个解析会比较麻烦，需要一行一行获取。
         */


    }
}
