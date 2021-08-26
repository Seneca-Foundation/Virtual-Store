package com.senecafoundation;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

public class UserTest {
    private User systemUnderTest;

    @BeforeEach
    void createUser() {
        this.systemUnderTest = new User();
        this.systemUnderTest.setFilepath("src/main/java/com/senecafoundation/Users.csv");
    }
    @Test
    void testCreateAccount() {
        this.systemUnderTest.createAccount("Warren","green");
    }
    @Test
    void testVerifyLogin() {
        this.systemUnderTest.verifyLogin("Sarai","pink");
    }
}
