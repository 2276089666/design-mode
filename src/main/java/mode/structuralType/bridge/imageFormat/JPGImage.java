package mode.structuralType.bridge.imageFormat;

import mode.structuralType.bridge.Image;
import mode.structuralType.bridge.Matrix;

/**
 * @Author ws
 * @Date 2021/3/24 21:38
 * @Version 1.0
 */
public class JPGImage extends Image {
    @Override
    public void parseFile(String fileName) {
        fileName=fileName.replaceAll(".bat",".JPGImage");
        Matrix matrix = new Matrix(fileName);
        imp.doPaint(matrix);

    }
}
