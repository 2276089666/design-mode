package mode.structuralType.bridge.imageFormat;

import mode.structuralType.bridge.Image;
import mode.structuralType.bridge.Matrix;

/**
 * @Author ws
 * @Date 2021/3/24 22:03
 * @Version 1.0
 */
public class GIFImage extends Image {
    @Override
    public void parseFile(String fileName) {
        fileName=fileName.replaceAll(".bat",".GIFImage");
        Matrix matrix = new Matrix(fileName);
        imp.doPaint(matrix);

    }
}
