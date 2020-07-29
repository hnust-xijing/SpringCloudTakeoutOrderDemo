package com.shuang.controller;

import com.shuang.entity.Menu;
import com.shuang.feign.MenuFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/client")
public class ClientHandler {

    @Autowired
    private MenuFeign menuFeign;

    @GetMapping("/client/{index}/{limit}")
    public List<Menu> findAll(@PathVariable("index") int index,@PathVariable("/limit") int limit){
        return menuFeign.findAll(index,limit);
    };
}
