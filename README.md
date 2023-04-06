测试结果：


# JMH version: 1.36
# VM version: JDK 17.0.3.0.101, Zing 64-Bit Tiered VM, 17.0.3.0.101-zing_22.02.300.0-b1-product-linux-X86_64
# *** WARNING: JMH support for this VM is experimental. Be extra careful with the produced data.
# VM invoker: /root/java/zing22.02.300.0-1-jdk17.0.3.0.101-linux_x64/bin/java
# VM options: -Xmx48g -Xms48g -XX:+PrintGCDetails -XX:+ProfileLiveObjects -XX:+PrintGCApplicationStoppedTime -XX:+HeapDumpOnOutOfMemoryError -Xloggc:gc_%t_%p.log
# Blackhole mode: compiler (auto-detected, use -Djmh.blackhole.autoDetect=false to disable)
# Warmup: 1 iterations, 10 s each
# Measurement: 3 iterations, 10 s each
# Timeout: 10 min per iteration
# Threads: 1 thread, will synchronize iterations
# Benchmark mode: Average time, time/op
# Benchmark: benchmark.BigObjectAccessBenchmark.loop
# Parameters: (accessMode = FIXED)

# Run progress: 0.00% complete, ETA 00:06:00
# Fork: 1 of 1
# Preparing profilers: LinuxPerfProfiler
# Profilers consume stderr from target VM, use -v EXTRA to copy to console
# Warmup Iteration   1: 108.169 ns/op
Iteration   1: 111.095 ns/op
Iteration   2: 98.516 ns/op
Iteration   3: 98.639 ns/op
# Processing profiler results: LinuxPerfProfiler


Result "benchmark.BigObjectAccessBenchmark.loop":
102.750 ?(99.9%) 131.855 ns/op [Average]
(min, avg, max) = (98.516, 102.750, 111.095), stdev = 7.227
CI (99.9%): [? 0, 234.605] (assumes normal distribution)

Secondary result "benchmark.BigObjectAccessBenchmark.loop:?perf":
Perf stats:
--------------------------------------------------

          63276.12 msec task-clock                #    1.259 CPUs utilized          
              7244      context-switches          #    0.114 K/sec                  
               123      cpu-migrations            #    0.002 K/sec                  
          15303912      page-faults               #    0.242 M/sec                  
      220591433927      cycles                    #    3.486 GHz                      (41.69%)
      336456956948      instructions              #    1.53  insn per cycle           (50.03%)
       81192390419      branches                  # 1283.144 M/sec                    (58.36%)
          48851830      branch-misses             #    0.06% of all branches          (66.68%)
       85084317712      L1-dcache-loads           # 1344.651 M/sec                    (66.69%)
        1237592154      L1-dcache-load-misses     #    1.45% of all L1-dcache accesses  (66.69%)
         107544079      LLC-loads                 #    1.700 M/sec                    (66.72%)
          94983105      LLC-load-misses           #   88.32% of all LL-cache accesses  (66.73%)
   <not supported>      L1-icache-loads                                             
          56034748      L1-icache-load-misses                                         (33.31%)
       85168082936      dTLB-loads                # 1345.975 M/sec                    (33.31%)
         222943771      dTLB-load-misses          #    0.26% of all dTLB cache accesses  (33.28%)
   <not supported>      iTLB-loads                                                  
          17811130      iTLB-load-misses                                              (33.28%)
   <not supported>      L1-dcache-prefetches                                        
   <not supported>      L1-dcache-prefetch-misses                                   

      50.256773503 seconds time elapsed

      44.725967000 seconds user
      40.330171000 seconds sys




# JMH version: 1.36
# VM version: JDK 17.0.3.0.101, Zing 64-Bit Tiered VM, 17.0.3.0.101-zing_22.02.300.0-b1-product-linux-X86_64
# *** WARNING: JMH support for this VM is experimental. Be extra careful with the produced data.
# VM invoker: /root/java/zing22.02.300.0-1-jdk17.0.3.0.101-linux_x64/bin/java
# VM options: -Xmx48g -Xms48g -XX:+PrintGCDetails -XX:+ProfileLiveObjects -XX:+PrintGCApplicationStoppedTime -XX:+HeapDumpOnOutOfMemoryError -Xloggc:gc_%t_%p.log
# Blackhole mode: compiler (auto-detected, use -Djmh.blackhole.autoDetect=false to disable)
# Warmup: 1 iterations, 10 s each
# Measurement: 3 iterations, 10 s each
# Timeout: 10 min per iteration
# Threads: 1 thread, will synchronize iterations
# Benchmark mode: Average time, time/op
# Benchmark: benchmark.BigObjectAccessBenchmark.loop
# Parameters: (accessMode = LINER)

