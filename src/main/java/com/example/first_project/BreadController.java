package com.example.first_project;

import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/bread")
public class BreadController {

    private List<Bread> breadList = new ArrayList<Bread>();
    
    public BreadController() {
        breadList.add(new Bread("Baguette", 4));
        breadList.add(new Bread("Bagel", 7));
        breadList.add(new Bread("Grilled Cheese Sandwich", 15));
        breadList.add(new Bread("Pizza", 30));
    }

    @GetMapping
    public List<Bread> getBread() {
        return breadList;
    }

    @DeleteMapping("/{name}")
    public String deleteBread(@PathVariable String name) {
        Iterator<Bread> it = breadList.iterator();
        while (it.hasNext()) {
            if (it.next().getName().equals(name)) {
                it.remove();
                return "Bread " + name + " deleted.";
            }
        }
        return "Bread " + name + " not found.";
    }

    @PostMapping
    public String createBread(@RequestBody Bread newBread) {
        breadList.add(newBread);
        return "Bread " + newBread.getName() + " created.";
    }
}