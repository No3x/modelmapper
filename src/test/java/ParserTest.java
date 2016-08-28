import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.instanceOf;
import static org.junit.Assert.assertThat;

/**
 * Created by No3x on 28.08.2016.
 */
public class ParserTest {

    private Parser parser;
    private List<String> sampleData;
    private Model model;

    public ParserTest() {
        parser = new Parser();
        sampleData = new ArrayList<>();
        sampleData.add("TEAM SPIELE    TORE   GEGENTORE    SIEGE    NIEDERLAGEN    TEAM_ID");
        sampleData.add("\"ALU\"    \"3\"    \"33\"    \"3\"    \"1\"    \"0\"    \"1\"");
    }

    @Before
    public void setUp() throws Exception {
        model = parser.tableToModel(sampleData);
    }

    @Test
    public void tableToModelAttributesAreSet() throws Exception {
        final Model model = Model.builder()
                                 .team("ALU")
                                 .spiele(3)
                                 .tore(33)
                                 .gegentore(3)
                                 .siege(1)
                                 .niederlagen(0)
                                 .team_id(1)
                                 .build();
        assertThat("Both models should be equal", this.model, equalTo(model) );
    }

    @Test
    public void tableToModelAttributeAccess() throws Exception {
        assertThat("The team attribute should be ALU", model.getTeam(), equalTo("ALU"));
    }

    @Test
    public void tableToModelAttributeTypeString() throws Exception {
        assertThat("The team attribute should be of type String", model.getTeam(), instanceOf(String.class));
    }

    @Test
    public void tableToModelAttributeTypeInteger() throws Exception {
        assertThat("The niederlagen attribute should be of type Integer", model.getNiederlagen(), instanceOf(Integer.class));
    }

}