# Run progress: 11.11% complete, ETA 00:06:44
# Fork: 1 of 1
# Preparing profilers: LinuxPerfProfiler
# Profilers consume stderr from target VM, use -v EXTRA to copy to console
# Warmup Iteration   1: 552.218 ns/op
Iteration   1: 553.171 ns/op
Iteration   2: 566.085 ns/op
Iteration   3: 565.824 ns/op
# Processing profiler results: LinuxPerfProfiler


Result "benchmark.BigObjectAccessBenchmark.loop":
561.693 ?(99.9%) 134.663 ns/op [Average]
(min, avg, max) = (553.171, 561.693, 566.085), stdev = 7.381
CI (99.9%): [427.030, 696.357] (assumes normal distribution)

Secondary result "benchmark.BigObjectAccessBenchmark.loop:?perf":
Perf stats:
--------------------------------------------------

          61164.27 msec task-clock                #    1.209 CPUs utilized          
              6944      context-switches          #    0.114 K/sec                  
               115      cpu-migrations            #    0.002 K/sec                  
          13955445      page-faults               #    0.228 M/sec                  
      213128913218      cycles                    #    3.485 GHz                      (41.71%)
      190721137582      instructions              #    0.89  insn per cycle           (50.04%)
       42299570324      branches                  #  691.573 M/sec                    (58.37%)
          50177046      branch-misses             #    0.12% of all branches          (66.69%)
       49835860833      L1-dcache-loads           #  814.787 M/sec                    (66.69%)
        5519569454      L1-dcache-load-misses     #   11.08% of all L1-dcache accesses  (66.69%)
         331179658      LLC-loads                 #    5.415 M/sec                    (66.70%)
         103028034      LLC-load-misses           #   31.11% of all LL-cache accesses  (66.71%)
   <not supported>      L1-icache-loads                                             
          32201244      L1-icache-load-misses                                         (33.31%)
       49845436737      dTLB-loads                #  814.944 M/sec                    (33.31%)
         233359311      dTLB-load-misses          #    0.47% of all dTLB cache accesses  (33.30%)
   <not supported>      iTLB-loads                                                  
           2300689      iTLB-load-misses                                              (33.29%)
   <not supported>      L1-dcache-prefetches                                        
   <not supported>      L1-dcache-prefetch-misses                                   

      50.580183732 seconds time elapsed

      44.727653000 seconds user
      38.390184000 seconds sys




# JMH version: 1.36
# VM version: JDK 17.0.3.0.101, Zing 64-Bit Tiered VM, 17.0.3.0.101-zing_22.02.300.0-b1-product-linux-X86_64
# *** WARNING: JMH support for this VM is experimental. Be extra careful with the produced data.
# VM invoker: /root/java/zing22.02.300.0-1-jdk17.0.3.0.101-linux_x64/bin/java
# VM options: -Xmx48g -Xms48g -XX:+PrintGCDetails -XX:+ProfileLiveObjects -XX:+PrintGCApplicationStoppedTime -XX:+HeapDumpOnOutOfMemoryError -Xloggc:gc_%t_%p.log
# Blackhole mode: compiler (auto-detected, use -Djmh.blackhole.autoDetect=false to disable)
# Warmup: 1 iterations, 10 s each
# Measurement: 3 iterations, 10 s each
# Timeout: 10 min per iteration
# Threads: 1 thread, will synchronize iterations
# Benchmark mode: Average time, time/op
# Benchmark: benchmark.BigObjectAccessBenchmark.loop
# Parameters: (accessMode = RANDOM)

# Run progress: 22.22% complete, ETA 00:05:54
# Fork: 1 of 1
# Preparing profilers: LinuxPerfProfiler
# Profilers consume stderr from target VM, use -v EXTRA to copy to console
# Warmup Iteration   1: 635.716 ns/op
Iteration   1: 631.471 ns/op
Iteration   2: 639.216 ns/op
Iteration   3: 636.680 ns/op
# Processing profiler results: LinuxPerfProfiler


Result "benchmark.BigObjectAccessBenchmark.loop":
635.789 ?(99.9%) 72.045 ns/op [Average]
(min, avg, max) = (631.471, 635.789, 639.216), stdev = 3.949
CI (99.9%): [563.744, 707.834] (assumes normal distribution)

