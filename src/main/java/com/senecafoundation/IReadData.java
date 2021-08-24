package com.senecafoundation;

import java.util.List;
import java.util.UUID;

public interface IReadData {
    public StoreItem Read(UUID ID);
    public List<StoreItem> ReadAll();
}
