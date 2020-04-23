package com.lgy.common.config.canal.event;

import com.alibaba.otter.canal.protocol.CanalEntry.Entry;

/**
 * @author <a href="mailto:wangchao.star@gmail.com">wangchao</a>
 * @version 1.0
 * @since 2017-08-26 22:31:00
 */
public class DeleteAbstractCanalEvent extends AbstractCanalEvent {
    /**
     * Create a new ApplicationEvent.
     *
     * @param source the object on which the event initially occurred (never {@code null})
     */
    public DeleteAbstractCanalEvent(Entry source) {
        super(source);
    }
}