Secondary result "benchmark.BigObjectAccessBenchmark.loop:?perf":
Perf stats:
--------------------------------------------------

          61479.70 msec task-clock                #    1.216 CPUs utilized          
              7015      context-switches          #    0.114 K/sec                  
               112      cpu-migrations            #    0.002 K/sec                  
          14019687      page-faults               #    0.228 M/sec                  
      214157159229      cycles                    #    3.483 GHz                      (41.70%)
      186904819173      instructions              #    0.87  insn per cycle           (50.03%)
       41196957144      branches                  #  670.090 M/sec                    (58.36%)
          42267699      branch-misses             #    0.10% of all branches          (66.68%)
       48787902313      L1-dcache-loads           #  793.561 M/sec                    (66.68%)
        5261073462      L1-dcache-load-misses     #   10.78% of all L1-dcache accesses  (66.69%)
         409404800      LLC-loads                 #    6.659 M/sec                    (66.70%)
         102733035      LLC-load-misses           #   25.09% of all LL-cache accesses  (66.72%)
   <not supported>      L1-icache-loads                                             
          37685726      L1-icache-load-misses                                         (33.33%)
       48851940038      dTLB-loads                #  794.603 M/sec                    (33.31%)
         255398929      dTLB-load-misses          #    0.52% of all dTLB cache accesses  (33.31%)
   <not supported>      iTLB-loads                                                  
          16611753      iTLB-load-misses                                              (33.29%)
   <not supported>      L1-dcache-prefetches                                        
   <not supported>      L1-dcache-prefetch-misses                                   

      50.563001378 seconds time elapsed

      44.888124000 seconds user
      38.776423000 seconds sys




# JMH version: 1.36
# VM version: JDK 17.0.3.0.101, Zing 64-Bit Tiered VM, 17.0.3.0.101-zing_22.02.300.0-b1-product-linux-X86_64
# *** WARNING: JMH support for this VM is experimental. Be extra careful with the produced data.
# VM invoker: /root/java/zing22.02.300.0-1-jdk17.0.3.0.101-linux_x64/bin/java
# VM options: -Xmx48g -Xms48g -XX:+PrintGCDetails -XX:+ProfileLiveObjects -XX:+PrintGCApplicationStoppedTime -XX:+HeapDumpOnOutOfMemoryError -Xloggc:gc_%t_%p.log
# Blackhole mode: compiler (auto-detected, use -Djmh.blackhole.autoDetect=false to disable)
# Warmup: 1 iterations, 10 s each
# Measurement: 3 iterations, 10 s each
# Timeout: 10 min per iteration
# Threads: 1 thread, will synchronize iterations
# Benchmark mode: Average time, time/op
# Benchmark: benchmark.RandomAccessBenchmark.loop
# Parameters: (accessMode = FIXED)

# Run progress: 33.33% complete, ETA 00:05:03
# Fork: 1 of 1
# Preparing profilers: LinuxPerfProfiler
# Profilers consume stderr from target VM, use -v EXTRA to copy to console
# Warmup Iteration   1: 94.596 ns/op
Iteration   1: 94.158 ns/op
Iteration   2: 92.965 ns/op
Iteration   3: 93.066 ns/op
# Processing profiler results: LinuxPerfProfiler


Result "benchmark.RandomAccessBenchmark.loop":
93.396 ?(99.9%) 12.072 ns/op [Average]
(min, avg, max) = (92.965, 93.396, 94.158), stdev = 0.662
CI (99.9%): [81.324, 105.468] (assumes normal distribution)

Secondary result "benchmark.RandomAccessBenchmark.loop:?perf":
Perf stats:
--------------------------------------------------

          61318.22 msec task-clock                #    1.212 CPUs utilized          
              7079      context-switches          #    0.115 K/sec                  
               107      cpu-migrations            #    0.002 K/sec                  
          13985012      page-faults               #    0.228 M/sec                  
      213772924154      cycles                    #    3.486 GHz                      (41.69%)
      237361138760      instructions              #    1.11  insn per cycle           (50.03%)
       54500047749      branches                  #  888.807 M/sec                    (58.36%)
          41195853      branch-misses             #    0.08% of all branches          (66.69%)
       65761185640      L1-dcache-loads           # 1072.458 M/sec                    (66.70%)
        1149905173      L1-dcache-load-misses     #    1.75% of all L1-dcache accesses  (66.70%)
         120129999      LLC-loads                 #    1.959 M/sec                    (66.72%)
         103346470      LLC-load-misses           #   86.03% of all LL-cache accesses  (66.72%)
   <not supported>      L1-icache-loads                                             
          32540461      L1-icache-load-misses                                         (33.31%)
       65857664286      dTLB-loads                # 1074.031 M/sec                    (33.30%)
         215168034      dTLB-load-misses          #    0.33% of all dTLB cache accesses  (33.29%)
   <not supported>      iTLB-loads                                                  
           2365983      iTLB-load-misses                                              (33.28%)
   <not supported>      L1-dcache-prefetches                                        
   <not supported>      L1-dcache-prefetch-misses                                   

      50.590919283 seconds time elapsed

      44.630886000 seconds user
      38.714670000 seconds sys




