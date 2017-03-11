package com.ros2.rcljava.tool;

import static org.junit.Assert.*;

import org.junit.Test;

import org.ros2.rcljava.tool.Ros2Services;

public class TestRos2Services {

    @Test
    public final void testEmpty() throws InterruptedException {
        Ros2Services.main(new String[]{});
        assertEquals(true, true);
    }

    @Test
    public final void testBadCommand() throws InterruptedException {
        Ros2Services.main(new String[]{"foo"});
        assertEquals(true, true);
    }

    @Test
    public final void testFind() throws InterruptedException {
        Ros2Services.main(new String[]{"find"});
        Ros2Services.main(new String[]{"find", "rcl_interfaces/ListParameters"});
        assertEquals(true, true);
    }

    @Test
    public final void testList() throws InterruptedException {
        Ros2Services.main(new String[]{"list"});
        assertEquals(true, true);
    }


    @Test
    public final void testType() throws InterruptedException {
        Ros2Services.main(new String[]{"type"});
        Ros2Services.main(new String[]{"type", "/ros2services/_list_parameters"});
        assertEquals(true, true);
    }

    @Test
    public final void testInfo() throws InterruptedException {
        Ros2Services.main(new String[]{"info"});
        assertEquals(true, true);
    }

    @Test
    public final void testBw() throws InterruptedException {
        Ros2Services.main(new String[]{"req"});
        Ros2Services.main(new String[]{"req", "/ros2services/_list_parameters"});
        Ros2Services.main(new String[]{"req", "/ros2services/_list_parameters", "rcl_interfaces/ListParameters"});
        assertEquals(true, true);
    }

}