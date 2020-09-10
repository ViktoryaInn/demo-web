package com.example.demoweb.service;

import com.example.demoweb.model.Post;
import org.springframework.stereotype.Service;
import java.util.ArrayList;

@Service
public class PostService {
    public ArrayList<Post> listAllPosts(){
        ArrayList<Post> posts = new ArrayList<Post>();
        posts.add(new Post("MEOW"));
        posts.add(new Post("HA T'FU"));
        posts.add(new Post("PFFF"));
        return posts;
    }
}
