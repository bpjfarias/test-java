package br.com.blz.testjava.entity;

import br.com.blz.testjava.dto.in.InventoryDTOIn;
import br.com.blz.testjava.dto.in.WarehouseDTOIn;

import java.util.List;

public class Inventory {

    List<Warehouse> warehouses;

    public Inventory(InventoryDTOIn inventoryDTOIn) {
        this.setWarehouses(inventoryDTOIn.getWarehousesDTOIn());

    }

    private void setWarehouses(List<WarehouseDTOIn> warehousesDTOIn) {
        warehousesDTOIn.forEach(warehouseDTOIn -> this.warehouses.add(new Warehouse(warehouseDTOIn)));
    }

    public List<Warehouse> getWarehouses() {
        return warehouses;
    }
}