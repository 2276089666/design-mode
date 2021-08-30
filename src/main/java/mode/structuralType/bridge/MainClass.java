package mode.structuralType.bridge;


import mode.structuralType.bridge.imageFormat.JPGImage;
import mode.structuralType.bridge.imageFormat.PNGImage;
import mode.structuralType.bridge.systemType.MacImpl;
import mode.structuralType.bridge.systemType.WindowsImpl;

/**
 * @Author ws
 * @Date 2021/3/24 22:06
 * @Version 1.0
 */
public class MainClass {
    public static void main(String[] args) {
        /**
         * 如果不桥接,我们每增加一种图片格式三种操作系统都得适配,每增加一种操作系统又得去适配三种图片格式
         * 我们利用桥接,可以让图片格式和操作系统两个维度独立的变化
         */
        Image pngImage =new PNGImage();
        pngImage.setImageImp(new WindowsImpl());
        pngImage.parseFile("aaa.bat");

        System.out.println();
        Image jpgImage =new JPGImage();
        jpgImage.setImageImp(new MacImpl());
        jpgImage.parseFile("aaa.bat");
        jpgImage.setImageImp(new WindowsImpl());
        jpgImage.parseFile("aaa.bat");


    }
}
