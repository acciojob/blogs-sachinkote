package com.driver.services;

import com.driver.models.Blog;
import com.driver.models.Image;
import com.driver.models.User;
import com.driver.repositories.BlogRepository;
import com.driver.repositories.ImageRepository;
import com.driver.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class BlogService {
    @Autowired
    BlogRepository blogRepository1;

    @Autowired
    UserRepository userRepository1;

    public Blog createAndReturnBlog(Integer userId, String title, String content) {
        //create a blog at the current time
    	Blog b=new Blog();
    	User user=userRepository1.findById(userId).get();
    	b.setContent(content);
    	b.setTitle(title);
    	List<Image> l=new ArrayList<>();
    	b.setImageList(l);
    	b.setDate(new Date());
    	
       List<Blog> lb=user.getBlogList();
       lb.add(b);
       user.setBlogList(lb);
       b.setUser(user);
    	return blogRepository1.save(b);

    }

    public void deleteBlog(int blogId){
        //delete blog and corresponding images
    	Blog b=blogRepository1.findById(blogId).get();
    	User user=b.getUser();
    	List<Blog> l=user.getBlogList();
    	l.remove(b);
    	user.setBlogList(l);
    	blogRepository1.deleteById(blogId);
    	
    }
}
