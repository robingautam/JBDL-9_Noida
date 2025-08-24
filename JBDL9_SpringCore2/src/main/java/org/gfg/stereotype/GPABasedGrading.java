package org.gfg.stereotype;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class GPABasedGrading  implements GradingStrategy{
}
