package com.vteba.iterq.api.question.aspect;

import javax.inject.Named;

import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Named
@Aspect
public class AnnotationCacheAspect {
	
	@Pointcut("@annotation(org.springframework.cache.annotation.Cacheable) && within(org.springframework.cache.annotation.Cacheable))")
	public void cacheable() {
		
	}
	
	@Pointcut("@annotation(org.springframework.cache.annotation.CachePut)")
	public void cachePut() {
		
	}
	
	@Pointcut("@annotation(org.springframework.cache.annotation.CacheEvict) && within(org.springframework.cache.annotation.CacheEvict)")
	public void cacheEvict() {
		
	}
	
	@Around("cacheable()")
	public void execute() {
		System.out.println();
	}
}
