package com.example.demoweb.service;

import com.example.demoweb.model.Post;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.Date;

@Service
public class PostService {
    ArrayList<Post> posts = new ArrayList<Post>();

    public PostService(){
        posts.add(new Post("MEOW"));
        posts.add(new Post("HA T'FU"));
        posts.add(new Post("PFFF"));
    }

    public ArrayList<Post> listAllPosts(){
        return posts;
    }

    public void create(String text) {
        posts.add(new Post(text, new Date()));
    }
}
