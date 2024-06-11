package com.venkatscode.movie.movie_recommender_aop.aspect;

import org.aspectj.lang.annotation.Pointcut;

public class JoinPointConfig {

    @Pointcut("execution(* com.venkatscode.movie.movie_recommender_aop.data.*.*(..))")
    public void dataLayerPointcut() {}

    @Pointcut("execution(* com.venkatscode.movie.movie_recommender_aop.business.*.*(..))")
    public void businessLayerPointcut() {}

    //to intercept method calls for both layers:
    @Pointcut("com.venkatscode.movie.movie_recommender_aop.aspect.JoinPointConfig.dataLayerPointcut() || "
            + "com.venkatscode.movie.movie_recommender_aop.aspect.JoinPointConfig.businessLayerPointcut()")
    public void allLayersPointcut() {}

    //for a particular bean
    @Pointcut("bean(movie*)")
    public void movieBeanPointcut() {}

    //custom aspect annotation
    @Pointcut("@annotation(com.venkatscode.movie.movie_recommender_aop.aspect.MeasureTime)")
    public void measureTimeAnnotation() {}

}