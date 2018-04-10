package com.company.photoblogger;

import java.util.Date;

public class BlogPost extends BlogPostId{

    public String use_id, image_url, desc, image_thumb;
    public Date timestamp;



    public BlogPost() {}

    public BlogPost(String use_id, String image_url, String desc, String image_thumb, Date timestamp) {
        this.use_id = use_id;
        this.image_url = image_url;
        this.desc = desc;
        this.image_thumb = image_thumb;
        this.timestamp = timestamp;

    }

    public String getUse_id() {
        return use_id;
    }

    public void setUse_id(String use_id) {
        this.use_id = use_id;
    }

    public String getImage_url() {
        return image_url;
    }

    public void setImage_url(String image_url) {
        this.image_url = image_url;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getImage_thumb() {
        return image_thumb;
    }

    public void setImage_thumb(String image_thumb) {
        this.image_thumb = image_thumb;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }





}
//efndfkvhnfkvfdhnvkfvrffdfbfbgljlhguguguihihhhk

//Changesmljcld