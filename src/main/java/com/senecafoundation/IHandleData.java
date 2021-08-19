package com.senecafoundation;

import java.util.UUID;

public interface IHandleData {
    public void HandleData(String filepath);
    public StoreItem Update(StoreItem item);
    public void Create(StoreItem item);
    public boolean Delete(UUID ID);
    public StoreItem Read(UUID ID);
}
