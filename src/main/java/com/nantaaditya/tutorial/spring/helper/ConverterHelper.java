package com.nantaaditya.tutorial.spring.helper;

import org.springframework.beans.BeanUtils;
import org.springframework.util.ObjectUtils;

import java.util.List;
import java.util.Objects;
import java.util.function.Supplier;
import java.util.stream.Collectors;

/**
 * created by pramuditya.anantanur
 **/
public class ConverterHelper {
  public static <SOURCE, TARGET> TARGET copy(SOURCE source, Supplier<TARGET> targetSupplier) {
    if (ObjectUtils.isEmpty(source)) {
      return null;
    }
    
    TARGET target = targetSupplier.get();
    BeanUtils.copyProperties(source, target);
    return target;
  }

  public static <SOURCE, TARGET> List<TARGET> copy(List<SOURCE> requests, Supplier<TARGET> targetSupplier){
    if(Objects.isNull(requests)) {
      return null;
    }

    return requests.stream()
        .map(source -> copy(source, targetSupplier))
        .collect(Collectors.toList());
  }
}
