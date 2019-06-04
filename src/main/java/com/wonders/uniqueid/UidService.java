package com.wonders.uniqueid;

/**
 * @author huangweiyue
 * @version v1.0
 * @task
 * @description
 * @date Created in 2019-04-24
 * @modifiedBy
 */
public interface UidService {
    /**
     * 全局从 1 开始生成唯一标识
     *
     * @param key     要生成唯一标识的对象
     * @return 唯一标识
     * @throws Exception 异常
     */
    // Redis 来生成每天从0开始的流水号。比如订单号 = 日期 + 当日自增长号
    Long fetchUUID(String key, Long length) throws Exception;
}
