package com.company.workshop.web.orderinputobject;

import com.company.workshop.entity.OrderInputObject;
import com.haulmont.cuba.gui.components.AbstractEditor;
import com.haulmont.cuba.gui.components.TabSheet;

import javax.inject.Inject;

public class OrderInputObjectEdit extends AbstractEditor<OrderInputObject> {

    @Inject
    TabSheet mainTabSheet;


    public void showMainTab() {
        mainTabSheet.setSelectedTab("orderLocals");
    }

    public void showPartsTab() {
            mainTabSheet.setSelectedTab("parts");
    }

    public void showClientsTab() {
                mainTabSheet.setSelectedTab("clients");

    }

    public void showMechanincsTab() {
   mainTabSheet.setSelectedTab("mechanincs");
    }
}