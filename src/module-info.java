module com.alex.Contacts {
    requires javafx.fxml;
    requires javafx.controls;
    requires java.xml;

    opens sample;
    opens sample.datamodel;
}