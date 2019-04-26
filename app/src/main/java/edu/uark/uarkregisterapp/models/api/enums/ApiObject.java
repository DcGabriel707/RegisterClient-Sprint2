package edu.uark.uarkregisterapp.models.api.enums;

import edu.uark.uarkregisterapp.models.api.interfaces.PathElementInterface;

public enum ApiObject implements PathElementInterface {
    NONE(""),
    PRODUCT("product/"),
    EMPLOYEE("employee/"),
    TRANSACTION("transaction/"),
    TRANSACTION_TRANSITION("transactiontransition/");

    @Override
    public String getPathValue() {
        return value;
    }

    private String value;

    ApiObject(String value) {
        this.value = value;
    }
}
