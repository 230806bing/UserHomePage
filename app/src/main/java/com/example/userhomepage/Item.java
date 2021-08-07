package com.example.userhomepage;

public class Item {
    private Integer imageRes;
    private String imageUri;
    private String title;
    private String imgUri;
    private Integer imgRes;
    private String likes;
    private String stars;

    public Item(Integer imageRes, String title, Integer imgRes, String likes, String stars) {
        this.imageRes = imageRes;
        this.title = title;
        this.imgRes = imgRes;
        this.likes = likes;
        this.stars = stars;
    }

    public Integer getImageRes() {
        return imageRes;
    }

    public void setImageRes(Integer imageRes) {
        this.imageRes = imageRes;
    }

    public String getImageUri() {
        return imageUri;
    }

    public void setImageUri(String imageUri) {
        this.imageUri = imageUri;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getImgUri() {
        return imgUri;
    }

    public void setImgUri(String imgUri) {
        this.imgUri = imgUri;
    }

    public Integer getImgRes() {
        return imgRes;
    }

    public void setImgRes(Integer imgRes) {
        this.imgRes = imgRes;
    }

    public String getLikes() {
        return likes;
    }

    public void setLikes(String likes) {
        this.likes = likes;
    }

    public String getStars() {
        return stars;
    }

    public void setStars(String stars) {
        this.stars = stars;
    }
}
