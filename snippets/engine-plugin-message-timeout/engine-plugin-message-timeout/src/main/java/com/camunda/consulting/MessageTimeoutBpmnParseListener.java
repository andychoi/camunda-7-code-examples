package com.camunda.consulting;

import org.camunda.bpm.engine.impl.bpmn.parser.AbstractBpmnParseListener;
import org.camunda.bpm.engine.impl.bpmn.parser.BpmnParseListener;
import org.camunda.bpm.engine.impl.cfg.ProcessEngineConfigurationImpl;
import org.camunda.bpm.engine.impl.el.Expression;
import org.camunda.bpm.engine.impl.el.ExpressionManager;
import org.camunda.bpm.engine.impl.pvm.process.ActivityImpl;
import org.camunda.bpm.engine.impl.pvm.process.ScopeImpl;
import org.camunda.bpm.engine.impl.util.xml.Element;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Arrays;

import static com.camunda.consulting.util.ElementsUtil.getExtensionPropertyValue;

public class MessageTimeoutBpmnParseListener extends AbstractBpmnParseListener implements BpmnParseListener {

    private final Logger logger = LoggerFactory.getLogger(getClass());
    private final ExpressionManager expressionManager;

    public MessageTimeoutBpmnParseListener(ProcessEngineConfigurationImpl processEngineConfiguration) {
        expressionManager = processEngineConfiguration.getExpressionManager();
    }

    @Override
    public void parseReceiveTask(Element receiveTaskElement, ScopeImpl scope, ActivityImpl activity) {
        parseTimeoutMessageEvent(receiveTaskElement, activity);
    }

    @Override
    public void parseIntermediateCatchEvent(Element intermediateEventElement, ScopeImpl scope, ActivityImpl activity) {
        parseTimeoutMessageEvent(intermediateEventElement, activity);
    }

    private void parseTimeoutMessageEvent(Element bpmnElement, ActivityImpl activity) {
        if (/*bpmnElement.element("messageEventDefinition") != null ||*/ bpmnElement.getTagName().equals("receiveTask")) {
            Expression timeoutDuration = expressionManager.createExpression(getExtensionPropertyValue(bpmnElement, "timeoutDuration"));
            String timeoutListenerString = getExtensionPropertyValue(bpmnElement, "timeoutListener");
            String timeoutListenerTypeString = getExtensionPropertyValue(bpmnElement, "timeoutListenerType");

            TimeoutListenerTypes timeoutListenerType = Arrays.stream(TimeoutListenerTypes.values())
                    .filter(timeoutListenerType_ -> timeoutListenerType_.name().equalsIgnoreCase(timeoutListenerTypeString))
                    .findFirst().orElseThrow(() -> new RuntimeException("Invalid timeoutListenerType " + timeoutListenerTypeString));

            logger.info("timeoutDuration is {}", timeoutDuration.getExpressionText());
            logger.info("timeoutListener is {}", timeoutListenerString);
            logger.info("timeoutListenerTypeString is {}", timeoutListenerType);

            activity.setActivityBehavior(new MessageTimeoutRTActivityBehavior(timeoutDuration, timeoutListenerString, timeoutListenerType));
        }
    }
}