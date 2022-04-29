package app.model;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component ("timer")
@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
public class Timer{

    private Long nanoTime = System.nanoTime();

    public Long getTime() {
        return nanoTime;
    }
}
