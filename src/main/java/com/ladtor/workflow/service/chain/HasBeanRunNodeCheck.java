package com.ladtor.workflow.service.chain;

import com.ladtor.workflow.bo.domain.NodeLog;
import com.ladtor.workflow.bo.execute.FourTuple;
import com.ladtor.workflow.service.NodeLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author liudongrong
 * @date 2019/1/28 14:12
 */
@Service
public class HasBeanRunNodeCheck extends AbstractNodeCheck {
    @Autowired
    private NodeLogService nodeLogService;

    @Override
    protected boolean check(FourTuple fourTuple) {
        NodeLog nodeLog = nodeLogService.get(fourTuple);
        return nodeLog != null;
    }
}