package br.ufrn.imd;

import java.util.ArrayList;
import java.util.List;

public class ParserJson {
    public ParserJson() {
    }

List<String> parseAll = new ArrayList<String>();
    public List<String> parse(String json) {
        parseAll.add(json);
        return parseAll;
    }
}
