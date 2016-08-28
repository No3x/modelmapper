import org.apache.commons.beanutils.BeanUtils;

import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

/**
 * Created by No3x on 28.08.2016.
 */
public class Parser {

    public Model tableToModel(final List<String> input) {
        final Model model = new Model();
        final Map<String, String> properties = new HashMap<>();
        final List<String> header = extractHeader(input.get(0));
        // Skip 0th entry as it is the header
        for (int i = 1; i < input.size(); i++) {
            List<String> cells = extractCells(input.get(i));
            for (int j = 0; j < cells.size(); j++) {
                final String cell = cells.get(j);
                properties.put(header.get(j).toLowerCase(), cell);
            }
        }

        try {
            BeanUtils.populate(model, properties);
        } catch (IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
        }
        return model;
    }

    private List<String> extractHeader(final String input) {
        return Pattern.compile("[ ]+")
            .splitAsStream(input)
            .collect(Collectors.toList());
    }

    private List<String> extractCells(final String input) {
        return Pattern.compile("[ ]+")
            .splitAsStream(input)
            .map(s -> s.replaceAll("^\"|\"$", ""))
            .collect(Collectors.toList());
    }
}
