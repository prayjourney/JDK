/*
 * Copyright (c) 2009, 2012, Oracle and/or its affiliates. All rights reserved.
 * ORACLE PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 */
package org.graalvm.compiler.jtt.optimize;

import org.junit.Test;

import org.graalvm.compiler.jtt.JTTTest;

/*
 * Tests constant folding of integer operations.
 */
public class Reduce_Long03 extends JTTTest {

    public static long test(long arg) {
        if (arg == 0) {
            return add(5);
        }
        if (arg == 1) {
            return sub(10);
        }
        if (arg == 2) {
            return mul(5);
        }
        if (arg == 3) {
            return div(5);
        }
        if (arg == 4) {
            return mod(5);
        }
        if (arg == 5) {
            return and(15);
        }
        if (arg == 6) {
            return or(16);
        }
        if (arg == 7) {
            return xor(17);
        }
        return 0;
    }

    public static long add(long x) {
        return x + x;
    }

    public static long sub(long x) {
        return x - x;
    }

    public static long mul(long x) {
        return x * x;
    }

    public static long div(long x) {
        return x / x;
    }

    public static long mod(long x) {
        return x % x;
    }

    public static long and(long x) {
        return x & x;
    }

    public static long or(long x) {
        return x | x;
    }

    public static long xor(long x) {
        return x ^ x;
    }

    @Test
    public void run0() throws Throwable {
        runTest("test", 0L);
    }

    @Test
    public void run1() throws Throwable {
        runTest("test", 1L);
    }

    @Test
    public void run2() throws Throwable {
        runTest("test", 2L);
    }

    @Test
    public void run3() throws Throwable {
        runTest("test", 3L);
    }

    @Test
    public void run4() throws Throwable {
        runTest("test", 4L);
    }

    @Test
    public void run5() throws Throwable {
        runTest("test", 5L);
    }

    @Test
    public void run6() throws Throwable {
        runTest("test", 6L);
    }

    @Test
    public void run7() throws Throwable {
        runTest("test", 7L);
    }

}
