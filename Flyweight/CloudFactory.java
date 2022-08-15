package Flyweight;

import java.util.HashMap;

public class CloudFactory {
    private HashMap<CloudType, Cloud> cloudMap;

    public CloudFactory() {
        this.cloudMap = new HashMap<CloudType, Cloud>();
    }

    public Cloud getCloud(CloudType type) {
        Cloud cloud = (Cloud) this.cloudMap.get(type);

        if(cloud == null) {
            cloud = new Cloud(type, "cloud.png", 100, 100);
            this.cloudMap.put(type, cloud);
        }

        return cloud;
    }

    public int countClouds() {
        return this.cloudMap.size();
    }
}
