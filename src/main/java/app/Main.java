package app;

import com.yahoo.elide.standalone.ElideStandalone;

public class Main {
    public static void main(String[] args) throws Exception {
        ElideStandalone elide = new ElideStandalone(new Settings());
        elide.start();
    }
}