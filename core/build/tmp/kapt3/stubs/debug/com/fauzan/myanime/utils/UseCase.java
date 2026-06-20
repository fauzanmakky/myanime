package com.fauzan.myanime.utils;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u00020\u0003B\u0005\u00a2\u0006\u0002\u0010\u0004J(\u0010\u0005\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00028\u00000\u00070\u00062\u0006\u0010\t\u001a\u00028\u0001H\u00a6B\u00a2\u0006\u0002\u0010\n\u00a8\u0006\u000b"}, d2 = {"Lcom/fauzan/myanime/utils/UseCase;", "ResultType", "Params", "", "()V", "invoke", "Lkotlinx/coroutines/flow/Flow;", "Larrow/core/Either;", "Lcom/fauzan/myanime/utils/Failure;", "params", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "core_debug"})
public abstract class UseCase<ResultType extends java.lang.Object, Params extends java.lang.Object> {
    
    public UseCase() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object invoke(Params params, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<? extends arrow.core.Either<? extends com.fauzan.myanime.utils.Failure, ? extends ResultType>>> $completion);
}