package com.bazinga.rabbit.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

public class ZipUtil {

    /**
     * 将指定文件GZ压缩，并删除原文件。
     */
    public static void gzip(String fileName) throws Exception {
        String outFileName = fileName + ".gz";
        GZIPOutputStream out = new GZIPOutputStream(new FileOutputStream(outFileName));
        FileInputStream in = new FileInputStream(fileName);
        byte[] buf = new byte[1024];
        int len;
        while ((len = in.read(buf)) > 0) {
            out.write(buf, 0, len);
        }
        in.close();
        out.finish();
        out.close();
        new File(fileName).delete();
    }


    /**
     * 将指定GZ文件解压缩，并删除原文件。
     */
    public static void gunzip(String gzFileName) throws Exception {
        String outFileName = gzFileName.substring(0, gzFileName.length() - 3);
        // 文本文件输出流
        GZIPInputStream gzFileInput = new GZIPInputStream(new FileInputStream(gzFileName));
        FileOutputStream fileOutput = new FileOutputStream(outFileName);
        byte[] buf = new byte[1024];
        int len;
        while ((len = gzFileInput.read(buf)) > 0) {
            fileOutput.write(buf, 0, len);
        }
        gzFileInput.close();
        fileOutput.close();
       // new File(gzFileName).delete();
    }

    public static void main(String[] args) {

        try {
            gunzip("E:\\gz\\20230304.csv.gz");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