# JMH version: 1.36
# VM version: JDK 17.0.3.0.101, Zing 64-Bit Tiered VM, 17.0.3.0.101-zing_22.02.300.0-b1-product-linux-X86_64
# *** WARNING: JMH support for this VM is experimental. Be extra careful with the produced data.
# VM invoker: /root/java/zing22.02.300.0-1-jdk17.0.3.0.101-linux_x64/bin/java
# VM options: -Xmx48g -Xms48g -XX:+PrintGCDetails -XX:+ProfileLiveObjects -XX:+PrintGCApplicationStoppedTime -XX:+HeapDumpOnOutOfMemoryError -Xloggc:gc_%t_%p.log
# Blackhole mode: compiler (auto-detected, use -Djmh.blackhole.autoDetect=false to disable)
# Warmup: 1 iterations, 10 s each
# Measurement: 3 iterations, 10 s each
# Timeout: 10 min per iteration
# Threads: 1 thread, will synchronize iterations
# Benchmark mode: Average time, time/op
# Benchmark: benchmark.RandomAccessBenchmark.loop
# Parameters: (accessMode = LINER)

# Run progress: 44.44% complete, ETA 00:04:13
# Fork: 1 of 1
# Preparing profilers: LinuxPerfProfiler
# Profilers consume stderr from target VM, use -v EXTRA to copy to console
# Warmup Iteration   1: 127.523 ns/op
Iteration   1: 130.894 ns/op
Iteration   2: 129.449 ns/op
Iteration   3: 129.643 ns/op
# Processing profiler results: LinuxPerfProfiler


Result "benchmark.RandomAccessBenchmark.loop":
129.995 ?(99.9%) 14.313 ns/op [Average]
(min, avg, max) = (129.449, 129.995, 130.894), stdev = 0.785
CI (99.9%): [115.682, 144.308] (assumes normal distribution)

Secondary result "benchmark.RandomAccessBenchmark.loop:?perf":
Perf stats:
--------------------------------------------------

          61065.58 msec task-clock                #    1.207 CPUs utilized          
              7052      context-switches          #    0.115 K/sec                  
               139      cpu-migrations            #    0.002 K/sec                  
          13925958      page-faults               #    0.228 M/sec                  
      212779844316      cycles                    #    3.484 GHz                      (41.69%)
      219926931197      instructions              #    1.03  insn per cycle           (50.02%)
       49833089169      branches                  #  816.059 M/sec                    (58.35%)
          39877415      branch-misses             #    0.08% of all branches          (66.68%)
       60513658611      L1-dcache-loads           #  990.962 M/sec                    (66.68%)
        7324116395      L1-dcache-load-misses     #   12.10% of all L1-dcache accesses  (66.69%)
         149345691      LLC-loads                 #    2.446 M/sec                    (66.70%)
         103526650      LLC-load-misses           #   69.32% of all LL-cache accesses  (66.71%)
   <not supported>      L1-icache-loads                                             
          33298794      L1-icache-load-misses                                         (33.32%)
       60559870138      dTLB-loads                #  991.719 M/sec                    (33.31%)
         218007529      dTLB-load-misses          #    0.36% of all dTLB cache accesses  (33.31%)
   <not supported>      iTLB-loads                                                  
          16305790      iTLB-load-misses                                              (33.29%)
   <not supported>      L1-dcache-prefetches                                        
   <not supported>      L1-dcache-prefetch-misses                                   

      50.584377385 seconds time elapsed

      44.650282000 seconds user
      38.360815000 seconds sys




