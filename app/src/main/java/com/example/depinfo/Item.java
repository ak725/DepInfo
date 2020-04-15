package com.example.depinfo;

class Item {

    private String itemName;
    private String itemDescription;
    private String ItemPhoneNumber;

    Item(String name, String description, String ph) {
        this.itemName = name;
        this.itemDescription = description;
        this.ItemPhoneNumber = ph;
    }

    String getItemName() {
        return this.itemName;
    }

    String getItemDescription() {
        return itemDescription;
    }

    String getItemPhoneNumber(){
        return this.ItemPhoneNumber;
    }
}