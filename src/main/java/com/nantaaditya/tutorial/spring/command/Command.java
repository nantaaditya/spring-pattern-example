package com.nantaaditya.tutorial.spring.command;

import reactor.core.publisher.Mono;

/**
 * created by pramuditya.anantanur
 **/
public interface Command<REQUEST, RESPONSE> {
  Mono<RESPONSE> execute(REQUEST request);
}
