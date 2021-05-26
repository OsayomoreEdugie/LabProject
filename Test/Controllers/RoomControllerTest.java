package Controllers;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class RoomControllerTest {
    RoomController rc = new RoomController();
    String originalphone = "0734940645";

    @Test
    public void initialize() {
    }

    @Test
    public void fillrooms() {
    }

    @Test
    public void back() {
    }

    @Test
    public void executesearch() {
String code="eka1";
String actualphone = rc.executesearch(code);
        Assert.assertEquals(originalphone, actualphone);

    }
}