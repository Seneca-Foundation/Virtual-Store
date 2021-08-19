package com.senecafoundation;

import java.util.UUID;

public interface IReadData extends IHandleData {
    public StoreItem Read(UUID ID);
}
