package cn.dawnrecord;

import java.io.File;
import java.io.IOException;

/**
 * @program: daily -test
 * @author: Dawn
 * @create: 2020-12-03 14:32
 */
public class subStringTest {
    private static String newIP = "http://1.41.150.227:30889";
    private static String LOCALPATH = "D:\\Dawn\\company\\inspur\\mec\\upf\\中兴文件\\";

    public static void main(String[] args) throws IOException {
        String uri = "http://1.41.150.227:30889/v1/naf/gr/cm/files/syncvim/NFV-RP-GDZJBG-00C-ZX-01/20201117/VIM-NFV-RP-GDZJBG-00C-ZX-01-RES-20201117020150-20201117100556-20201117100556-001.gzip";


        String file_dir = LOCALPATH + uri.substring(uri.lastIndexOf(newIP) + newIP.length() + 1, uri.lastIndexOf("/"));
        System.out.println("file_path " + file_dir);
        File file1 = new File(file_dir);
        if(!file1.exists()){
            System.out.println(file1.getAbsolutePath());
            file1.mkdirs();
        }



        String file_path = LOCALPATH + uri.substring(uri.lastIndexOf(newIP) + newIP.length() + 1, uri.length());
        System.out.println("file_path " + file_path);
        File file = new File(file_path);
        if(!file.exists()){
            System.out.println(file.getAbsolutePath());
            file.createNewFile();
        }

    }
}
