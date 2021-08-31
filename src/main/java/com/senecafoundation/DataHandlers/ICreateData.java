package com.senecafoundation.DataHandlers;

import java.util.UUID;

import com.senecafoundation.FundamentalObjects.StoreItem;

public interface ICreateData{
    public UUID Create(StoreItem item);
}
