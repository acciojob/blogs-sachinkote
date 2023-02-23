package com.driver.services;

import com.driver.models.*;
import com.driver.repositories.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;

@Service
public class ImageService {

    @Autowired
    BlogRepository blogRepository2;
    @Autowired
    ImageRepository imageRepository2;

    public Image addImage(Integer blogId, String description, String dimensions){
        //add an image to the blog
    	Blog blog=blogRepository2.findById(blogId).get();
    	Image image=new Image();
    	image.setBlog(blog);
    	image.setDescription(description);
    	image.setDimensions(dimensions);
    	
    	
    	
    	 imageRepository2.save(image);
        return image;
    	
    }

    public void deleteImage(Integer id){
    imageRepository2.deleteById(id);
    	
    	
    	
    	
    }

    public int countImagesInScreen(Integer id, String screenDimensions) {
        //Find the number of images of given dimensions that can fit in a screen having `screenDimensions`
        int c=0;
    	Image image=imageRepository2.findById(id).get();
    	String imagesize=image.getDimensions();
    	String il=imagesize.substring(0,imagesize.indexOf("*"));
    	String ib=imagesize.substring(imagesize.indexOf("*")+1);
    	String sl=screenDimensions.substring(0,screenDimensions.indexOf("*"));
    	String sb=screenDimensions.substring(screenDimensions.indexOf("*")+1);
    	 c= (Integer.parseInt(sb)*Integer.parseInt(sl))/(Integer.parseInt(ib)*Integer.parseInt(il));
    	
    	return c;

    }
}
