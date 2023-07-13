public class PaintJob {
    // write your code here

    public static int getBucketCount(double width, double height, double areaPerBucket,int extraBuckets){
        if(width<=0||height<=0||areaPerBucket<=0||extraBuckets<0){
            return -1;
        }

        double buckets =((width*height)-(areaPerBucket*extraBuckets))/areaPerBucket;
        return (int)Math.ceil(buckets);

    }

    public static int getBucketCount(double width, double height, double areaPerBucket){
        if(width<=0||height<=0||areaPerBucket<=0){
            return -1;
        }
        double buckets =(width*height)/areaPerBucket;
        return (int)Math.ceil(buckets);
    }

    public static int getBucketCount(double area, double areaPerBucket){
        if(area<=0||areaPerBucket<=0){
            return -1;
        }
        double buckets =area/areaPerBucket;
        return (int)Math.ceil(buckets);
    }


}