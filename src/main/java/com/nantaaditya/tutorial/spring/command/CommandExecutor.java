package com.nantaaditya.tutorial.spring.command;

import reactor.core.publisher.Mono;

/**
 * created by pramuditya.anantanur
 **/
public interface CommandExecutor {
  <REQUEST, RESPONSE> Mono<RESPONSE> execute(Class<? extends Command<REQUEST, RESPONSE>>  commandClass, REQUEST request);
}
