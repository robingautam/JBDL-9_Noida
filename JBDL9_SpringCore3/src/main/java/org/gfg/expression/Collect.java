package org.gfg.expression;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
public class Collect {

    public static Map<String,String> map = new HashMap<>();

    public static List<String> list = new ArrayList<>();

    static {
        map.put("robin","robin");
        list.add("robin@gmail.com");
    }

}
