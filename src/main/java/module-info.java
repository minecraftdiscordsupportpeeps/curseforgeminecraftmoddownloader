module mdsp.minecraftmoddownloader {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires validatorfx;
    requires org.kordamp.ikonli.javafx;

    opens mdsp.minecraftmoddownloader to javafx.fxml;
    exports mdsp.minecraftmoddownloader;
}