# JMH version: 1.36
# VM version: JDK 17.0.3.0.101, Zing 64-Bit Tiered VM, 17.0.3.0.101-zing_22.02.300.0-b1-product-linux-X86_64
# *** WARNING: JMH support for this VM is experimental. Be extra careful with the produced data.
# VM invoker: /root/java/zing22.02.300.0-1-jdk17.0.3.0.101-linux_x64/bin/java
# VM options: -Xmx48g -Xms48g -XX:+PrintGCDetails -XX:+ProfileLiveObjects -XX:+PrintGCApplicationStoppedTime -XX:+HeapDumpOnOutOfMemoryError -Xloggc:gc_%t_%p.log
# Blackhole mode: compiler (auto-detected, use -Djmh.blackhole.autoDetect=false to disable)
# Warmup: 1 iterations, 10 s each
# Measurement: 3 iterations, 10 s each
# Timeout: 10 min per iteration
# Threads: 1 thread, will synchronize iterations
# Benchmark mode: Average time, time/op
# Benchmark: benchmark.RandomAccessBenchmark.loop
# Parameters: (accessMode = RANDOM)

# Run progress: 55.56% complete, ETA 00:03:22
# Fork: 1 of 1
# Preparing profilers: LinuxPerfProfiler
# Profilers consume stderr from target VM, use -v EXTRA to copy to console
# Warmup Iteration   1: 174.859 ns/op
Iteration   1: 173.709 ns/op
Iteration   2: 170.934 ns/op
Iteration   3: 170.915 ns/op
# Processing profiler results: LinuxPerfProfiler


Result "benchmark.RandomAccessBenchmark.loop":
171.853 ?(99.9%) 29.334 ns/op [Average]
(min, avg, max) = (170.915, 171.853, 173.709), stdev = 1.608
CI (99.9%): [142.519, 201.186] (assumes normal distribution)

Secondary result "benchmark.RandomAccessBenchmark.loop:?perf":
Perf stats:
--------------------------------------------------

          61233.32 msec task-clock                #    1.212 CPUs utilized          
              6891      context-switches          #    0.113 K/sec                  
               132      cpu-migrations            #    0.002 K/sec                  
          13932128      page-faults               #    0.228 M/sec                  
      213375943901      cycles                    #    3.485 GHz                      (41.70%)
      208024542551      instructions              #    0.97  insn per cycle           (50.04%)
       46531764719      branches                  #  759.909 M/sec                    (58.36%)
          40856632      branch-misses             #    0.09% of all branches          (66.69%)
       56574299641      L1-dcache-loads           #  923.914 M/sec                    (66.68%)
        6902260901      L1-dcache-load-misses     #   12.20% of all L1-dcache accesses  (66.69%)
         558778635      LLC-loads                 #    9.125 M/sec                    (66.70%)
         102880300      LLC-load-misses           #   18.41% of all LL-cache accesses  (66.71%)
   <not supported>      L1-icache-loads                                             
          32703107      L1-icache-load-misses                                         (33.32%)
       56640957099      dTLB-loads                #  925.002 M/sec                    (33.31%)
         217756010      dTLB-load-misses          #    0.38% of all dTLB cache accesses  (33.30%)
   <not supported>      iTLB-loads                                                  
          16407923      iTLB-load-misses                                              (33.30%)
   <not supported>      L1-dcache-prefetches                                        
   <not supported>      L1-dcache-prefetch-misses                                   

      50.531164949 seconds time elapsed

      45.050012000 seconds user
      38.421074000 seconds sys




# JMH version: 1.36
# VM version: JDK 17.0.3.0.101, Zing 64-Bit Tiered VM, 17.0.3.0.101-zing_22.02.300.0-b1-product-linux-X86_64
# *** WARNING: JMH support for this VM is experimental. Be extra careful with the produced data.
# VM invoker: /root/java/zing22.02.300.0-1-jdk17.0.3.0.101-linux_x64/bin/java
# VM options: -Xmx48g -Xms48g -XX:+PrintGCDetails -XX:+ProfileLiveObjects -XX:+PrintGCApplicationStoppedTime -XX:+HeapDumpOnOutOfMemoryError -Xloggc:gc_%t_%p.log
# Blackhole mode: compiler (auto-detected, use -Djmh.blackhole.autoDetect=false to disable)
# Warmup: 1 iterations, 10 s each
# Measurement: 3 iterations, 10 s each
# Timeout: 10 min per iteration
# Threads: 1 thread, will synchronize iterations
# Benchmark mode: Average time, time/op
# Benchmark: benchmark.WrappedObjectAccessBenchmark.loop
# Parameters: (accessMode = FIXED)

# Run progress: 66.67% complete, ETA 00:02:32
# Fork: 1 of 1
# Preparing profilers: LinuxPerfProfiler
# Profilers consume stderr from target VM, use -v EXTRA to copy to console
# Warmup Iteration   1: 107.633 ns/op
Iteration   1: 110.272 ns/op
Iteration   2: 98.051 ns/op
Iteration   3: 98.108 ns/op
# Processing profiler results: LinuxPerfProfiler


