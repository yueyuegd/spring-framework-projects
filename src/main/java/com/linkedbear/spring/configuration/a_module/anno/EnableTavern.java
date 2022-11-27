package com.linkedbear.spring.configuration.a_module.anno;

import com.linkedbear.spring.configuration.a_module.BarImportSelector;
import com.linkedbear.spring.configuration.a_module.config.BartenderConfiguration;
import com.linkedbear.spring.configuration.a_module.component.Boss;
import com.linkedbear.spring.configuration.a_module.registrar.WaiterRegistrar;
import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Import({Boss.class, BartenderConfiguration.class, BarImportSelector.class, WaiterRegistrar.class})
public @interface EnableTavern {
}
