package com.example.mytravelagency;

import java.io.Serializable;
import java.util.List;

public class City implements Serializable {

    private List<Integer> galleryImages;
    private int mainImage;
    private String cityName;
    private String aboutDescription;
    private String top5;

    public City(int mainImage, List<Integer> galleryImages, String cityName, String aboutDescription,
                String top5) {
        this.mainImage = mainImage;
        this.galleryImages = galleryImages;
        this.cityName = cityName;
        this.aboutDescription = aboutDescription;
        this.top5 = top5;
    }

    public List<Integer> getGalleryImages() {
        return galleryImages;
    }

    public String getTop5() {
        return top5;
    }

    public String getAboutDescription() {
        return aboutDescription;
    }

    public int getImage() {
        return mainImage;
    }

    public String getCityName() {
        return cityName;
    }
}