Result "benchmark.WrappedObjectAccessBenchmark.loop":
102.144 ?(99.9%) 128.421 ns/op [Average]
(min, avg, max) = (98.051, 102.144, 110.272), stdev = 7.039
CI (99.9%): [? 0, 230.565] (assumes normal distribution)

Secondary result "benchmark.WrappedObjectAccessBenchmark.loop:?perf":
Perf stats:
--------------------------------------------------

          61612.62 msec task-clock                #    1.217 CPUs utilized          
              7003      context-switches          #    0.114 K/sec                  
               123      cpu-migrations            #    0.002 K/sec                  
          14026057      page-faults               #    0.228 M/sec                  
      214824993538      cycles                    #    3.487 GHz                      (41.69%)
      329586286120      instructions              #    1.53  insn per cycle           (50.02%)
       79688165660      branches                  # 1293.374 M/sec                    (58.35%)
          41128701      branch-misses             #    0.05% of all branches          (66.68%)
       83185457584      L1-dcache-loads           # 1350.137 M/sec                    (66.69%)
        1159011825      L1-dcache-load-misses     #    1.39% of all L1-dcache accesses  (66.70%)
         118116083      LLC-loads                 #    1.917 M/sec                    (66.72%)
         101800353      LLC-load-misses           #   86.19% of all LL-cache accesses  (66.73%)
   <not supported>      L1-icache-loads                                             
          31563380      L1-icache-load-misses                                         (33.31%)
       83316122653      dTLB-loads                # 1352.258 M/sec                    (33.30%)
         213097534      dTLB-load-misses          #    0.26% of all dTLB cache accesses  (33.28%)
   <not supported>      iTLB-loads                                                  
          10478142      iTLB-load-misses                                              (33.28%)
   <not supported>      L1-dcache-prefetches                                        
   <not supported>      L1-dcache-prefetch-misses                                   

      50.643140557 seconds time elapsed

      44.634601000 seconds user
      38.973711000 seconds sys




# JMH version: 1.36
# VM version: JDK 17.0.3.0.101, Zing 64-Bit Tiered VM, 17.0.3.0.101-zing_22.02.300.0-b1-product-linux-X86_64
# *** WARNING: JMH support for this VM is experimental. Be extra careful with the produced data.
# VM invoker: /root/java/zing22.02.300.0-1-jdk17.0.3.0.101-linux_x64/bin/java
# VM options: -Xmx48g -Xms48g -XX:+PrintGCDetails -XX:+ProfileLiveObjects -XX:+PrintGCApplicationStoppedTime -XX:+HeapDumpOnOutOfMemoryError -Xloggc:gc_%t_%p.log
# Blackhole mode: compiler (auto-detected, use -Djmh.blackhole.autoDetect=false to disable)
# Warmup: 1 iterations, 10 s each
# Measurement: 3 iterations, 10 s each
# Timeout: 10 min per iteration
# Threads: 1 thread, will synchronize iterations
# Benchmark mode: Average time, time/op
# Benchmark: benchmark.WrappedObjectAccessBenchmark.loop
# Parameters: (accessMode = LINER)

# Run progress: 77.78% complete, ETA 00:01:41
# Fork: 1 of 1
# Preparing profilers: LinuxPerfProfiler
# Profilers consume stderr from target VM, use -v EXTRA to copy to console
# Warmup Iteration   1: 157.636 ns/op
Iteration   1: 159.067 ns/op
Iteration   2: 157.086 ns/op
Iteration   3: 157.408 ns/op
# Processing profiler results: LinuxPerfProfiler


Result "benchmark.WrappedObjectAccessBenchmark.loop":
157.854 ?(99.9%) 19.403 ns/op [Average]
(min, avg, max) = (157.086, 157.854, 159.067), stdev = 1.064
CI (99.9%): [138.451, 177.256] (assumes normal distribution)

