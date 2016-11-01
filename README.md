# cache-line-times
Demonstrate the effect of cache line size on speed of memory access


* Results Mac

- increment[1], duration[86827us], itemsCount[134217728], throughput: itemsPerUs[1545]
- increment[2], duration[54496us], itemsCount[67108864], throughput: itemsPerUs[1231]
- increment[4], duration[54399us], itemsCount[33554432], throughput: itemsPerUs[616]
- increment[8], duration[56209us], itemsCount[16777216], throughput: itemsPerUs[298]
- increment[16], duration[56578us], itemsCount[8388608], throughput: itemsPerUs[148]
- increment[32], duration[37994us], itemsCount[4194304], throughput: itemsPerUs[110]
- increment[64], duration[20534us], itemsCount[2097152], throughput: itemsPerUs[102]
- increment[128], duration[8280us], itemsCount[1048576], throughput: itemsPerUs[126]
- increment[256], duration[4219us], itemsCount[524288], throughput: itemsPerUs[124]
- increment[512], duration[2428us], itemsCount[262144], throughput: itemsPerUs[107]
- increment[1024], duration[1338us], itemsCount[131072], throughput: itemsPerUs[97]


* Results Windows

- increment[1], duration[80588us], itemsCount[134217728], throughput: itemsPerUs[1665]
- increment[2], duration[68889us], itemsCount[67108864], throughput: itemsPerUs[974]
- increment[4], duration[68030us], itemsCount[33554432], throughput: itemsPerUs[493]
- increment[8], duration[75008us], itemsCount[16777216], throughput: itemsPerUs[223]
- increment[16], duration[71988us], itemsCount[8388608], throughput: itemsPerUs[116]
- increment[32], duration[50516us], itemsCount[4194304], throughput: itemsPerUs[83]
- increment[64], duration[26692us], itemsCount[2097152], throughput: itemsPerUs[78]
- increment[128], duration[11231us], itemsCount[1048576], throughput: itemsPerUs[93]
- increment[256], duration[5529us], itemsCount[524288], throughput: itemsPerUs[94]
- increment[512], duration[3034us], itemsCount[262144], throughput: itemsPerUs[86]
- increment[1024], duration[1927us], itemsCount[131072], throughput: itemsPerUs[68]