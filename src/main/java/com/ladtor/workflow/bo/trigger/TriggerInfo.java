package com.ladtor.workflow.bo.trigger;

import com.ladtor.workflow.constant.TriggerType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author liudongrong
 * @date 2019/1/12 22:57
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public abstract class TriggerInfo {
    private TriggerType triggerType;
}