Secondary result "benchmark.WrappedObjectAccessBenchmark.loop:?perf":
Perf stats:
--------------------------------------------------

          61270.22 msec task-clock                #    1.211 CPUs utilized          
              6945      context-switches          #    0.113 K/sec                  
               124      cpu-migrations            #    0.002 K/sec                  
          13945145      page-faults               #    0.228 M/sec                  
      213501829535      cycles                    #    3.485 GHz                      (41.70%)
      282030736983      instructions              #    1.32  insn per cycle           (50.04%)
       66761203035      branches                  # 1089.619 M/sec                    (58.37%)
          54699695      branch-misses             #    0.08% of all branches          (66.71%)
       71706562477      L1-dcache-loads           # 1170.333 M/sec                    (66.71%)
        7402565678      L1-dcache-load-misses     #   10.32% of all L1-dcache accesses  (66.72%)
         138310529      LLC-loads                 #    2.257 M/sec                    (66.72%)
         102858948      LLC-load-misses           #   74.37% of all LL-cache accesses  (66.73%)
   <not supported>      L1-icache-loads                                             
          30924814      L1-icache-load-misses                                         (33.29%)
       71839067477      dTLB-loads                # 1172.496 M/sec                    (33.28%)
         215980154      dTLB-load-misses          #    0.30% of all dTLB cache accesses  (33.28%)
   <not supported>      iTLB-loads                                                  
          16193481      iTLB-load-misses                                              (33.27%)
   <not supported>      L1-dcache-prefetches                                        
   <not supported>      L1-dcache-prefetch-misses                                   

      50.615057727 seconds time elapsed

      44.693845000 seconds user
      38.542937000 seconds sys




# JMH version: 1.36
# VM version: JDK 17.0.3.0.101, Zing 64-Bit Tiered VM, 17.0.3.0.101-zing_22.02.300.0-b1-product-linux-X86_64
# *** WARNING: JMH support for this VM is experimental. Be extra careful with the produced data.
# VM invoker: /root/java/zing22.02.300.0-1-jdk17.0.3.0.101-linux_x64/bin/java
# VM options: -Xmx48g -Xms48g -XX:+PrintGCDetails -XX:+ProfileLiveObjects -XX:+PrintGCApplicationStoppedTime -XX:+HeapDumpOnOutOfMemoryError -Xloggc:gc_%t_%p.log
# Blackhole mode: compiler (auto-detected, use -Djmh.blackhole.autoDetect=false to disable)
# Warmup: 1 iterations, 10 s each
# Measurement: 3 iterations, 10 s each
# Timeout: 10 min per iteration
# Threads: 1 thread, will synchronize iterations
# Benchmark mode: Average time, time/op
# Benchmark: benchmark.WrappedObjectAccessBenchmark.loop
# Parameters: (accessMode = RANDOM)

# Run progress: 88.89% complete, ETA 00:00:50
# Fork: 1 of 1
# Preparing profilers: LinuxPerfProfiler
# Profilers consume stderr from target VM, use -v EXTRA to copy to console
# Warmup Iteration   1: 201.604 ns/op
Iteration   1: 199.890 ns/op
Iteration   2: 202.006 ns/op
Iteration   3: 201.863 ns/op
# Processing profiler results: LinuxPerfProfiler


Result "benchmark.WrappedObjectAccessBenchmark.loop":
201.253 ?(99.9%) 21.576 ns/op [Average]
(min, avg, max) = (199.890, 201.253, 202.006), stdev = 1.183
CI (99.9%): [179.677, 222.829] (assumes normal distribution)

Secondary result "benchmark.WrappedObjectAccessBenchmark.loop:?perf":
Perf stats:
--------------------------------------------------

          61441.91 msec task-clock                #    1.216 CPUs utilized          
              6820      context-switches          #    0.111 K/sec                  
               116      cpu-migrations            #    0.002 K/sec                  
          14013182      page-faults               #    0.228 M/sec                  
      214088500089      cycles                    #    3.484 GHz                      (41.71%)
      260368233954      instructions              #    1.22  insn per cycle           (50.05%)
       60887599961      branches                  #  990.978 M/sec                    (58.37%)
          42076747      branch-misses             #    0.07% of all branches          (66.69%)
       66210002248      L1-dcache-loads           # 1077.603 M/sec                    (66.70%)
        6693342432      L1-dcache-load-misses     #   10.11% of all L1-dcache accesses  (66.71%)
         298521283      LLC-loads                 #    4.859 M/sec                    (66.71%)
         106854910      LLC-load-misses           #   35.79% of all LL-cache accesses  (66.72%)
   <not supported>      L1-icache-loads                                             
          32243717      L1-icache-load-misses                                         (33.31%)
       66219757471      dTLB-loads                # 1077.762 M/sec                    (33.30%)
         219638293      dTLB-load-misses          #    0.33% of all dTLB cache accesses  (33.29%)
   <not supported>      iTLB-loads                                                  
          16408677      iTLB-load-misses                                              (33.29%)
   <not supported>      L1-dcache-prefetches                                        
   <not supported>      L1-dcache-prefetch-misses                                   

      50.545464573 seconds time elapsed

      44.978791000 seconds user
      38.702332000 seconds sys




# Run complete. Total time: 00:07:36

