package com.company.workshop.web.orderinputobject;

import com.company.workshop.entity.Client;
import com.company.workshop.entity.Mechanic;
import com.company.workshop.entity.OrderInputObject;
import com.company.workshop.entity.SparePart;
import com.haulmont.cuba.core.global.Metadata;
import com.haulmont.cuba.gui.components.AbstractEditor;
import com.haulmont.cuba.gui.components.TabSheet;
import com.haulmont.cuba.gui.data.CollectionDatasource;

import javax.inject.Inject;
import java.util.UUID;

public class OrderInputObjectEdit extends AbstractEditor<OrderInputObject> {

    @Inject
    TabSheet mainTabSheet;

    @Inject
    private CollectionDatasource<Mechanic, UUID> mechanicsDs;

    @Inject
    private CollectionDatasource<Client, UUID> clientDs;

    @Inject
    private Metadata metadata;

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

    public void showInvoiceTab() {
        mainTabSheet.setSelectedTab("invoice");
    }

    @Override
    protected void postInit() {
        OrderInputObject orderInputObject = getItem();

        mechanicsDs.addCollectionChangeListener(e -> {
            orderInputObject.setMechanicsCount(mechanicsDs.size());
        });

        clientDs.addCollectionChangeListener(e -> {
            if (orderInputObject.getInvoiceRecipient() == null && clientDs.size() > 0) {
                orderInputObject.setInvoiceRecipient(clientDs.getItems().iterator().next());
            }
        });
    }

    @Override
    protected void initNewItem(OrderInputObject item) {
        SparePart part1 = metadata.create(SparePart.class);
        item.setPart1(part1);

        SparePart part2 = metadata.create(SparePart.class);
        item.setPart2(part2);

        SparePart part3 = metadata.create(SparePart.class);
        item.setPart3(part3);
    }
}