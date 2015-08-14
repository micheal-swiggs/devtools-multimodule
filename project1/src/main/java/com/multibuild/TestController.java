package com.multibuild;

import org.springframework.web.bind.annotation.*;

import java.util.HashMap;

@RestController
public class TestController
{

    @RequestMapping(method=RequestMethod.GET, value="/simple")
    public Object simpleMethod()
    {
        HashMap<String,String> result = new HashMap<String, String>();
        result.put("hello", "worldly1");
        return result;
    }
}
