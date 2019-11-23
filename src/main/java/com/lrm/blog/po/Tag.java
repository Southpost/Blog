package com.lrm.blog.po;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @author 追梦
 */
@Entity
@Table(name = "t_tag")
public class Tag {
    @Id
    @GeneratedValue
    private Long id;
    private String name;

    /**
     * s实体类之间的关系
     */
    @ManyToMany(mappedBy = "tags")
    private List<Blog> blogs=new ArrayList<>();

    /**
     * 方法
     */
    public Tag() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Blog> getBlogs() {
        return blogs;
    }

    public void setBlogs(List<Blog> blogs) {
        this.blogs = blogs;
    }

    @Override
    public String toString() {
        return "Tag{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
