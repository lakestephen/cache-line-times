# cache-line-times
Demonstrate the effect of cache line size on speed of memory access


* Results Mac

23:24:13,504 INFO  [main                     ] achelinetime.CacheLineTimeTest - increment[1], duration[86827us], itemsCount[134217728], throughput: itemsPerUs[1545]
23:24:13,559 INFO  [main                     ] achelinetime.CacheLineTimeTest - increment[2], duration[54496us], itemsCount[67108864], throughput: itemsPerUs[1231]
23:24:13,613 INFO  [main                     ] achelinetime.CacheLineTimeTest - increment[4], duration[54399us], itemsCount[33554432], throughput: itemsPerUs[616]
23:24:13,670 INFO  [main                     ] achelinetime.CacheLineTimeTest - increment[8], duration[56209us], itemsCount[16777216], throughput: itemsPerUs[298]
23:24:13,726 INFO  [main                     ] achelinetime.CacheLineTimeTest - increment[16], duration[56578us], itemsCount[8388608], throughput: itemsPerUs[148]
23:24:13,765 INFO  [main                     ] achelinetime.CacheLineTimeTest - increment[32], duration[37994us], itemsCount[4194304], throughput: itemsPerUs[110]
23:24:13,785 INFO  [main                     ] achelinetime.CacheLineTimeTest - increment[64], duration[20534us], itemsCount[2097152], throughput: itemsPerUs[102]
23:24:13,794 INFO  [main                     ] achelinetime.CacheLineTimeTest - increment[128], duration[8280us], itemsCount[1048576], throughput: itemsPerUs[126]
23:24:13,798 INFO  [main                     ] achelinetime.CacheLineTimeTest - increment[256], duration[4219us], itemsCount[524288], throughput: itemsPerUs[124]
23:24:13,801 INFO  [main                     ] achelinetime.CacheLineTimeTest - increment[512], duration[2428us], itemsCount[262144], throughput: itemsPerUs[107]
23:24:13,802 INFO  [main                     ] achelinetime.CacheLineTimeTest - increment[1024], duration[1338us], itemsCount[131072], throughput: itemsPerUs[97]
