package com.senecafoundation.DataHandlers;

import java.util.List;
import java.util.UUID;

import com.senecafoundation.StoreItem;

public interface IReadData {
    public StoreItem Read(UUID ID);
    public List<StoreItem> ReadAll();
}
