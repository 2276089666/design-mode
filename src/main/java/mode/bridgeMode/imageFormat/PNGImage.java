package mode.bridgeMode.imageFormat;

import mode.bridgeMode.Image;
import mode.bridgeMode.Matrix;

/**
 * @Author ws
 * @Date 2021/3/24 21:58
 * @Version 1.0
 */
public class PNGImage extends Image {
    @Override
    public void parseFile(String fileName) {
        System.out.println(fileName+"====>PNGImage");
        System.out.println("----------on----------");
        Matrix matrix = new Matrix();
        imp.doPaint(matrix);
    }
}
