package Unit.DesignPatterns.Creational.Builder;

import DesignPatterns.Creational.Builder.Settlement;
import DesignPatterns.Creational.Builder.SettlementBuilder;
import DesignPatterns.Creational.Builder.SettlementDirector;
import DesignPatterns.Creational.Builder.SmallSettlementBuilder;
import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.hamcrest.MatcherAssert.assertThat;

public class SettlementBuilderTest {

    @Test
    public void buildSettlementWithSmallSettlementReturnsSettlement() {
        SettlementDirector settlementDirector = new SettlementDirector();
        SettlementBuilder settlementBuilder = new SmallSettlementBuilder();
        Settlement smallSettlement = settlementDirector.build(settlementBuilder);
        assertThat(smallSettlement, instanceOf(DesignPatterns.Creational.Builder.Settlement.class));
    }

}
