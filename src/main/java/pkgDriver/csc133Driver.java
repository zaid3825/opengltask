package pkgDriver;

import pkgSlRenderer.slRenderEngine;
import static pkgDriver.slSpot.*;
import pkgSlUtils.slWindowManager;

public class csc133Driver {
    public static void main(String[] my_args) {
        try {
            slRenderEngine my_re = new slRenderEngine();
            slWindowManager.get().initGLFWWindow(WIN_WIDTH, WIN_HEIGHT, "CSUS CSC133");
            my_re.initOpenGL(slWindowManager.get());
            my_re.render();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}