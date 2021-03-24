package mode.bridgeMode.imageFormat;

import mode.bridgeMode.Image;
import mode.bridgeMode.Matrix;

/**
 * @Author ws
 * @Date 2021/3/24 21:59
 * @Version 1.0
 */
public class BMPImage extends Image {
    @Override
    public void parseFile(String fileName) {
        System.out.println(fileName+"====>BMPImage");
        System.out.println("----------on----------");
        Matrix matrix = new Matrix();
        imp.doPaint(matrix);
    }
}