REMEMBER: The numbers below are just data. To gain reusable insights, you need to follow up on
why the numbers are the way they are. Use profilers (see -prof, -lprof), design factorial
experiments, perform baseline and negative tests that provide experimental control, make sure
the benchmarking environment is safe on JVM/OS/HW level, ask for reviews from the domain experts.
Do not assume the numbers tell you what you want them to tell.

NOTE: Current JVM experimentally supports Compiler Blackholes, and they are in use. Please exercise
extra caution when trusting the results, look into the generated code to check the benchmark still
works, and factor in a small probability of new VM bugs. Additionally, while comparisons between
different JVMs are already problematic, the performance difference caused by different Blackhole
modes can be very significant. Please make sure you use the consistent Blackhole mode for comparisons.

Benchmark                                (accessMode)  Mode  Cnt    Score     Error      Units
BigObjectAccessBenchmark.loop                   FIXED  avgt    3  102.750 ? 131.855      ns/op
BigObjectAccessBenchmark.loop:?cpi              FIXED  avgt         0.656            clks/insn
BigObjectAccessBenchmark.loop:?ipc              FIXED  avgt         1.525            insns/clk
BigObjectAccessBenchmark.loop:?perf             FIXED  avgt           NaN                  ---
BigObjectAccessBenchmark.loop                   LINER  avgt    3  561.693 ? 134.663      ns/op
BigObjectAccessBenchmark.loop:?cpi              LINER  avgt         1.117            clks/insn
BigObjectAccessBenchmark.loop:?ipc              LINER  avgt         0.895            insns/clk
BigObjectAccessBenchmark.loop:?perf             LINER  avgt           NaN                  ---
BigObjectAccessBenchmark.loop                  RANDOM  avgt    3  635.789 ?  72.045      ns/op
BigObjectAccessBenchmark.loop:?cpi             RANDOM  avgt         1.146            clks/insn
BigObjectAccessBenchmark.loop:?ipc             RANDOM  avgt         0.873            insns/clk
BigObjectAccessBenchmark.loop:?perf            RANDOM  avgt           NaN                  ---
RandomAccessBenchmark.loop                      FIXED  avgt    3   93.396 ?  12.072      ns/op
RandomAccessBenchmark.loop:?cpi                 FIXED  avgt         0.901            clks/insn
RandomAccessBenchmark.loop:?ipc                 FIXED  avgt         1.110            insns/clk
RandomAccessBenchmark.loop:?perf                FIXED  avgt           NaN                  ---
RandomAccessBenchmark.loop                      LINER  avgt    3  129.995 ?  14.313      ns/op
RandomAccessBenchmark.loop:?cpi                 LINER  avgt         0.968            clks/insn
RandomAccessBenchmark.loop:?ipc                 LINER  avgt         1.034            insns/clk
RandomAccessBenchmark.loop:?perf                LINER  avgt           NaN                  ---
RandomAccessBenchmark.loop                     RANDOM  avgt    3  171.853 ?  29.334      ns/op
RandomAccessBenchmark.loop:?cpi                RANDOM  avgt         1.026            clks/insn
RandomAccessBenchmark.loop:?ipc                RANDOM  avgt         0.975            insns/clk
RandomAccessBenchmark.loop:?perf               RANDOM  avgt           NaN                  ---
WrappedObjectAccessBenchmark.loop               FIXED  avgt    3  102.144 ? 128.421      ns/op
WrappedObjectAccessBenchmark.loop:?cpi          FIXED  avgt         0.652            clks/insn
WrappedObjectAccessBenchmark.loop:?ipc          FIXED  avgt         1.534            insns/clk
WrappedObjectAccessBenchmark.loop:?perf         FIXED  avgt           NaN                  ---
WrappedObjectAccessBenchmark.loop               LINER  avgt    3  157.854 ?  19.403      ns/op
WrappedObjectAccessBenchmark.loop:?cpi          LINER  avgt         0.757            clks/insn
WrappedObjectAccessBenchmark.loop:?ipc          LINER  avgt         1.321            insns/clk
WrappedObjectAccessBenchmark.loop:?perf         LINER  avgt           NaN                  ---
WrappedObjectAccessBenchmark.loop              RANDOM  avgt    3  201.253 ?  21.576      ns/op
WrappedObjectAccessBenchmark.loop:?cpi         RANDOM  avgt         0.822            clks/insn
WrappedObjectAccessBenchmark.loop:?ipc         RANDOM  avgt         1.216            insns/clk
WrappedObjectAccessBenchmark.loop:?perf        RANDOM  avgt           NaN                  ---
