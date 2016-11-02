package com.concurrentperformance.cachelinetime;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * TODO comments???
 *
 * @author Steve Lake
 */
public class CacheLineTimeTest {

    private static final Logger log = LoggerFactory.getLogger(CacheLineTimeTest.class);

    public static void main(String[] args) {

        final byte[] largeArray = new byte[64 * 1024 * 1024 * 8] ;

        log.info("warm up");
        for (int i=0;i<20;i++) {
            iterate(largeArray, 1);
        }
        log.info("***Do It***");

        iterate(largeArray, 1);
        iterate(largeArray, 2);
        iterate(largeArray, 4);
        iterate(largeArray, 8);
        iterate(largeArray, 16);
        iterate(largeArray, 32);
        iterate(largeArray, 64);
        iterate(largeArray, 128);
        iterate(largeArray, 256);
        iterate(largeArray, 512);
        iterate(largeArray, 1024);
    }

    private static void iterate(byte[] largeArray, int increment) {
        long startNs = System.nanoTime();

        for (int i = 0; i < largeArray.length; i += increment) {
            largeArray[i] = (byte)i;
        }

        long durationUs = (System.nanoTime() - startNs)/1000;

        long itemsCount = largeArray.length / increment;
        long itemsPerUsCount = itemsCount / durationUs ;

        log.info("increment[{}], duration[{}us], itemsCount[{}], throughput: itemsPerUs[{}]", increment, durationUs, itemsCount, itemsPerUsCount);
    }
}
