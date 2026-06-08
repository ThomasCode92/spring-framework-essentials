package accounts;

import config.AppConfig;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(AppConfig.class)
@EntityScan("rewards.internal")
public class RewardsConfig {

}