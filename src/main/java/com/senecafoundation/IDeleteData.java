package com.senecafoundation;

import java.util.UUID;

public interface IDeleteData extends IHandleData{
    public boolean Delete(UUID ID);
}
