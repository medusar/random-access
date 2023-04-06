package benchmark;

public enum AccessMode {
    /**
     * 固定访问一个list中的索引
     */
    FIXED,
    /**
     * 按顺序访问list中的所有索引，全部访问完之后再从头开始
     */
    LINER,
    /**
     * 随机访问，通过随机数，每次随机访问list中的一个索引¬
     */
    RANDOM
}
