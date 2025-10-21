package Uppgift_02;

public class Duck {
    private String url;
    private String message;

    public Duck(){}

    public Duck(String url, String message){
        this.url = url;
        this.message = message;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String image) {
        this.message = message;
    }
}
