package cc.kejun.origin.conf;

import cc.kejun.origin.Stub;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author hch
 * @since 2022/2/16
 */
@Configuration
@ComponentScan(basePackageClasses = Stub.class)
public class AutoConfig {
}
