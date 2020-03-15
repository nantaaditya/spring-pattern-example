package com.nantaaditya.tutorial.spring.command;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Mono;

/**
 * created by pramuditya.anantanur
 **/
@Component
public class CommandExecutorImpl implements CommandExecutor, ApplicationContextAware {
  
  private ApplicationContext applicationContext;

  @Override
  public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
    this.applicationContext = applicationContext;
  }

  @Override
  public <REQUEST, RESPONSE> Mono<RESPONSE> execute(
      Class<? extends Command<REQUEST, RESPONSE>> commandClass, REQUEST request) {
    Command<REQUEST, RESPONSE> command = applicationContext.getBean(commandClass);
    return command.execute(request);
  }
}
