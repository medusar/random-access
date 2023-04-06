package benchmark;

import org.openjdk.jmh.annotations.*;
import org.openjdk.jmh.infra.Blackhole;
import org.openjdk.jmh.runner.Runner;
import org.openjdk.jmh.runner.RunnerException;
import org.openjdk.jmh.runner.options.Options;
import org.openjdk.jmh.runner.options.OptionsBuilder;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;

@BenchmarkMode(Mode.AverageTime)
@Fork(1)
@OutputTimeUnit(TimeUnit.NANOSECONDS)
@Warmup(iterations = 1)
@Measurement(iterations = 3)
public class RandomAccessBenchmark {

    @State(Scope.Benchmark)
    public static class CaseState {


        @Param({"FIXED", "LINER", "RANDOM"})
        AccessMode accessMode;

        int nextIndex;

        ArrayList<LinkedList<Object>> arrayList = new ArrayList<>();

        @Setup(Level.Trial)
        public void setup() {
            for (int i = 0; i < 2000; i++) {
                LinkedList<Object> linkedList = new LinkedList<>();
                for (int j = 0; j < 50; j++) {
                    linkedList.add(new Object());
                }
                arrayList.add(linkedList);
            }
        }

        @Setup(Level.Invocation)
        public void beforeEach() {
            switch (accessMode) {
                case FIXED:
                    nextIndex = 127;
                    break;
                case LINER:
                    nextIndex = (nextIndex + 1) % arrayList.size();
                    break;
                case RANDOM:
                    nextIndex = ThreadLocalRandom.current().nextInt(arrayList.size());
                    break;
            }
        }
    }

    @Benchmark
    public void loop(CaseState state, Blackhole blackhole) {
        final LinkedList<Object> list = state.arrayList.get(state.nextIndex);
        for (Object object : list) {
            blackhole.consume(object);
        }
    }

    public static void main(String[] args) throws RunnerException {
        Options opt = new OptionsBuilder()
                .include(RandomAccessBenchmark.class.getSimpleName())
                .build();
        new Runner(opt).run();
    }
}
